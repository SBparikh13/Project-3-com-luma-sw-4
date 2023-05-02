package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.WomenPage;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WomenTest extends BaseTest {

    WomenPage womenPage = new WomenPage();

    @Test
    public void verifyTheSortByProductNameFilter() {
        womenPage.mouseHoverOnWomen();
        womenPage.mouseHoverOnTop();
        womenPage.clickOnJacket();
        womenPage.selectFiletrFromDropDownList();

    }

    @Test
    public void verifyTheSortByPriceFilter() {
        womenPage.mouseHoverOnWomen();
        womenPage.mouseHoverOnTop();
        womenPage.clickOnJacket();
        womenPage.setSelectByFilterPrice();
//        List<WebElement> multiElement = driver.findElements(By.xpath("//span[@class='price-wrapper ']"));
//        System.out.println("Total Items are: " + multiElement.size());
//        double tmpValue = 0;
//        for (WebElement list : multiElement) {
//            String name1 = list.getText().replaceAll("[$]", "");
//            System.out.println(name1);
//            double itemValue = Double.valueOf(name1);
//        }

        List<WebElement> listOrder = driver.findElements(By.xpath("//div[2]//div[3]//select[1]/option[3]"));
        ArrayList<String> originalList = new ArrayList<>();
        for (WebElement e : listOrder) {
            originalList.add(e.getText());
        }
        System.out.println(originalList);
        Collections.sort(originalList);
        System.out.println(originalList);
        //Select Sort By filter “Price”
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='sorter']"), "Price");

        // Verify the products  displayed in descending  order
        List<WebElement> listSorted = driver.findElements(By.xpath("//div[2]//div[3]//select[1]/option[3]"));
        ArrayList<String> listAfterSorting = new ArrayList<>();
        for (WebElement e : listSorted) {
            listAfterSorting.add(e.getText());
        }
        System.out.println(listAfterSorting);

        Assert.assertEquals(originalList, listAfterSorting);

    }
}
