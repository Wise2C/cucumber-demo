package com.zhaopin.advertisement.bdd.common;


import com.zhaopin.advertisement.bdd.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserActions {

    private static final WebDriver webDriver = WebDriverUtils.getCurrentDriver();

    public static void openBrowserAndGoToPage() throws InterruptedException {
        webDriver.get("http://baidu.com/");
        Thread.sleep(3000);
    }
}
