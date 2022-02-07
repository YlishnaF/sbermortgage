package framework.steps;

import framework.managers.InitManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    @Before
    public void before(){
        InitManager.initFramework();
    }

    @After
    public void after(){
        InitManager.quitFramework();
    }

}
