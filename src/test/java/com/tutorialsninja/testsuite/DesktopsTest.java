package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DesktopsTest extends TestBase {

    DesktopsPage desktopspage = new DesktopsPage();

    /*
     Write the following Test:
 1.Test name verifyProductArrangeInAlphaBaticalOrder()
 1.1 Mouse hover on Desktops Tab.and click
 1.2 Click on “Show All Desktops”
 1.3 Select Sort By position "Name: Z to A"
 1.4 Verify the Product will arrange in Descending order.
      */
    @Test
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        desktopspage.clickOnDesktopsTab();
        desktopspage.clickOnShowAllDesktop();
        //desktopspage.getOriginalProductDisplayList();
        //desktopspage.getProductSortByZTOA();
        List<String> actualText = desktopspage.getProductNamesInDefaultFilterAndSortByDescendingOrder();
        desktopspage.selectFilter("https://tutorialsninja.com/demo/index.php?route=product/category&path=20&sort=pd.name&order=DESC");
        Thread.sleep(2000);
        List<String> expectedText = desktopspage.getProductNamesAfterFilterZtoA();
        //1.4 Verify the Product will arrange in Descending order.
        Assert.assertEquals(actualText, expectedText);
    }

  /*
//    2. Test name verifyProductAddedToShoppingCartSuccessFully()
//2.1 Mouse hover on Currency Dropdown and click
//2.2 Mouse hover on £Pound Sterling and click
//2.3 Mouse hover on Desktops Tab.
//2.4 Click on “Show All Desktops”
//2.5 Select Sort By position "Name: A to Z"
//2.6 Select product “HP LP3065”
//2.7 Verify the Text "HP LP3065"
//2.8 Select Delivery Date "2023-11-27"
//2.9.Enter Qty "1” using Select class.
//2.10 Click on “Add to Cart” button
//2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
//2.12 Click on link “shopping cart” display into success message
//2.13 Verify the text "Shopping Cart"
//2.14 Verify the Product name "HP LP3065"
//2.15 Verify the Delivery Date "2023-11-27"
//2.16 Verify the Model "Product21"
//2.17 Verify the Todat "£74.73"
//     */

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        desktopspage.clickOnCurrencyDropDown();
        desktopspage.mouseHoveronPoundAndClick();
        desktopspage.clickOnDesktopsTab();
        desktopspage.clickOnShowAllDesktop();
        desktopspage.getOriginalProductDisplayList();
        desktopspage.getProductSortByAToZ();
        desktopspage.clickOnHPLP3065();
        Assert.assertEquals(desktopspage.getTextHPLP3065(), "HP LP3065", "HP LP3065 not displayed");
        desktopspage.selectDeliveryDate();
        desktopspage.enterTheQuantity1();
        desktopspage.clickOnAddToCartButton();
        Thread.sleep(2000);
        Assert.assertEquals(desktopspage.verifySuccessMessage(), "Success: You have added HP LP3065 to your shopping cart!\n" +
                "×", "Success Message not displayed");
        desktopspage.clickOnShoppingCartInToSuccessMessage();
        Thread.sleep(2000);
        Assert.assertEquals(desktopspage.getShoppingCartText(), "Shopping Cart", "Shopping Cart text not displayed");
        Assert.assertEquals(desktopspage.getProductNameIsHPLP3065(), "HP LP3065", "Product name is not HP LP3065");
        Assert.assertEquals(desktopspage.getTheDeliveryDateIs20231130(), "Delivery Date:2023-11-27", "Delivery date is not correct");
        Assert.assertEquals(desktopspage.getTheModelIsProduct21(), "Product 21", "Error Message not displayed");
        Assert.assertEquals(desktopspage.getTotal(), "£74.73");
    }

}