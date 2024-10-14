package pom.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

public class EbayHome {
    @FindBy(xpath = "//input[@id='gh-ac']")
    public WebElement searchBox;


    @FindBy(xpath="//select[@id='gh-cat']")
    public  WebElement dropDownBox;

    @FindBy(xpath = "//input[@id='gh-btn']")
    public  WebElement searchButton;


    public void insertTextToSearchBox(String searchText){
        searchBox.sendKeys(searchText);
    }
    public  void  selectOption(String visibleText){
        new Select(dropDownBox).selectByVisibleText(visibleText);
    }
    public  void clickSearchButton(){
        searchButton.click();
    }

}
