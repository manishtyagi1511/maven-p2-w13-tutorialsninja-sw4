package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DesktopsPage extends Utility {
    By selectDesktopsTab = (By.linkText("Desktops"));
    By clickOnShowAllDeskTop = (By.linkText("Show AllDesktops"));
    By productsListDisplay = (By.xpath("//h4/a"));
    By selectSortByNameZToA = By.xpath("//select[@id='input-sort']");
    By selectSortByNameAToZ = By.xpath("//select[@id='input-sort']");
    By selectProductHPLP3065 = By.linkText("HP LP3065");
    By verifyTextHPLP3065 = By.xpath("//h1[contains(text(),'HP LP3065')]");
    By selectDeliveryDate = By.xpath("//button[@class = 'btn btn-default']/i[@class='fa fa-calendar']");
    By selectMonthYear = By.xpath("/html[1]/body[1]/div[4]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[2]");
    By allDate = By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']");

    By enterQuantity = By.id("input-quantity");
    By selectAddToCartButton = By.xpath("//button[@id='button-cart']");
    By verifyTheSuccessMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");
    By selectShoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]"); //By.xpath("//a[contains(text(),'shopping cart')]");
    By verifyTheTextShoppingCart = By.cssSelector("div[id='checkout-cart'] li:nth-child(2) a:nth-child(1)");
    ;
    By verifyTheProductNameHPLP3065 = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By verifyTheDeliveryDate = By.cssSelector("div.container:nth-child(4) div.row div.col-sm-12 div.table-responsive table.table.table-bordered tbody:nth-child(2) tr:nth-child(1) td.text-left:nth-child(2) > small:nth-child(3)");

    By verifyModel = By.xpath("//td[contains(text(),'Product 21')]");
    By currencyLink = By.xpath("//span[contains(text(),'Currency')]");
    By selectCurrencyPoundSterling = By.xpath("//button[contains(text(),'£Pound Sterling')]");
    By verifyTheTotal = By.xpath("//tbody/tr[1]/td[6]");
    By selectFilter = By.id("input-sort");
    By productNames = By.xpath("//div[@class='caption']//h4");

    public void clickOnDesktopsTab() {
        mouseHoverToElementAndClick(selectDesktopsTab);
    }

    public void clickOnShowAllDesktop() {
        mouseHoverToElementAndClick(clickOnShowAllDeskTop);
    }

    public String getOriginalProductDisplayList() {
        List<WebElement> products = driver.findElements(productsListDisplay);
        ArrayList<String> originalProductName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductName.add(e.getText());
        }
        System.out.println(originalProductName);
        return getTextFromElement(productsListDisplay);
    }

    public String getProductSortByZTOA() {
        selectByVisibleTextFromDropDown(selectSortByNameZToA, "Name (Z - A)");
        List<WebElement> products = driver.findElements(productsListDisplay);
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }

        System.out.println(afterSortByZToAProductsName);

        return getTextFromElement(selectSortByNameZToA);
    }

    public String getProductSortByAToZ() {
        selectByVisibleTextFromDropDown(selectSortByNameAToZ, "Name (A - Z)");
        List<WebElement> products = driver.findElements(productsListDisplay);
        ArrayList<String> afterSortByAToZProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByAToZProductsName.add(e.getText());
        }

        System.out.println(afterSortByAToZProductsName);

        return getTextFromElement(selectSortByNameAToZ);
    }

    public void clickOnHPLP3065() {
        clickOnElement(selectProductHPLP3065);
    }

    public String getTextHPLP3065() {
        return getTextFromElement(verifyTextHPLP3065);
    }

    public void selectDeliveryDate() {
        String year = "2023";
        String month = "November";
        String date = "27";
        clickOnElement(By.xpath("//div[@class='input-group date']//button[@type='button']")); // Open the calendar
        while (true) {
            String monthAndYear = getTextFromElement(By.xpath("//div[@class='datepicker-days']//thead//tr[1]"));
            String[] a = monthAndYear.split(" ");
            String mon = a[1];
            String yer = a[2];
            if (mon.equals(month) && yer.equals(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class='datepicker-days']//th[@class='next'][contains(text(),'›')]"));
            }
        }
        // Select the Date
        List<WebElement> allDates = driver.findElements(By.xpath("//td[contains(@class,'day')]"));
        for (WebElement dt : allDates) {
            if (dt.getText().equals(date)) {
                dt.click();
                break;
            }
        }
    }

    public void enterTheQuantity1() {
        clearText(enterQuantity);
        sendTextToElement(enterQuantity, "1");
    }

    public void clickOnAddToCartButton() {
        clickOnElement(selectAddToCartButton);
    }

    public String verifySuccessMessage() {
        return getTextFromElement(verifyTheSuccessMessage);
    }

    public void clickOnShoppingCartInToSuccessMessage() {
        clickOnElement(selectShoppingCartLink);
    }

    public String getShoppingCartText() {
        return getTextFromElement(verifyTheTextShoppingCart);
    }

    public String getProductNameIsHPLP3065() {
        return getTextFromElement(verifyTheProductNameHPLP3065);
    }

    public String getTheDeliveryDateIs20231130() {
        return getTextFromElement(verifyTheDeliveryDate);
    }

    public String getTheModelIsProduct21() {
        return getTextFromElement(verifyModel);
    }

    public void clickOnCurrencyDropDown() {
        clickOnElement(currencyLink);
        //selectCurrencyPoundSterling
        List<WebElement> currencyList = driver.findElements(By.xpath("//ul[@class = 'dropdown-menu']/li"));
        for (WebElement e : currencyList) {
            if (e.getText().equalsIgnoreCase("£ Pound Sterling")) {
                e.click();
                break;
            }
        }
    }

    public void mouseHoveronPoundAndClick() {
        mouseHoverToElementAndClick(selectCurrencyPoundSterling);
    }

    public String getTotal() {
        return getTextFromElement(verifyTheTotal);
    }


    //Conert list to descending order
    public List<String> getProductNamesInDefaultFilterAndSortByDescendingOrder() {
        return convertArrayListToReverseOrder(productNames);
    }

    //Select from drop down method
    public void selectFilter(String value) {
        selectByValueFromDropDown(selectFilter, value);
    }

    //Get list after applying filter
    public List<String> getProductNamesAfterFilterZtoA() {
        return afterFilterProductNames(productNames);
    }


}






















































