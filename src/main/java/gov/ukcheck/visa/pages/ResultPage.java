package gov.ukcheck.visa.pages;

import gov.ukcheck.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends Utility {


    @CacheLookup
    @FindBy(xpath = " //h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement resultMessage;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement resultMessageForHealthAndCare;
   /* public String getResultMessage()
    {
        return getTextFromElement(resultMessage);
    }
    public String getResultMessageforHealthAndCare()
    {
        return getTextFromElement(resultMessageForHealthAndCare);
    }
    public void confirmResultMessage(String expectedMessage)
    {

    }*/

    public WebElement getResultMessageForHealthAndCare() {
        return resultMessageForHealthAndCare;
    }

    public WebElement getResultMessage() {
        return resultMessage;
    }
}
