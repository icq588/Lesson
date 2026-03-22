package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class MtsOnlinePaymentTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().driverVersion("146.0.7680.154").setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://www.mts.by/");
    }

    @Test
    public void testBlockTitle() {
        WebElement blockTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class,'online-payment')]//h2")));
        Assert.assertEquals(blockTitle.getText().trim(), "Онлайн пополнение без комиссии",
                "Название блока не совпадает");
    }

    @Test
    public void testPaymentLogosPresent() {
        List<WebElement> logos = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                By.xpath("//div[contains(@class,'online-payment')]//img[contains(@class,'logo')]")));
        Assert.assertTrue(logos.size() > 0, "Логотипы платёжных систем отсутствуют");
    }

    @Test
    public void testMoreInfoLink() {
        WebElement moreInfoLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[contains(@class,'online-payment')]//a[text()='Подробнее о сервисе']")));
        Assert.assertTrue(moreInfoLink.isDisplayed(), "Ссылка 'Подробнее о сервисе' отсутствует");
        moreInfoLink.click();


        wait.until(ExpectedConditions.urlContains("online-topup"));
        Assert.assertTrue(driver.getCurrentUrl().contains("online-topup"), "Ссылка ведёт не на ожидаемую страницу");

        driver.navigate().back();
    }

    @Test
    public void testContinueButtonWithService() {
        WebElement serviceRadio = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//input[@value='mobile']")));
        serviceRadio.click();

        WebElement phoneField = driver.findElement(By.xpath("//input[@name='phone']"));
        phoneField.sendKeys("297777777");

        WebElement continueButton = driver.findElement(By.xpath("//button[text()='Продолжить']"));
        continueButton.click();

        WebElement paymentForm = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[contains(@class,'payment-form')]")));
        Assert.assertTrue(paymentForm.isDisplayed(), "Форма оплаты не появилась после нажатия 'Продолжить'");
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}