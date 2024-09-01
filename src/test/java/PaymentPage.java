import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PaymentPage {
    private WebDriver browser;
    private WebDriverWait browserWait;

    private By phonesInput = By.id("connection-phone");
    private By  sumInput = By.id("connection-sum");
    private By emailInput = By.id("connection-email");
    private By payButton = By.cssSelector("#pay-connection button");

    private By phonesPlaceholder = By.id("connection-phone");
    private By sumPlaceholder = By.id("connection-sum");
    private By emailPlaceholder = By.id("connection-email");

    private By paymentIFrame = By.xpath("//iframe[@class='bepaid-iframe']");

    private By displayPhone = By.cssSelector(".pay-description__text span");
    private By displayedAmount = By.cssSelector(".pay-description__cost span");
    private By confirmationButton = By.cssSelector(".colored");

    private By googlePay = By.id("gpay-button-online-api-id");
    private By yandexPay = By.id("yandex-button");

    public PaymentPage(WebDriver browser) {
        this.browser = browser;
        this.browserWait = new WebDriverWait(browser, Duration.ofSeconds(8));
    }

    public void populatePaymentForm(String phone, String sum, String email) {
        browserWait.until(ExpectedConditions.visibilityOfElementLocated(phonesInput)).sendKeys(phone);
        browserWait.until(ExpectedConditions.visibilityOfElementLocated(sumInput)).sendKeys(sum);
        browserWait.until(ExpectedConditions.visibilityOfElementLocated(emailInput)).sendKeys(email);
    }

    public void clickPayButton() {
        browserWait.until(ExpectedConditions.elementToBeClickable(payButton)).click();
    }

    public String getPhonePlaceholderText() {
        return browserWait.until(ExpectedConditions.visibilityOfElementLocated(phonesPlaceholder)).getAttribute("placeholder");
    }

    public String getSumPlaceholderText() {
        return browserWait.until(ExpectedConditions.visibilityOfElementLocated(sumPlaceholder)).getAttribute("placeholder");
    }

    public String getEmailPlaceholderText() {
        return browserWait.until(ExpectedConditions.visibilityOfElementLocated(emailPlaceholder)).getAttribute("placeholder");
    }

    public boolean isConfirmationWindowVisible() {
        return browserWait.until(ExpectedConditions.visibilityOfElementLocated(paymentIFrame)).isDisplayed();
    }

    public void switchToPaymentFrame() {
        browserWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentIFrame));
    }

    public void switchToDefaultView() {
        browser.switchTo().defaultContent();
    }

    public String getDisplayPhone() {
        return browserWait.until(ExpectedConditions.visibilityOfElementLocated(displayPhone)).getText();
    }

    public String getDisplayedAmount() {
        return browserWait.until(ExpectedConditions.visibilityOfElementLocated(displayedAmount)).getText();
    }

    public String getPaymentButtonText() {
        return browserWait.until(ExpectedConditions.visibilityOfElementLocated(confirmationButton)).getText();
    }

    public boolean isGooglePayVisible() {
        return browserWait.until(ExpectedConditions.visibilityOfElementLocated(googlePay)).isDisplayed();
    }

    public boolean isYandexPayVisible() {
        return browserWait.until(ExpectedConditions.visibilityOfElementLocated(yandexPay)).isDisplayed();
    }
}