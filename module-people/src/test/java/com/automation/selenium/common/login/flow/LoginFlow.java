package com.automation.selenium.common.login.flow;

import com.automation.selenium.common.login.page.LoginPage;
import com.automation.selenium.people.page.client.ActiveClientListPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * Created by vashishta on 8/18/15.
 */
public class LoginFlow {

    @Test
    public void loginActiveClients() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://indasil.homedns.org/app/secure");
        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterCredentials("aditya@indasil.com", "carapace23");



    }
    @Test
    public void clickArchived() {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://indasil.homedns.org/app/secure");
        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterCredentials("aditya@indasil.com", "carapace23");

        ActiveClientListPage activePage = loginPage.activeClientListPage();
        activePage.clickArchivedButton();

    }

}
