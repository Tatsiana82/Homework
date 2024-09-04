import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;
import io.qameta.allure.Epic;


public class FormOfPaymentTest {

    private WebDriver browser;
    private WebDriverWait browserWait;
    private MainPage mainPage;
    private PaymentPage paymentPage;


    @Epic("Форма оплаты")
    @BeforeEach
    public void initialize() {
        WebDriverManager.chromedriver().setup();
        browser = new ChromeDriver();
        browserWait = new WebDriverWait(browser, Duration.ofSeconds(8));
        browser.manage().window().maximize();
        browser.get("https://mts.by");

        mainPage = new MainPage(browser);
        paymentPage = new PaymentPage(browser);
    }

    @Test
    public void testVerifySiteTitle() {
        mainPage.confirmCookies();

        String expectedTitle = "МТС – мобильный оператор в Беларуси";
        String actualTitle = browser.getTitle();
        assertEquals(expectedTitle, actualTitle, "Title is wrong");
    }

    @Test
    public void testCheckTitleUslugi() {
        mainPage.confirmCookies();

        mainPage.seeDropdown();
        mainPage.chooseServiceOption("Услуги связи");

        String phonesInput = paymentPage.getPhonePlaceholderText();
        String sumInput = paymentPage.getSumPlaceholderText();
        String emailInput = paymentPage.getEmailPlaceholderText();

        assertEquals("Номер телефона", phonesInput, "Placeholders text is wrong");
        assertEquals("Сумма", sumInput, "Placeholders text is wrong");
        assertEquals("E-mail для отправки чека", emailInput, "Placeholders text is wrong");
    }

    @Test
    public void testOperationForm() {
        mainPage.confirmCookies();
        mainPage.seeDropdown();
        mainPage.chooseServiceOption("Услуги связи");

        String phone = "297777777";
        String amount = "10";

        paymentPage.populatePaymentForm(phone, amount, "testMTS@gmail.com");
        paymentPage.clickPayButton();

        assertTrue(paymentPage.isConfirmationWindowVisible(), "Window is not visible");

        paymentPage.switchToPaymentFrame();

        assertEquals(formatPhone(phone), paymentPage.getDisplayPhone(), "Number is wrong");
        assertEquals(formatAmount(amount), paymentPage.getDisplayedAmount(), "Amount is wrong");
        assertTrue(paymentPage.getPaymentButtonText().contains(amount), "Text is wrong");
        assertTrue(paymentPage.isGooglePayVisible(), "Button is not visible");
        assertTrue(paymentPage.isYandexPayVisible(), "Button is not visible");

        paymentPage.switchToDefaultView();
    }

    @AfterEach
    public void cleanUp() {
        if (browser != null) {
            browser.quit();
        }
    }

    private String formatPhone(String phone) {
        return "Оплата: Услуги связи Номер:375" + phone;
    }

    private String formatAmount(String amount) {
        if (!amount.contains(".")) {
            amount += ".00";
        }
        return amount + " BYN";
    }
}