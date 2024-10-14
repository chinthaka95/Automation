package pom.Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pom.Utilities.TestingUtils;
public class tests2  extends TestingUtils {
    @Test
    public void searchyoutube(){

        driver.get("https://www.youtube.com/");
        //find the element
        driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("Chins Academy");
/*
        //to find the dropdown
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='gh-cat']"));
        //to select the dropdown
        Select select = new Select(dropdown);
        //passing the value which we need from dropdown
        select.selectByVisibleText("Cell Phones & Accessories");

        //clicking the button
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        // to perfrom actions like scroll
        Actions action = new Actions(driver);

        //to find the element/ if its 1 0f 1 after search then we can use it
        driver.findElement(By.xpath("//span[text()='Apple']")).click();

        //scroll action. must add perform at the end in order to work
        action.scrollByAmount(0,300).perform();
*/

    }

}

