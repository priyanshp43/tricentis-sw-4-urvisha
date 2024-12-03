package com.tricentis.demo.pages;


import com.tricentis.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ComputerMenuPage extends Utility {

    By computerMenu = By.linkText("Computers");
    By DesktopMenu = By.linkText("Desktops");
    By selectSortBy = By.id("products-orderby");
    By selectSortByZToA = By.xpath("//select[@id='products-orderby']");
    By verifyProductInDescendingOrder = By.id("products-orderby");

    By selectSortByAToZ = By.xpath("//select[@id='products-orderby']");
    By addToCartButton = By.xpath("//div[@class='page-body']//div[2]//div[1]//div[2]//div[3]//div[2]//input[1]");
    By verifyBuildYourOwnComputerText = By.xpath("//h1[normalize-space()='Build your own computer']");
    By selectProcessor = By.xpath("(//select[@id='product_attribute_16_6_5'])[1]");
    By selectRAM = By.xpath("//select[@id='product_attribute_16_6_5']");
    By selectHDD = By.xpath("//input[@id='product_attribute_16_3_6_19'])[1]");
    By selectOSRadioButton = By.xpath("//input[@id='product_attribute_16_4_7_21'])[1]");
    By microsoftOfficeCheckbox = By.xpath("//label[contains(text(), 'Microsoft Office [+$50.00]')]/preceding-sibling::input");
    By totalCommanderCheckbox = By.xpath(" //label[contains(text(),'Total Commander')]");
    By priceText = By.xpath("(//span[@class='price-value-16'])[1]");
    By addToCartButton1 = By.id("add-to-cart-button-16");
    By greenBarMessage = By.xpath("//p[@class='content']");
    By closeBarButton = By.xpath("//span[@title='Close']");
    By shoppingCartMenu = By.xpath("//span[normalize-space()='Shopping cart']");
    By goToCartButton = By.xpath("//input[@value='Go to cart']");
    By shoppingCartText = By.xpath("(//h1[normalize-space()='Shopping cart'])[1]");
    By quantityInput = By.cssSelector(".qty-input");
    By updateCartButton = By.name("updatecart");
    By totalPriceText = By.xpath("//span[@class='product-subtotal']");
    By agreeTermsCheckbox = By.xpath("//input[@id='termsofservice']");
    By checkoutButton = By.id("checkout");
    By welcomeText = By.tagName("h1");
    By checkoutAsGuestButton = By.xpath("//input[@value='Checkout as Guest']");
    By firstNameInput = By.id("BillingNewAddress_FirstName");
    By lastNameInput = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By emailInput = By.xpath("//input[@id='BillingNewAddress_Email']");
    By countryDropdown = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityInput = By.xpath("//input[@id='BillingNewAddress_City']");
    By addressInput = By.xpath("(//input[@id='BillingNewAddress_Address1'])[1]");
    By zipInput = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By phoneInput = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By billingContinueButton = By.xpath("//input[@onclick='Billing.save()']");
    By shippingContinueButton = By.xpath("//input[@onclick='Shipping.save()']");
    By nextDayAirRadioButton = By.xpath("//input[@id='shippingoption_1']");
    By shippingMethodContinueButton = By.xpath("(//input[@class='button-1 shipping-method-next-step-button'])[1]");
    By creditCardRadioButton = By.xpath("(//input[@id='paymentmethod_2'])[1]");
    By paymentMethodContinueButton = By.xpath("(//input[@class='button-1 payment-method-next-step-button'])[1]");
    By creditCardDropdown = By.xpath("//select[@id='CreditCardType']");
    By cardHolderNameInput = By.xpath("//input[@id='CardholderName']");
    By cardNumberInput = By.xpath("//input[@id='CardNumber']");
    By cardExpireMonthDropdown = By.xpath("//select[@id='ExpireMonth']");
    By cardExpireYearDropdown = By.xpath("//select[@id='ExpireYear']");
    By cardCodeInput = By.xpath("//input[@id='CardCode']");
    By paymentInfoContinueButton = By.xpath("(//input[@class='button-1 payment-info-next-step-button'])[1]");
    By paymentMethodText = By.xpath("//li[@class='payment-method']");
    By shippingMethodText = By.xpath("//li[@class='shipping-method']");
    By orderTotalPrice = By.xpath("//span[@class='product-price order-total']//strong[contains(text(),'2980.00')]");
    By confirmOrderButton = By.xpath("//input[@value='Confirm']");
    By thankYouText = By.xpath("//h1[normalize-space()='Thank you']");
    By orderSuccessMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By continueButton = By.xpath("//input[@value='Continue']");
    By welcomeToStoreText = By.xpath("//h2[normalize-space()='Welcome to our store']");


    public void clickOnComputerMenu() {
        clickOnElement(computerMenu);
    }

    public void clickOnDesktopMenu() {
        clickOnElement(DesktopMenu);
    }

    public void selectSortByDropDown() {
        clickOnElement(selectSortBy);
    }

    public void setSelectSortByZToA() {
        selectByVisibleTextFromDropDown(selectSortByZToA, "Name: Z to A");
    }

    public String verifyDescendingOrder() {
        return getTextFromElement(verifyProductInDescendingOrder);
    }

    public void selectSortByAtoZ() {
        clickOnElement(selectSortByAToZ);
    }

    public void setAddToCartButton() {
        clickOnElement(addToCartButton);
    }

    public String verifyTextBuildYourOwnComputer() {
        return getTextFromElement(verifyBuildYourOwnComputerText);
    }

    private void assertEquals(String actualText, String s) {
    }

    public void setSelectProcessor(int index) {
        selectByIndexFromDropDown(selectProcessor, index);
    }

    public void setSelectRAM() {
        selectByVisibleTextFromDropDown(selectRAM, "8GB [+$60.00]");
    }

    public void setSelectHDD() {
        selectByVisibleTextFromDropDown(selectHDD, "400 GB [+100.00]");
    }

    public void setSelectOSRadioButton() {
        mouseHoverToElementAndClick(selectOSRadioButton);
    }


//    public void selectCheckboxes(WebDriver driver) {
//        // Locate and check the "Microsoft Office [+$50.00]" checkbox
//        //WebElement microsoftOfficeCheckbox = driver.findElement(By.xpath("//label[contains(text(), 'Microsoft Office [+$50.00]')]/preceding-sibling::input"));
//        if (clickOnElement(microsoftOfficeCheckbox())) {
//            microsoftOfficeCheckbox.click();
//        }
//        // Locate and check the "Total Commander [+$5.00]" checkbox
//        //WebElement totalCommanderCheckbox = driver.findElement(By.xpath("//label[contains(text(), 'Total Commander [+$5.00]')]/preceding-sibling::input"));
//        if (!totalCommanderCheckbox.isSelected()) {
//            totalCommanderCheckbox.click();
//        }


    public String verifyPrice() {
        return getTextFromElement(priceText);
    }

    public void addToCart() {
        clickOnElement(addToCartButton);
    }

    public String verifyGreenBarMessage() {
        return getTextFromElement(greenBarMessage);
    }

    public void closeGreenBar() {
        clickOnElement(closeBarButton);
    }

    public void proceedToShoppingCart() {
        mouseHoverToElement(shoppingCartMenu);
        clickOnElement(goToCartButton);
    }

    public String verifyShoppingCartPage() {
        return getTextFromElement(shoppingCartText);
    }

    public void updateCartQuantity(String quantity) {
        WebElement qty = driver.findElement(quantityInput);
        qty.clear();
        qty.sendKeys(quantity);
        clickOnElement(updateCartButton);
    }

    public void agreeToTermsAndCheckout() {
        clickOnElement(agreeTermsCheckbox);
        clickOnElement(checkoutButton);
    }

    public void checkOutAsGuest() {
        clickOnElement(checkoutAsGuestButton);
    }

    public void fillBillingDetails(String firstName, String lastName, String email, String country, String
            city, String address, String zip, String phone) {
        sendTextToElement(firstNameInput, firstName);
        sendTextToElement(lastNameInput, lastName);
        sendTextToElement(emailInput, email);
        selectByVisibleTextFromDropDown(countryDropdown, country);
        sendTextToElement(cityInput, city);
        sendTextToElement(addressInput, address);
        sendTextToElement(zipInput, zip);
        sendTextToElement(phoneInput, phone);
        clickOnElement(billingContinueButton);
    }

    public void proceedToShippingMethod() {
        clickOnElement(shippingContinueButton);
        clickOnElement(nextDayAirRadioButton);
        clickOnElement(shippingMethodContinueButton);
    }

    public void selectPaymentMethod() {
        clickOnElement(creditCardRadioButton);
        clickOnElement(paymentMethodContinueButton);
    }

    public void enterPaymentDetails(String cardType, String cardHolderName, String cardNumber, String
            expireMonth, String expireYear, String cardCode) {
        selectByVisibleTextFromDropDown(creditCardDropdown, cardType);
        sendTextToElement(cardHolderNameInput, cardHolderName);
        sendTextToElement(cardNumberInput, cardNumber);
        selectByVisibleTextFromDropDown(cardExpireMonthDropdown, expireMonth);
        selectByVisibleTextFromDropDown(cardExpireYearDropdown, expireYear);
        sendTextToElement(cardCodeInput, cardCode);
        clickOnElement(paymentInfoContinueButton);
    }

    //    public void verifyOrderSummary(String expectedPaymentMethod, String expectedShippingMethod, String expectedTotal) {
//        assertMethod(expectedPaymentMethod, paymentMethodText);
//        assertMethod(expectedShippingMethod, shippingMethodText);
//        assertMethod(expectedTotal, orderTotalPrice);
//    }

    public void confirmOrder() {
        clickOnElement(confirmOrderButton);
    }

//    public void verifyOrderConfirmation(String expectedThankYouMessage, String expectedSuccessMessage) {
//        assertMethod(expectedThankYouMessage, thankYouText);
//        assertMethod(expectedSuccessMessage, orderSuccessMessage);
//    }

    public void finalizeOrder() {
        clickOnElement(continueButton);
    }
//    public void verifyWelcomeMessage(String expectedWelcomeMessage) {
//        assertMethod(expectedWelcomeMessage, welcomeToStoreText);
//    }


}

