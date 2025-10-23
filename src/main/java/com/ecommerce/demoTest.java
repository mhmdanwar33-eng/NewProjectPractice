package com.ecommerce;

import com.ecommerce.pages.HomePage;
import com.ecommerce.utils.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demoTest {

    WebDriver driver;
    HomePage homePage;

    @BeforeMethod
    public void setUp() {
        // Start browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Initialize your Page Object with this driver ✅
        homePage = new HomePage(driver);

        //Assert.assertEquals(loginpage.loggedin(),"Welcome admin!");
    }

    @Test(priority = 1)
    public void demosignup() {
//        String username = "user" + System.currentTimeMillis();
//        String password = "test123";
//        TestData.registeredUsername = username;
//        TestData.registeredPassword = password;

//        System.out.println("✅ Submit button clicked successfully!");
        homePage.OpenHomePage();

    }

    @Test(priority = 2)
    public void demosignin() {
        homePage.OpenHomePage();

        Assert.assertEquals(homePage.pageTitle(), "Onnline Shopping & Wholesale Marketplace in MENA | Tradeling");

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}

