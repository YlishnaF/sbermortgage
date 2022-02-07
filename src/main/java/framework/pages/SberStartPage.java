package framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SberStartPage extends BasePage{

    @FindBy(xpath = "//button[@class =\"kitt-cookie-warning__close\"]")
    private WebElement cookieBtn;
    @FindBy(xpath = "//a[contains(@class, 'kitt-top-menu__link_first')]")
    private List<WebElement> mainMenu;

    @FindBy(xpath = "//a[contains(@class, 'kitt-top-menu__link')]")
    private List<WebElement> subMenu;


    public void closeCookie(){
        cookieBtn.click();
    }
    public void clickMainMenu(String s){
        for (WebElement menu: mainMenu) {
            if(menu.getText().contains(s)){
                menu.click();
            }
        }
    }

    public void clickSubMenu(String s){
        for (WebElement sub: subMenu) {
            if(sub.getText().contains(s)){
                waitElementToBeClicable(sub);
                sub.click();
                return;
            }

        }
    }


}
