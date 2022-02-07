package framework.pages;

import framework.data.DataInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.Key;
import java.util.List;
import java.util.NoSuchElementException;

import static framework.data.DataInfo.FIST_CONTRIBUTION;

public class MortgagePage extends BasePage {

    @FindBy(xpath = "//div[@id=\"calculator-root\"]")
    private WebElement calculatorBlock;

    @FindBy(xpath = "//div[@class=\"dc-input__input-container-6-1-0\"]")
    private List<WebElement> numbers;

    @FindBy(xpath = "//iframe[@id=\"iFrameResizer0\"]")
    private WebElement iframe;

  @FindBy(xpath = "//span[text() = 'Страхование жизни и здоровья']/../..//input")
    private WebElement checkBoxLifeInsurance;

    @FindBy(xpath = "//div[text() = 'Услуги, снижающие ставку по кредиту']")
    private WebElement reducePriceBlock;

    //    public void fillData(DataInfo dataInfo) throws InterruptedException {
//        switchToIframe(iframe);
//        scrollToElement(calculatorBlock);
//     //   for (WebElement price : numbers) {
////            if (price.getText().contains("Стоимость")) {
////                WebElement webElement = price.findElement(By.xpath("./input[@value=\"3 000 000\"]"));
////                for (int i = 0; i < 7; i++) {
////                    webElement.sendKeys(Keys.BACK_SPACE);
////                }
////                webElement.sendKeys("5180000");
////            //    driverManager.getDriver().switchTo().defaultContent();
////            } else if (price.getText().contains("Первоначальный взнос")) {
////                WebElement webElement = price.findElement(By.xpath("./input[@value=\"600 000\"]"));
////                for (int i = 0; i < 7; i++) {
////                    webElement.sendKeys(Keys.BACK_SPACE);
////                }
////                webElement.sendKeys("3058000");
////            } else if(price.getText().contains("Срок кредита")){
////                scrollToElement(numbers.get(0));
////                WebElement webElement = price.findElement(By.xpath("./input[@value=\"30\"]"));
////                for (int i = 0; i < 3; i++) {
////                    webElement.sendKeys(Keys.BACK_SPACE);
////                }
////                webElement.sendKeys("30");
////            }
//            switch (dataInfo) {
//                case FULL_PRICE:
//                    WebElement fullPrice = numbers.get(0).findElement(By.xpath("./input[@value=\"3 000 000\"]"));
//                    System.out.println("прошло");
//                    for (int i = 0; i < 7; i++) {
//                        fullPrice.sendKeys(Keys.BACK_SPACE);
//                    }
//                    fullPrice.sendKeys("5180000");
//
//                    driverManager.getDriver().switchTo().defaultContent();
//                    System.out.println("закончилось");
//                    break;
//                case FIST_CONTRIBUTION:
//                    Thread.sleep(1000);
//                    scrollToElement(numbers.get(0));
//                    WebElement webElement = numbers.get(1).findElement(By.xpath("./input[@value=\"600 000\"]"));
//                    for (int i = 0; i < 7; i++) {
//                        webElement.sendKeys(Keys.BACK_SPACE);
//                    }
//                    webElement.sendKeys("3058000");
//                    driverManager.getDriver().switchTo().defaultContent();
//                    break;
//
//                case DURATION:
//
//                    WebElement webElement1 = numbers.get(2).findElement(By.xpath("./input[@value=\"30\"]"));
//                    for (int i = 0; i < 3; i++) {
//                        webElement1.sendKeys(Keys.BACK_SPACE);
//                    }
//                    webElement1.sendKeys("30");
//                    driverManager.getDriver().switchTo().defaultContent();
//                    return;
//
//            }
//    }
    public void fillData(String key, String value) throws InterruptedException {
        switchToIframe(iframe);
        scrollToElement(calculatorBlock);
        switch (key) {
            case "Стоимость недвижимости":
                WebElement fullPrice = numbers.get(0).findElement(By.xpath("./input[@value=\"3 000 000\"]"));
                for (int i = 0; i < 7; i++) {
                    fullPrice.sendKeys(Keys.BACK_SPACE);
                }
                fullPrice.sendKeys(value);
                driverManager.getDriver().switchTo().defaultContent();
                break;
            case "Первоначальный взнос":
                Thread.sleep(1000);
                scrollToElement(numbers.get(0));
                WebElement webElement = numbers.get(1).findElement(By.xpath("./input[@value=\"600 000\"]"));
                for (int i = 0; i < 7; i++) {
                    webElement.sendKeys(Keys.BACK_SPACE);
                }
                webElement.sendKeys(value);
                driverManager.getDriver().switchTo().defaultContent();
                break;

            case "Срок кредита":
                WebElement years = numbers.get(2).findElement(By.xpath("./input[@value=\"30\"]"));
                for (int i = 0; i < 3; i++) {
                    years.sendKeys(Keys.BACK_SPACE);
                }
                years.sendKeys("30");
                driverManager.getDriver().switchTo().defaultContent();
                break;
        }
    }

    public void checkBoxLifeOff(){
        switchToIframe(iframe);
        scrollToElement(reducePriceBlock);
        checkBoxLifeInsurance.click();
    }
}
