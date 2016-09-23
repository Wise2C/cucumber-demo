package com.wise2c.bdd.steps;


import com.wise2c.bdd.WebDriverUtils;
import com.wise2c.bdd.common.UserActions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;

public class DemoSteps {

    private static WebDriver webDriver = WebDriverUtils.getCurrentDriver();
    private static Logger LOGGER = LoggerFactory.getLogger(DemoSteps.class);

    @Given("^作为一个访问网站的用户$")
    public void as_a_wise2ccom_website_guest() throws Throwable {
        UserActions.openBrowserAndGoToPage();
    }

    @When("^我将看到网页标题为百度$")
    public void when_i_see_home_page() throws Throwable {
        assertThat(webDriver.getTitle(), containsString("百度"));
    }

    @When("^搜索睿云智合")
    public void when_click_about_us_link() throws InterruptedException {
        webDriver.findElement(By.id("kw")).sendKeys("睿云智合");
        Thread.sleep(2000);
        webDriver.findElement(By.id("su")).click();
    }

    @Then("^我将看到关于搜索结果页面$")
    public void when_i_will_see_the_result_page() {
        assertThat(webDriver.getTitle(), containsString("睿云智合"));
        assertThat(webDriver.getPageSource(), containsString("百度为您找到相关结果"));
    }

    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {
            LOGGER.warn("something wrong with functional test");
            final byte[] screenshot = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");
            WebDriverUtils.close();
        }
    }
}
