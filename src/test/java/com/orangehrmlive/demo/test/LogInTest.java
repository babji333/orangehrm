package com.orangehrmlive.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogInTest extends BaseTest{


    public By dashBoard = By.xpath("//h6[text()='Dashboard']");
    public By Invalidcredentials = By.xpath("//p[text()= 'Invalid credentials']");


    @Test
    public void testLogInPos() {

        login("Admin", "admin123");
        boolean isDashBoardDisplayed = driver.findElement(dashBoard).isDisplayed();
        Assert.assertTrue(isDashBoardDisplayed, "validate dashboard header dispalyed");

    }

    @Test
    public void testLogInNeg() {

        login("Admin", "admin12345");
        boolean isInvalidDisplayed = driver.findElement(Invalidcredentials).isDisplayed();
        Assert.assertTrue(isInvalidDisplayed, "validate invalidcredentials dispalyed");

    }


}
