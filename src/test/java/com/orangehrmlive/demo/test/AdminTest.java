package com.orangehrmlive.demo.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminTest extends BaseTest {
    public By adminLoc = By.xpath("//a//span[text()='Admin']");

    @Test
    public void testNavigateToAdminPage() {

        driver.findElement(adminLoc).click();
        String currentPageURL = driver.getCurrentUrl();
        Assert.assertTrue(currentPageURL.contains("admin"), "validate url contains Admin");

    }
}
