package gov.ukcheck.visa.pages;

import gov.ukcheck.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class StartPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[@class='gem-c-button govuk-button govuk-button--start']")
    WebElement startNow;


public void clickStartNow(){
    sleep(2000);
    clickOnElement(startNow);
}


}
