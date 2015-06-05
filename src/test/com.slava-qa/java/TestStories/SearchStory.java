package TestStories;

//import com.koffskiy.steps.EndUserSteps;

import Steps.HomePageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by first on 03.06.2015.
 */
@RunWith(SerenityRunner.class)
public class SearchStory {

    @BeforeClass
    public static void initChromeDriver() {
        System.out.println("Test - " + System.getProperty("webdriver.chrome.driver"));
        System.setProperty("webdriver.chrome.driver", "D:\\Project\\ProfitroleTest\\chromedriver.exe");

    }

    @Managed(uniqueSession = true)
    public WebDriver webdriver;


    @Steps
    public HomePageSteps homePageSteps;

    @Test
    public void homePageSearchTestByKeywordBorsch() {

        homePageSteps.open_home_page();
        homePageSteps.send_keys_borsch();
        homePageSteps.send_submit_borsch();
        homePageSteps.assert_equals_borsch();
    }

}
