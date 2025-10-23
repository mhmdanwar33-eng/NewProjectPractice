package com.ecommerce.pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void OpenHomePage()
    {
        driver.navigate().to("https://www.tradeling.com/");
    }

    public String  pageTitle()
    {
       return driver.getTitle();
    }

}
