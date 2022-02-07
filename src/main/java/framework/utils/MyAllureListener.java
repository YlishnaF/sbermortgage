package framework.utils;

import framework.managers.DriverManager;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class MyAllureListener {

//    @Override
//    public void afterTestExecution(ExtensionContext extensionContext) throws Exception {
//        if(extensionContext.getExecutionException().isPresent()){
//            Allure.getLifecycle().addAttachment("Screen", "image/png", "png", getScreen());
//
//        }
//    }
//
//    public byte[] getScreen(){
//        return ((TakesScreenshot) DriverManager.getInstance().getDriver()).getScreenshotAs(OutputType.BYTES);
//
//    }
}
