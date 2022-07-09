package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void userShouldLoginWithValidCredentials() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.getTitle().isDisplayed(), "User was not logged in");
    }

    @Test
    public void passwordShouldBeRequiredForLogin() {
        loginPage.open();
        loginPage.login("standard_user", "");
        assertEquals(loginPage.getError(), "Epic sadface: Password is required", "The error is incorrect");

    }
    @Test
    public void addProductToCartAndValidateProductName() {
        loginPage.open();
        loginPage.loginAsStandardUser();
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.goToCart();
        Assert.assertEquals(cartPage.productNameInCart(), "Sauce Labs Backpack");
    }

    @Test
    public void addProductToCartAndValidateProductPrice() {
        loginPage.open();
        loginPage.loginAsStandardUser();
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.goToCart();
        Assert.assertEquals(cartPage.productPriceInCart(), "$29.99");
    }

    @Test
    public void addProductToCartAndGoToCheckout(){
        loginPage.open();
        loginPage.loginAsStandardUser();
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.goToCart();
        cartPage.goToCheckout();
        checkoutPage.fillCheckoutFields("Nikita", "Shults", "11111");
        Assert.assertEquals(checkoutPage.getFirstNameFieldValue(),"Nikita");
    }


}
