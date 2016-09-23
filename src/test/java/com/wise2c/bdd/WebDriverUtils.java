package com.wise2c.bdd;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class WebDriverUtils {

    private static WebDriver webDriver;
    private static final Logger LOGGER = LoggerFactory.getLogger(WebDriverUtils.class);

    public static synchronized WebDriver getCurrentDriver() {

        if (webDriver == null) {
            try {
                webDriver = new PhantomJSDriver();
            } finally {
                Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
            }
        }
        webDriver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        return webDriver;
    }

    private static class BrowserCleanup implements Runnable {
        public void run() {
            LOGGER.info("Closing the browser");
            close();
        }
    }

    public static void close() {
        try {
            webDriver.quit();
            webDriver = null;
            LOGGER.info("closing the browser");
        } catch (Exception e) {
            LOGGER.info("cannot close browser: unreachable browser");
        }
    }
}


