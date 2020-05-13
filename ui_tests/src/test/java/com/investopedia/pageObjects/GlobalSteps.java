package com.investopedia.pageObjects;

import com.investopedia.TestsConfig;
import io.cucumber.java.en.When;

import static com.investopedia.CucumberHooks.getDriver;

/**
 * This class contains global (common) steps that do not belong to any specific page
 * As well as all the entry points into the system (open a url)
 */
public class GlobalSteps {
    @When("I open start page")
    public StartPage iOpenDashboardPage() {
//        Base URL is read from config.properties file located in resources folder. Key is base.url
        String baseUrl = TestsConfig.getConfig().getBaseUrl();
        getDriver().get(baseUrl);
        return new StartPage();
    }

    @When("sleep")
    public void sleep() throws InterruptedException {
        Thread.sleep(1000);
    }
}
