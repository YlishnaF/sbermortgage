package framework.base;

import org.junit.jupiter.api.Test;

public class SberTest extends BaseClass {
    @Test
    public void test() throws InterruptedException {
        pageManager.getSberStartPage().closeCookie();
        pageManager.getSberStartPage().clickMainMenu("Ипотека");
        pageManager.getSberStartPage().
                clickSubMenu("Ипотека на готовое жильё");
        pageManager.getMortgagePage().fillData("Стоимость недвижимости","5180000");
        pageManager.getMortgagePage().fillData("Первоначальный взнос", "3058000");
        pageManager.getMortgagePage().fillData("Срок кредита", "30");
        pageManager.getMortgagePage().checkBoxLifeOff();

        //        pageManager.getMortgagePage().fillData(DataInfo.FULL_PRICE);
//        pageManager.getMortgagePage().fillData(DataInfo.FIST_CONTRIBUTION);
//        pageManager.getMortgagePage().fillData(DataInfo.DURATION);


    }
}
