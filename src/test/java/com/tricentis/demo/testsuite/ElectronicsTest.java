package com.tricentis.demo.testsuite;

import com.tricentis.demo.pages.ElectronicsMenuPage;
import com.tricentis.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends BaseTest {
    ElectronicsMenuPage electronicsPage = new ElectronicsMenuPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        // Step 1: Mouse Hover on Electronics Tab
        electronicsPage.hoverOnElectronicsTab();
        // Step 2: Mouse Hover and Click on Cell Phones
        electronicsPage.clickOnCellPhones();
        // Step 3: Verify the text "Cell Phones
        String expectedText = "Cell phones";
        String actualText = electronicsPage.getCellPhonesHeaderText();
        Assert.assertEquals(actualText, expectedText, "Cell phones page is not displayed!");
    }

    @Test
    public void verifyProductAddedSuccessfullyAndPlaceOrderSuccessfully() {
        // Navigate to Cell Phones
        electronicsPage.navigateToCellPhones();
        //      electronicsPage.verifyCellPhonesPage("Cell phones");
        // Select Smartphone and verify details
        electronicsPage.selectViewAsList();
        electronicsPage.selectSmartphone();
//        electronicsPage.verifySmartphoneDetails("Smartphone", "100.00");
        // Add to cart
        electronicsPage.addToCart("2");
        // Proceed to Checkout
        electronicsPage.proceedToCheckout();
        // Register User
        electronicsPage.registerUser("Prashant", "Patel", "233prashant@gmail.com", "123456");
        // Complete Order
        electronicsPage.completeOrder("Prashant K", "567583940349293", "07", "2027", "231");
        // Verify Order Completion
       //  electronicsPage.verifyOrderCompletion();
    }
}
