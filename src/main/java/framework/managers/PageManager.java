package framework.managers;

import framework.pages.*;

public class PageManager {
    private static PageManager INSTANCE =null;

    private SberStartPage sberStartPage;
    private MortgagePage mortgagePage;
    private PageManager(){

    }
    public static PageManager getInstance(){
        if(INSTANCE==null){
            INSTANCE= new PageManager();
        }
        return INSTANCE;
    }

    public SberStartPage getSberStartPage(){
        if(sberStartPage==null){
            sberStartPage=new SberStartPage();
        }
        return sberStartPage;
    }

    public MortgagePage getMortgagePage(){
        if(mortgagePage==null){
            mortgagePage=new MortgagePage();
        }
        return mortgagePage;
    }
}
