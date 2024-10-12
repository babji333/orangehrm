package com.orangehrmlive.demo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    public By username = By.name("username");
    public By password = By.name("password");
    public By loginButton = By.tagName("button");

    public WebDriver driver;
    private String baseurl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

    @BeforeMethod(alwaysRun = true)
    public void beforetestmethod() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseurl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod(alwaysRun = true)
    public void aftertestmethod() {
        driver.quit();
    }


    public void login(String usernameVal, String passwordVal) {
        driver.findElement(username).sendKeys("usernameVal");
        driver.findElement(password).sendKeys("passwordVal");
        driver.findElement(loginButton).click();
    }
}
