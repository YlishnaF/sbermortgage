package framework.steps;

import framework.managers.PageManager;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.ru.И;

public class MortgagePageStep {
    PageManager pageManager = PageManager.getInstance();
    @И("Заполняем информацию для расчета платежей:")
    public void fillData(DataTable dataTable){
        dataTable.asMap(String.class,String.class)
                .forEach((key, value)->
                {
                    try {
                        pageManager.getMortgagePage().fillData((String)key, (String)value);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
    }

    @И("Выключаем опуию страхование жизни")
    public void checkBoxLifeOff(){
        pageManager.getMortgagePage().checkBoxLifeOff();
    }
}
