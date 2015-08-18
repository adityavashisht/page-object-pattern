package com.automation.selenium.people.page.client;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by vashishta on 8/18/15.
 */
public class ActiveClientListPage {

    private WebDriver driver;


    By archived = By.id("archivedList");

    public ActiveClientListPage(WebDriver driver) {
        this.driver = driver;
    }

    public ArchivedClientListPage clickArchivedButton() {
        WebElement element = driver.findElement(archived);
        element.click();
        return new ArchivedClientListPage();
    }

}
