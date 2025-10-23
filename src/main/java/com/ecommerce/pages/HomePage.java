package com.ecommerce.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;

    By categorieslist = By.cssSelector("#nav-hamburger-menu");
    By computerCategory = By.cssSelector("a.hmenu-item[data-menu-id='6']");
    By PrintersandInk = By.xpath("//*[text()=\"Printers & Ink\"]");

    By Epson = By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[5]/ul/li[3]/span/a/span");
    By itemstotalcount = By.xpath("//h2[@class=\"a-size-base a-spacing-small a-spacing-top-small a-text-normal\"]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void OpenHomePage() {
        driver.navigate().to("https://www.amazon.ae/ref=nav_logo");
    }

    public void opencategories() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement category = wait.until(
                ExpectedConditions.visibilityOfElementLocated(categorieslist));
        category.click();
    }

    public void NavigateToComputers() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement Ccategory = wait.until(
                ExpectedConditions.elementToBeClickable (computerCategory));
        Ccategory.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //driver.findElement(computerCategory).click();

    }
    public void NavigateToEpson() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement PPrintersandInk = wait.until(
                ExpectedConditions.elementToBeClickable (PrintersandInk));
        PPrintersandInk.click();
        //driver.findElement(PrintersandInk).click();
        WebElement EEpson = wait.until(
                ExpectedConditions.elementToBeClickable(Epson));
        PPrintersandInk.click();
        EEpson.click();
    }


        public String itemsnumber() {
        return driver.findElement(itemstotalcount).getText();

    }


}
