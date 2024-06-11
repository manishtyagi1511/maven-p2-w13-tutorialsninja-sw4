package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.TopMenuBar;
import com.tutorialsninja.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    TopMenuBar topMenuBar = new TopMenuBar();


    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        topMenuBar.mouseHooverOnDesktop();
        topMenuBar.selectMenu("Show All Desktops");

        String expectedDesktopText = "Desktop";
        String actualDesktopText = topMenuBar.verifyDesktopText();
        Assert.assertEquals(actualDesktopText, expectedDesktopText, "Desktop Text is not verified ");

    }

    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        topMenuBar.mouseHooverAndClickOnLaptopsAndNotebooks();
        topMenuBar.selectMenu("Show All Laptops & Notebooks");

        String expectedLapAndNote = "Laptops & Notebooks";
        String actualLapAndNote = topMenuBar.verifyTextLaptopsAndNotebooks();
        Assert.assertEquals(actualLapAndNote, expectedLapAndNote, "Laptop and notebook text are not verified");

    }

    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        topMenuBar.mouseHooverAndClickOnComponents();
        topMenuBar.selectMenu("Show All Components");

        String expectedComponents="Components";
        String actualComponents=topMenuBar.verifyTextComponents();
        Assert.assertEquals(actualComponents,expectedComponents,"Components Text are not verified ");


        }

    }


