package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenPage extends Utility {

    // Mouse Hover on Men Menu
    By menMenu = By.xpath("//a[@id='ui-id-5']//span[contains(text(),'Men')]");

    // Mouse Hover on Bottoms
    By bottoms = By.xpath("//a[@id='ui-id-18']//span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']");

    // By bottoms = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");

    //Click on Pants
    By clickOnPants= By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By selectFromDropDown=By.xpath ("//select[@id='sorter']");
    //Mouse Hover on product name ‘Cronus Yoga Pant’ and click on size 32
    By cronusYogaPant = By.xpath("//strong[@class='product name product-item-name']//a[@class='product-item-link']");

    // Click on Pants
    By CronusPant32 = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By blackColour=By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-LnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9tZW4vYm90dG9tcy1tZW4vcGFudHMtbWVuLmh0bWw_cHJvZHVjdF9saXN0X29yZGVyPW5hbWU%2C/product/880/']//button[@class='action tocart primary'] ");
    By CronusBlackColour = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By buttonAddToCart = By.xpath("//form[@action='https://magento.softwaretestingboard.com/checkout/cart/add/uenc/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9tZW4vYm90dG9tcy1tZW4vcGFudHMtbWVuLmh0bWw_cHJvZHVjdF9saXN0X29yZGVyPW5hbWU%2C/product/880/']//button[@class='action tocart primary']");
    By addToCart = By.xpath("(//span[text() ='Add to Cart'])[1]");
    By productName =By.xpath("//div[@data-product-id='880']");
    By shoppingCart = By.xpath("//div[@class='page messages']//a[contains(text(),'shopping cart')]");
    By selectByProductName = By.xpath("//select[@id='sorter']");
    By successMessage = By.xpath("//div[@class='message-success success message']");
    By verifyShoppingCartText = By.xpath("//main[@id='maincontent']//h1");
    By verifyProductName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By verifyProductSize = By.xpath("//dd[contains(text(),'32')]");
    By verifyProductColour = By.xpath("//dd[contains(text(),'Black')]");

    public void mouseHoverOnMenMenu(){
        mouseHoverToElement(menMenu);
    }
    public void mouseHoverOnBottoms(){
        mouseHoverToElement(bottoms);
    }
    public void clickOnPants(){
        clickOnElement(clickOnPants);
    }
    // Mouse Hover on product name‘Cronus Yoga Pant’ and click on size 32.
    public void cronusYogaPantAndClickOnSize32(){
        mouseHoverToElementAndClick(cronusYogaPant);
    }
//Mouse Hover on product name‘Cronus Yoga Pant’ and click on colour Black.

    public void cronusYogaPantAndColourBlack(){

        mouseHoverToElementAndClick(blackColour);
    }
    public void mouseHoverOnProductName(){
        mouseHoverToElementAndClick(productName);
    }
    public void addToCart(){
        clickOnElement(addToCart);
        //mouseHoverToElementAndClick(addToCart,"Add to Cart");
        List<WebElement> multiElement = driver.findElements(By.xpath("//div[@class='message-success success message']"));

        System.out.println("Total Items are: " + multiElement.size());
        for (WebElement list : multiElement) {
            String name1 = list.getText();
            System.out.println(name1);

        }

    }
    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCart);
    }

    public void sortByProductName() {
       selectByVisibleTextFromDropDown(selectByProductName, "Product Name");
    }

    public void clickOnCronousSize32() {
        clickOnElement(CronusPant32);
    }
    public void clickOnCronousBlack() {
        clickOnElement(CronusBlackColour);
    }

    public void mouseHoverOnCronusYogaAndClickAddCart() {
        mouseHoverToElement(productName);
        clickOnElement(buttonAddToCart);
    }

    public String getSuccessMsgText() {
        return getTextFromElement(successMessage);
    }

    public String getShoppingCartText() {
        return getTextFromElement(verifyShoppingCartText);
    }

    public String getProductName() {
        return getTextFromElement(verifyProductName);
    }

    public String getProductSize() {
        return getTextFromElement(verifyProductSize);
    }

    public String getProductColour() {
        return getTextFromElement(verifyProductColour);
    }
}
