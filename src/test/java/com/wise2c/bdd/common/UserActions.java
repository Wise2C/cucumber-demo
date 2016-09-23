package com.wise2c.bdd.common;


import com.wise2c.bdd.WebDriverUtils;
import org.openqa.selenium.WebDriver;

public class UserActions {

    private static final WebDriver webDriver = WebDriverUtils.getCurrentDriver();

    public static void openBrowserAndGoToPage() throws InterruptedException {
        webDriver.get("http://baidu.com/");
        Thread.sleep(3000);
    }
}
