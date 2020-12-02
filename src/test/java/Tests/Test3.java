package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

    @Test
    public void test2() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mathsolver.microsoft.com/ru/algebra-calculator");
        driver.findElement(By.cssSelector("#Pivot170-Tab1 > span > span")).click();
        driver.findElement(By.cssSelector("#__next > div.page-layout > div.m > main > div:nth-child(1) > div.SoftKeyboard_mathKeyboard__2wqj6.MathInputField_k__PnFRD > div:nth-child(2) > div > div:nth-child(2) > button.KeyboardButton_key__3jI0q.no-select.KeyboardButton_keyNew__2UbfP.k-1-0")).click();
        driver.findElement(By.cssSelector("#__next > div.page-layout > div.m > main > div:nth-child(1) > div.SoftKeyboard_mathKeyboard__2wqj6.MathInputField_k__PnFRD > div:nth-child(2) > div > div:nth-child(5) > button.KeyboardButton_key__3jI0q.no-select.k-4-7")).click();
        driver.findElement(By.cssSelector("#__next > div.page-layout > div.m > main > div:nth-child(1) > div.SoftKeyboard_mathKeyboard__2wqj6.MathInputField_k__PnFRD > div:nth-child(2) > div > div:nth-child(5) > button.KeyboardButton_key__3jI0q.no-select.KeyboardButton_keySearch__2uNea.k-4-9")).click();
        driver.close();
    }
}