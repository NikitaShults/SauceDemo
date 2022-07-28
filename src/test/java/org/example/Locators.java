package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locators extends BaseTest {
    @Test
    public void locators() {
        driver.get("https://www.saucedemo.com/inventory.html");
        WebElement twitter = driver.findElement(By.linkText("Twitter"));
        WebElement facebook = driver.findElement(By.partialLinkText("Face"));
        driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Bolt T-Shirt')]"));
        driver.findElement(By.xpath("//div[text()='15.99']/following-sibling::button")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();
        driver.findElement(By.xpath("//button[contains(@name,'add-to-cart-test.allthethings()-t-shirt-(red)')]")).click();
        driver.findElement(By.className("shopping_cart_container")).click();
        driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']/parent::a"));
        driver.findElement(By.xpath("//div[@class='primary_header']/descendant::span[@class='shopping_cart_badge']"));
        driver.findElement(By.xpath("//div[contains(text(),'A red light')]/preceding-sibling::a"));
        driver.findElement(By.xpath("//button[@name='checkout' and @id='checkout']")).click();

        driver.findElement(By.cssSelector("#first-name"));
        driver.findElement(By.cssSelector(".checkout_info .form_group"));
        driver.findElement(By.cssSelector(".form_input#postal-code"));
        driver.findElement(By.cssSelector("button"));
        driver.findElement(By.cssSelector("input.submit-button"));
        driver.findElement(By.cssSelector("span[class='title']"));
    }
}
