package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class WomenPage extends Utility {

   // Mouse Hover on Women Menu
   By womenMenu = By.xpath("//a[@id='ui-id-4']//span[contains(text(),'Women')]");
   // Mouse Hover on Tops
   By tops = By.linkText("Tops");
   // Click on Jackets
   By clickOnJackets = By.linkText("Jackets");
   By selectByFilterProductName = By.xpath("//div[2]//div[3]//select[1]");
   By selectByFilterPrice= By.xpath("//select[@id='sorter']");

   public void mouseHoverOnWomen() {
      mouseHoverToElement(womenMenu);
   }
   public void mouseHoverOnTop() {
      mouseHoverToElement(tops);
   }
   public void clickOnJacket(){
      clickOnElement(clickOnJackets);
   }
   public void selectFiletrFromDropDownList() {
      clickOnElement(selectByFilterProductName);
   }
   public  void setSelectByFilterPrice(){
      selectByValueFromDropDown(selectByFilterPrice,"price");
   }
}

