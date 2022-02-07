package framework.steps;

import framework.managers.PageManager;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import org.openqa.selenium.WebElement;

public class SberStartPageStep {
    PageManager pageManager = PageManager.getInstance();

    @И("Закрытие окна cookies")
    public void closeCookie() {
        pageManager.getSberStartPage().closeCookie();

    }

    @И("^Выбрать в основном меню '(.*)'$")
    public void clickMainMenu(String s) {
        pageManager.getSberStartPage().clickMainMenu(s);
    }

    @И("^ Выбран в основном меню \"(.*)\"$")
    public void выбран_в_основном_меню(String string) {
        pageManager.getSberStartPage().clickMainMenu(string);
    }


    @И("Выбрать в sub меню {string}")
    public void clickSubMenu(String s){
        pageManager.getSberStartPage().clickSubMenu(s);

    }
}
