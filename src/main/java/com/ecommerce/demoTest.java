package com.ecommerce;

import com.ecommerce.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demoTest {

    WebDriver driver;
    HomePage homePage;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new HomePage(driver);

    }

    @Test(priority = 1)
    public void demosignup() {

        homePage.OpenHomePage();
        homePage.opencategories();
        homePage.NavigateToComputers();
        homePage.NavigateToEpson();
        homePage.itemsnumber();

    }

//    @Test(priority = 2)
//    public void demosignin() {
//        homePage.OpenHomePage();
//
//        Assert.assertEquals(homePage.pageTitle(), "Onnline Shopping & Wholesale Marketplace in MENA | Tradeling");
//
//    }

    @AfterMethod
    public void tearDown() {
       driver.quit();
    }
}

