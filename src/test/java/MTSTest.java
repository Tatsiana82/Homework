import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.time.Duration;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class MTSTest {
    public static WebDriver driver;

    @BeforeClass
    public void setUp() {

        driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//div[@class='cookie__buttons']/button[@id='cookie-agree']")));
        button.click();
    }

    @Test(description = "Онлайн пополнение без комиссии")
    public void blockNameTest() {
        String expectedText = "Онлайн пополнение без комиссии";
        String actualText = driver.findElement(By.xpath("//div[@class='pay__wrapper']/h2"))
                .getText().replaceAll("\\n", " ");
        assertEquals(expectedText, actualText, "Название блока неверное");
    }

    @Test(description = "Наличие логотипов платежных систем")
    public void logoTest() {
        List<WebElement> images = driver.findElements(By.cssSelector("[class=\"pay__partners\"] img"));

        int expectedNumberOfLogo = 5;
        assertEquals(expectedNumberOfLogo, images.size(),
                "Количество логотипов платёжных систем " + expectedNumberOfLogo);

        for (WebElement image : images) {
            String url = image.getAttribute("src");
            assertTrue(url != null && !url.isEmpty(),"URL не должен быть пустым");
            double height = image.getSize().height;
            double width = image.getSize().width;
            assertTrue(height > 0, "Height " + url + " is more 0");
            assertTrue(width > 0, "Width " + url + " is more 0");
        }
    }

    @Test(description = "Проверка ссылки 'Подробнее о сервисе'")
    public void linkTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement link = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Подробнее о сервисе")));
        String expectedUrl = link.getAttribute("href");
        link.click();

        wait.until(ExpectedConditions.urlContains(expectedUrl));
        String actualUrl = driver.getCurrentUrl();
        assertTrue(actualUrl.contains(expectedUrl), "Ссылка переводит на другую страницу");
        driver.navigate().back();
    }

    @Test(description = "Тест кнопки 'Продолжить' ")
    public void submitButtonTest() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement buttonSubmit = wait.until(ExpectedConditions
                .elementToBeClickable(By.xpath("//form[@id='pay-connection']")));

        WebElement inputPhone = driver.findElement(By.id("connection-phone"));
        inputPhone.sendKeys("297777777");
        WebElement inputSum = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        inputSum.sendKeys("27");

        buttonSubmit.click();
    }

    @AfterClass
    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}