package framework.managers;

import framework.utils.PropsConst;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

public class DriverManager {
    private static DriverManager INSTANCE;
    private WebDriver driver;
    private TestPropManager propManager = TestPropManager.getInstance();

    private DriverManager() {

    }

    public static DriverManager getInstance(){
        if(INSTANCE==null){
            INSTANCE=new DriverManager();
        }
        return INSTANCE;
    }

    public WebDriver getDriver(){
        if(driver==null){
            initDriver();
        }
        return driver;
    }

    public void initDriver(){
        System.setProperty("webdriver.chrome.driver", propManager.getProperty(PropsConst.PATH_CHROM_DRIVER_WINDOWS));
                driver = new ChromeDriver();
//        switch (propManager.getProperty(PropsConst.TYPE_BROWSER)){
//            case ("chrome"):
//                System.setProperty("webdriver.chrome.driver", propManager.getProperty(PropsConst.PATH_CHROM_DRIVER_WINDOWS));
//                driver = new ChromeDriver();
//            case ("remote"):
//                DesiredCapabilities capabilities = new DesiredCapabilities();
//                capabilities.setBrowserName("chrome");
//                capabilities.setVersion("81.0");
//                capabilities.setCapability("enebleVNC", true);
//                capabilities.setCapability("enableVideo", false);
//                try{
//                    driver = new RemoteWebDriver(
//                            URI.create("http://selenoid.appline.ru:4444/wd/hub/").toURL(),
//                            capabilities);
//
//                } catch (MalformedURLException e){
//                    e.printStackTrace();
//                }
//        }

    }
    public void quitDriver(){
        if(driver!=null){
            driver.quit();
            driver=null;
        }
    }
}