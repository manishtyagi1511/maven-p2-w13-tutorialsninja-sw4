package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class LaptopsAndNotebooksPage extends Utility {

    By selectProductMac = By.linkText("MacBook");
    By verifyTheTextMac = By.xpath("//h1[contains(text(),'MacBook')]");
    By clickOnAddToCart = By.xpath("//button[@id='button-cart']");
    By verifyTheMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By clickOnLinkShoppingCartDisplay = By.xpath("//a[contains(text(),'shopping cart')]");
    By verifyTheTextShopping = By.cssSelector("body:nth-child(2) div.container:nth-child(4) ul.breadcrumb li:nth-child(2) > a:nth-child(1)");
    By verifyTheProductNameMac = By.cssSelector("div.container:nth-child(4) div.row div.col-sm-12 div.table-responsive table.table.table-bordered tbody:nth-child(2) tr:nth-child(1) td.text-left:nth-child(2) > a:nth-child(1)");
    By clear = By.cssSelector("div.container:nth-child(4) div.row div.col-sm-12 div.table-responsive table.table.table-bordered tbody:nth-child(2) tr:nth-child(1) td.text-left:nth-child(4) div.input-group.btn-block > input.form-control");
    By changeQuantity = By.cssSelector("div.container:nth-child(4) div.row div.col-sm-12 div.table-responsive table.table.table-bordered tbody:nth-child(2) tr:nth-child(1) td.text-left:nth-child(4) div.input-group.btn-block > input.form-control");
    By clickOnUpdate = By.xpath("//button[@data-original-title='Update']");
    By verifyTheMessageModifiedShopping = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By verifyTotal = By.xpath("//body[1]/div[2]/div[3]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]");
    By clickOnCheckout = By.xpath("//span[contains(text(),'Checkout')]");
    By verifyNewCustomer = By.cssSelector("div.container:nth-child(4) div.row div.col-sm-12 div.panel-group:nth-child(2) div.panel.panel-default:nth-child(1) div.panel-collapse.collapse.in div.panel-body div.row div.col-sm-6:nth-child(1) > h2:nth-child(1)");
    By clickOnGuest = By.xpath("//label[normalize-space()='Guest Checkout']");
    By clickOnContinue = By.xpath("//input[@id='button-account']");
    By firstName = By.id("input-payment-firstname");
    By lastName = By.id("input-payment-lastname");
    By emailField = By.id("input-payment-email");
    By telephone = By.id("input-payment-telephone");
    By address1 = By.id("input-payment-address-1");
    By cityField = By.id("input-payment-city");
    By postcode = By.id("input-payment-postcode");
    By country = By.xpath("//select[@id='input-payment-country']");
    By region = By.xpath("//select[@id='input-payment-zone']");
    By clickOnContinueButton = By.xpath("//input[@id='button-guest']");
    By commentsToTextArea = By.xpath("//textarea[@name='comment']");
    By termsConditions = By.xpath("//input[@name='agree']");
    By finalContinueButton = By.xpath("//input[@id='button-shipping-method']");
    By getClickOnContinue = By.xpath("//input[@id='button-payment-method']");
    By selectanother = By.linkText("Sony VAIO");
    By addCart = By.id("button-cart");
    By remove = By.xpath("//tbody/tr[1]/td[4]/div[1]/span[1]/button[2]/i[1]");
    By checkOut = By.xpath("//a[contains(text(),'Checkout')]");
    By verifyCheckout = By.xpath("//h1[contains(text(),'Checkout')]");
    By selectLaptopsAndNotebookstab = By.linkText("Laptops & Notebooks");
    By showAllLaptopsAndNotebookstab = By.linkText("Laptops & Notebooks");
    By selectPrice = By.id("input-sort");
    public By productPrice = By.xpath("//div[@class='product-layout product-grid col-lg-4 col-md-4 col-sm-6 col-xs-12']//div[1]//div[2]//div[1]//p//span[@class='price-tax']");
    public By selectFilter = By.id("input-sort");


    public void clickOnLaptopsAndNotebooksTab() {
        clickOnElement(selectLaptopsAndNotebookstab);
    }

    public void clickOnShowAllLaptopsAndNotebooksTab() {
        clickOnElement(showAllLaptopsAndNotebookstab);
    }

    public void selectSortByPriceHighToLow() {
        selectByVisibleTextFromDropDown(selectPrice, "Price (High > Low)");
    }

    public void clickOnNewProduct() {
        clickOnElement(selectanother);
    }

    public void selectAddToCart() {
        clickOnElement(addCart);
    }

    public String verifyTheCheckoutText() {
        return getTextFromElement(verifyCheckout);
    }

    public String verifyTheTextNewCustomer() {
        return getTextFromElement(verifyNewCustomer);
    }

    public void removeOldProduct() {
        clickOnElement(remove);
    }

    public void setClickOnCheckout() {
        clickOnElement(checkOut);
    }

    public void clickOnGuestCheckoutbutton() {
        clickOnElement(clickOnGuest);
    }

    public void clickOnContinueButton() {
        clickOnElement(clickOnContinue);
    }

    public void firstNameField() {
        sendTextToElement(firstName, "Manini");
    }

    public void lastNameField() {
        sendTextToElement(lastName, "Sheth");
    }

    public void emailFieldText() {
        sendTextToElement(emailField, "abc1234@gmail.com");
    }

    public void telephoneField() {
        sendTextToElement(telephone, "07123546789");
    }

    public void address1Field() {
        sendTextToElement(address1, "Mumbai");
    }

    public void cityFieldText() {
        sendTextToElement(cityField, "Surat");
    }

    public void postalCodeField() {
        sendTextToElement(postcode, "391005");
    }

    public void countryField() {
        selectByVisibleTextFromDropDown(country, "India");
    }

    public void regionField() {
        selectByVisibleTextFromDropDown(region, "Maharashtra");
    }

    public void clickOnContinueButtonAfterMandatory() {
        clickOnElement(clickOnContinueButton);
    }

    public void addCommentsAboutYourOrderInToTextArea() {
        sendTextToElement(commentsToTextArea, "I want my order on time");
    }

    public void clickOnFinalContinueButton() {
        clickOnElement(finalContinueButton);
    }

    public void clickOnTermsAndConditionCheckbox() {
        clickOnElement(termsConditions);
    }

    public void setFinalContinueButton() {
        clickOnElement(getClickOnContinue);
    }

    public void setSortByPriceHighToLow() {
        // Get all the products price and stored into array list
        List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
        List<Double> originalProductsPrice = new ArrayList<>();
        for (WebElement e : products) {
            System.out.println(e.getText());
            String[] arr = e.getText().split("Ex Tax:");
            originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(originalProductsPrice);
        // Sort By Reverse order
        Collections.sort(originalProductsPrice, Collections.reverseOrder());
        System.out.println(originalProductsPrice);
        // Select sort by Price (High > Low)
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Price (High > Low)");
        // After filter Price (High > Low) Get all the products name and stored into array list
        products = driver.findElements(By.xpath("//p[@class ='price']"));
        ArrayList<Double> afterSortByPrice = new ArrayList<>();
        for (WebElement e : products) {
            String[] arr = e.getText().split("Ex Tax:");
            afterSortByPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",", "")));
        }
        System.out.println(afterSortByPrice);
    }

    public String verifyTheTextMacBook() {
        return getTextFromElement(verifyTheTextMac);
    }

    public void selectProductMacBook() {
        clickOnElement(selectProductMac);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(clickOnAddToCart);
    }

    public String verifyTheMessageSuccess() {
        return getTextFromElement(verifyTheMessage);
    }

    public void clickOnLinkShoppingCartDisplayIntoSuccess() {
        clickOnElement(clickOnLinkShoppingCartDisplay);
    }

    public String verifyTheTextShoppingCart() {
        return getTextFromElement(verifyTheTextShopping);
    }

    public String verifyTheProductNameMacBook() {
        return getTextFromElement(verifyTheProductNameMac);
    }

    public void setClearTextBox() {
        clearText(clear);
    }

    public void changeQty() {
        sendTextToElement(changeQuantity, "2");
    }

    public void clickOnUpdateTab() {
        clickOnElement(clickOnUpdate);
    }

    public String verifyTheMessageModifiedShoppingCart() {
        return getTextFromElement(verifyTheMessageModifiedShopping);
    }

    public String verifyTheTotal() {
        return getTextFromElement(verifyTotal);
    }

    public void clickOnCheckoutButton() {
        clickOnElement(clickOnCheckout);
    }

    public List<Double> getProductPricesInDefaultFilterAndSortByDescendingOrder() {
        return convertPriceListToReverse(productPrice);
    }

    public void select(By by, String value) {
        selectByValueFromDropDown(by, value);
    }

    //Get list after applying filter
    public List<Double> getProductPriceAfterFilterHighToLow() {
        return afterFilterPrice(productPrice);
    }
}