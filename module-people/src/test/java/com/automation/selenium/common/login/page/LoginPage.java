package com.automation.selenium.common.login.page;

import com.automation.selenium.people.page.client.ActiveClientListPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by vashishta on 8/18/15.
 */
public class LoginPage {

    private WebDriver webDriver;

    public LoginPage(WebDriver driver) {
        webDriver = driver;
    }

    By username = By.name("j_username");
    By password = By.name("j_password");
    By button = By.id("signIn");

    /**
     * @param user
     * @param pax
     */
    public void enterCredentials(String user, String pax) {

        WebElement userId = webDriver.findElement(username);
        userId.clear();
        userId.sendKeys(user);

        WebElement pass = webDriver.findElement(password);
        pass.clear();
        pass.sendKeys(pax);

        WebElement loginButton = webDriver.findElement(button);
        loginButton.click();

    }

    public ActiveClientListPage activeClientListPage() {
        webDriver.get("http://indasil.homedns.org/app/people/company/list");
        return new ActiveClientListPage(webDriver);
    }
}
