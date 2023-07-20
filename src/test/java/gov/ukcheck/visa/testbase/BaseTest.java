package gov.ukcheck.visa.testbase;

import gov.ukcheck.visa.propertyreader.PropertyReader;
import gov.ukcheck.visa.utility.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {
    String browser = PropertyReader.getInstance().getProperty("browser");

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        selectBrowser(browser);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        //   closeBrowser();
    }
}
