package gov.ukcheck.visa.pages;

import gov.ukcheck.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class DurationOfStayPage extends Utility {


    @CacheLookup
    @FindBy(xpath="//input[@id='response-0']")
    WebElement lessThanSixMonths;
    @CacheLookup
    @FindBy(xpath="//input[@id='response-1']")
    WebElement moreThanSixMonths;
    @CacheLookup
    @FindBy(xpath="//button[contains(text(),'Continue')]")
    WebElement nextStepButton;
    public void selectLengthOfStay(String moreOrLess)
    {


        switch (moreOrLess){
            case "more":
                clickOnElement(moreThanSixMonths);
                break;
            case "less":

                clickOnElement(lessThanSixMonths);
                break;
            default:
                System.out.println("enter less or more");
                break;
        }
    }
    public void clickNextStepButton()
    {
        clickOnElement(nextStepButton);
    }









}
