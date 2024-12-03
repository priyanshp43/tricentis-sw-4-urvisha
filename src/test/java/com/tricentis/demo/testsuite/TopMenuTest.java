package com.tricentis.demo.testsuite;

import com.tricentis.demo.pages.TopMenuPage;
import com.tricentis.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {



    //1.3 create the @Test method name verifyPageNavigation().
    // Use the selectMenu() method to select the Menu and click on it and verify the page navigation.

    @Test
    public void verifyPageNavigation () throws InterruptedException {
        Thread.sleep(3000);
        TopMenuPage topMenuPage = new TopMenuPage(driver);
        String menu = "Computers"; // Example menu item

        topMenuPage.selectMenu(menu);

        // Verify the page navigation (you can add validation logic based on the page URL or title)
        String expectedTitle = "Computers";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle), "Page navigation failed!");
    }

}
