package Tests;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleTests {

    @Test
    public void test1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://rambler.ru");
        driver.findElement(By.cssSelector("input.rui__1GAZv")).sendKeys("калькулятор", Keys.ENTER);
        driver.close();
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://mathsolver.microsoft.com/ru/algebra-calculator");
        driver1.findElement(By.cssSelector("#__next > div.page-layout > div.m > main > div:nth-child(1) > div.SoftKeyboard_mathKeyboard__2wqj6.MathInputField_k__PnFRD > div:nth-child(2) > div > div:nth-child(1) > button.KeyboardButton_key__3jI0q.no-select.k-0-4")).click();
        driver1.findElement(By.cssSelector("#__next > div.page-layout > div.m > main > div:nth-child(1) > div.SoftKeyboard_mathKeyboard__2wqj6.MathInputField_k__PnFRD > div:nth-child(2) > div > div:nth-child(3) > button.KeyboardButton_key__3jI0q.no-select.KeyboardButton_keyWhite__156xU.k-2-6")).click();
        driver1.findElement(By.cssSelector("#__next > div.page-layout > div.m > main > div:nth-child(1) > div.SoftKeyboard_mathKeyboard__2wqj6.MathInputField_k__PnFRD > div:nth-child(2) > div > div:nth-child(4) > button.KeyboardButton_key__3jI0q.no-select.k-3-8")).click();
        driver1.findElement(By.cssSelector("#__next > div.page-layout > div.m > main > div:nth-child(1) > div.SoftKeyboard_mathKeyboard__2wqj6.MathInputField_k__PnFRD > div:nth-child(2) > div > div:nth-child(3) > button.KeyboardButton_key__3jI0q.no-select.KeyboardButton_keyWhite__156xU.k-2-7")).click();
        driver1.findElement(By.cssSelector("#__next > div.page-layout > div.m > main > div:nth-child(1) > div.SoftKeyboard_mathKeyboard__2wqj6.MathInputField_k__PnFRD > div:nth-child(2) > div > div:nth-child(1) > button.KeyboardButton_key__3jI0q.no-select.k-0-5")).click();
        driver1.findElement(By.cssSelector("#__next > div.page-layout > div.m > main > div:nth-child(1) > div.SoftKeyboard_mathKeyboard__2wqj6.MathInputField_k__PnFRD > div:nth-child(2) > div > div:nth-child(3) > button.KeyboardButton_key__3jI0q.no-select.k-2-9")).click();
        driver1.findElement(By.cssSelector("#__next > div.page-layout > div.m > main > div:nth-child(1) > div.SoftKeyboard_mathKeyboard__2wqj6.MathInputField_k__PnFRD > div:nth-child(2) > div > div:nth-child(3) > button.KeyboardButton_key__3jI0q.no-select.KeyboardButton_keyWhite__156xU.k-2-8")).click();
        driver1.findElement(By.cssSelector("#__next > div.page-layout > div.m > main > div:nth-child(1) > div.SoftKeyboard_mathKeyboard__2wqj6.MathInputField_k__PnFRD > div:nth-child(2) > div > div:nth-child(4) > button.KeyboardButton_key__3jI0q.no-select.k-3-9")).click();
        driver1.findElement(By.cssSelector("#__next > div.page-layout > div.m > main > div:nth-child(1) > div.SoftKeyboard_mathKeyboard__2wqj6.MathInputField_k__PnFRD > div:nth-child(2) > div > div:nth-child(2) > button.KeyboardButton_key__3jI0q.no-select.KeyboardButton_keyWhite__156xU.k-1-6")).click();
        driver1.findElement(By.cssSelector("#__next > div.page-layout > div.m > main > div:nth-child(1) > div.SoftKeyboard_mathKeyboard__2wqj6.MathInputField_k__PnFRD > div:nth-child(2) > div > div:nth-child(4) > button.KeyboardButton_key__3jI0q.no-select.KeyboardButton_keyWhite__156xU.k-3-6")).click();
        driver1.findElement(By.cssSelector("#__next > div.page-layout > div.m > main > div:nth-child(1) > div.SoftKeyboard_mathKeyboard__2wqj6.MathInputField_k__PnFRD > div:nth-child(2) > div > div:nth-child(2) > button.KeyboardButton_key__3jI0q.no-select.k-1-9")).click();
        driver1.findElement(By.cssSelector("#__next > div.page-layout > div.m > main > div:nth-child(1) > div.SoftKeyboard_mathKeyboard__2wqj6.MathInputField_k__PnFRD > div:nth-child(2) > div > div:nth-child(2) > button.KeyboardButton_key__3jI0q.no-select.KeyboardButton_keyWhite__156xU.k-1-7")).click();
        driver1.findElement(By.cssSelector("#__next > div.page-layout > div.m > main > div:nth-child(1) > div.MathInputField_gfc__hnWs9 > button")).click();
        driver.quit();
        driver1.close();
    }
}