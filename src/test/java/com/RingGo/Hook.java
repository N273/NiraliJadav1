package com.RingGo;

import com.RingGo.driver.driverManager;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook {
    private driverManager DriverManager = new driverManager();

    @Before
    public void setUp() {
        DriverManager.openBrowser();
    }

    @After
    public void tearDown() {
        DriverManager.closeBrowser();
    }
}
