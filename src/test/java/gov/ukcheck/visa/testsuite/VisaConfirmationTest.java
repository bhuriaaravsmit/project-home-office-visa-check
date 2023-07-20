package gov.ukcheck.visa.testsuite;

import gov.ukcheck.visa.pages.*;
import gov.ukcheck.visa.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends BaseTest {
    DurationOfStayPage durationOfStayPage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    ReasonForTravelPage reasonForTravelPage;
    ResultPage resultPage;
    SelectNationalityPage selectNationalityPage;
    StartPage startPage;
    WorkTypePage workTypePage;
    @BeforeMethod(groups = {"sanity","smoke","regression"})
    public void inIt()
    {
        durationOfStayPage=new DurationOfStayPage();
        familyImmigrationStatusPage=new FamilyImmigrationStatusPage();
        reasonForTravelPage=new ReasonForTravelPage();
        resultPage=new ResultPage();
        selectNationalityPage=new SelectNationalityPage();
        startPage=new StartPage();
        workTypePage=new WorkTypePage();
    }
    @Test(groups = {"smoke","sanity","regression"})
    public void anAustralianCominToUKForTourism()
    {

        startPage.clickStartNow();

        selectNationalityPage.selectNationality("Australia");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.clickOnReasonForVisitTourism();
        reasonForTravelPage.clickNextStepButton();
//        verify result 'You will not need a visa to come to the UK'

        verifyText(resultPage.getResultMessage(),"You will not need a visa to come to the UK");


    }
    @Test
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths()
    {

        startPage.clickStartNow();
        selectNationalityPage.selectNationality("Chile");
        selectNationalityPage.clickNextStepButton();
        reasonForTravelPage.clickOnReasonForVisitAcademic();
        reasonForTravelPage.clickNextStepButton();
        durationOfStayPage.selectLengthOfStay("more");
        durationOfStayPage.clickNextStepButton();
        workTypePage.clickOnHealthAndCareProvision();

        workTypePage.clickNextStepButton();
//        verify result 'You need a visa to work in health and care'

        verifyText(resultPage.getResultMessageForHealthAndCare(),"You need a visa to work in health and care");


    }
    @Test(groups = {"sanity","regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card()
    {

        startPage.clickStartNow();

        selectNationalityPage.selectNationality("Colombia");

        selectNationalityPage.clickNextStepButton();

        reasonForTravelPage.clickOnReasonForJoinPartnerAndFamily();

        reasonForTravelPage.clickNextStepButton();

        familyImmigrationStatusPage.selectImmigrationStatus("yes");

        familyImmigrationStatusPage.clickNextStepButton();
//        verify result 'You’ll need a visa to join your family or partner in the UK'

    }
}