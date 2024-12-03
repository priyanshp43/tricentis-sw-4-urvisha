package com.tricentis.demo.testsuite;

import com.tricentis.demo.pages.ComputerMenuPage;
import com.tricentis.demo.testbase.BaseTest;
import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ComputerTest extends BaseTest {

    Utility utility = new Utility();
    ComputerMenuPage computerMenuPage = new ComputerMenuPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() {
        // 1.1 Click on the COMPUTERS Menu.
        computerMenuPage.clickOnComputerMenu();
        //1.2 Click on Desktop
        computerMenuPage.clickOnDesktopMenu();
        //1.3 Select Sort By position "Name: Z to A"
        computerMenuPage.selectSortByDropDown();
        computerMenuPage.setSelectSortByZToA();
        // 1.4 Verify the Product will be arranged in Descending order
        computerMenuPage.verifyDescendingOrder();
        String actualText = driver.findElement(By.id("products-orderby")).getText();
        assertEquals(actualText, "Name: Z to A");
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessfully() throws InterruptedException {

        computerMenuPage.clickOnComputerMenu();
        computerMenuPage.clickOnDesktopMenu();
        computerMenuPage.selectSortByAtoZ();
        computerMenuPage.setAddToCartButton();
        //2.5 Verify the Text "Build your own computer"
        String expectedText = "Build your own computer";
        String actualText = computerMenuPage.verifyTextBuildYourOwnComputer();
        Assert.assertEquals(actualText, expectedText, "Product text does not match.");
        //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using the Select class
        computerMenuPage.setSelectProcessor(2);
        //2.7.Select "8GB [+$60.00]" using the Select class.
        computerMenuPage.setSelectRAM();
        //2.8 Select HDD radio button "400 GB [+$100.00]"
        computerMenuPage.setSelectHDD();
        //2.9 Select the OS radio button "Windows 10 [+$60.00]"
        computerMenuPage.setSelectOSRadioButton();
        //2.10 Check Two Checkboxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        //computerMenuPage.
        // 2.11 Verify the price "1200.00"
        String expectedPrice = "1200.00";
        String actualPrice = computerMenuPage.verifyPrice();
        Assert.assertEquals(actualPrice, expectedPrice);
        // 2.12 Click on the "Add to card" Button
        computerMenuPage.addToCart();
        // 2.13 Verify the Message "The product has been added to your shopping cart" on the Top green Bar
        // computerPage.verifyGreenBarMessage("The product has been added to your shopping cart");
        // 2.14 After that close the bar by clicking on the cross button.
        computerMenuPage.closeGreenBar();
        // 2.15 Then MouseHover on "Shopping cart" and click on the "Go to cart" button.
        computerMenuPage.proceedToShoppingCart();
        // 2.16 Verify the message "Shopping cart"
        // computerPage.verifycomputerPage("Shopping cart");
        // 2.17 Change the Qty to "2" and Click on "Update shopping cart"
        computerMenuPage.updateCartQuantity("2");
        //  2.19 click on the checkbox “I agree with the terms of service”
        computerMenuPage.agreeToTermsAndCheckout();
        Thread.sleep(2000);
        computerMenuPage.checkOutAsGuest();
        computerMenuPage.fillBillingDetails("Urvi", "P", "urvip123@gmail.com", "United Kingdom", "London", "South Harrow", "HA2 0LX", "077896546");
        computerMenuPage.proceedToShippingMethod();
        computerMenuPage.selectPaymentMethod();
        computerMenuPage.enterPaymentDetails("Master card", "Prashant P", "567583940349293",
                "08", "2029", "325");
        // computerPage.verifyOrderSummary("Credit Card", "Next Day Air", "2980.00");
        // Confirm the order
        computerMenuPage.confirmOrder();
        // Verify order confirmation
        // computerPage.verifyOrderConfirmation("Thank you", "Your order has been successfully processed!");
        // Finalize order and verify welcome message
        computerMenuPage.finalizeOrder();
        // computerPage.verifyWelcomeMessage("Welcome to our store");
    }
}


