package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenuBar extends Utility {

    By desktop = By.xpath("//a[normalize-space()='Desktops']");
    By verifyDesktop = By.xpath("//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]");
    By laptopsAndNotebooks = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    By verifyLapAndNote = By.xpath("//h2[text()='Laptops & Notebooks']");
    By components=By.xpath("//a[normalize-space()='Components']");
    By verifyComponents=By.xpath("//h2[text()='Components']");





    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }


    public void mouseHooverOnDesktop() {
        mouseHoverToElementAndClick(desktop);
    }

    public String verifyDesktopText() {
        return getTextFromElement(verifyDesktop);
    }

    public void mouseHooverAndClickOnLaptopsAndNotebooks() {
        mouseHoverToElementAndClick(laptopsAndNotebooks);
    }

    public String verifyTextLaptopsAndNotebooks() {
        return getTextFromElement(verifyLapAndNote);
    }
public void mouseHooverAndClickOnComponents(){
        mouseHoverToElementAndClick(components);
}
public String verifyTextComponents(){
        return getTextFromElement(verifyComponents);
}
}


