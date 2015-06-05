package TestStories;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import Steps.MenuTestSteps;

/**
 * Created by first on 04.06.2015.
 */
@RunWith(SerenityRunner.class)
public class MenuChoiceStory {

    @BeforeClass
    public static void initChromeDriver() {
        System.out.println("Test - " + System.getProperty("webdriver.chrome.driver"));
        System.setProperty("webdriver.chrome.driver", "D:\\Project\\ProfitroleTest\\chromedriver.exe");

    }

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    public MenuTestSteps menuTestSteps;

    @Test
    public void menuChoice() {

        menuTestSteps.open_home_page();
        menuTestSteps.click_create_menu();
        menuTestSteps.click_menu_for_a_day_button();
        menuTestSteps.click_choice_dinner();
        menuTestSteps.click_choice_jappanise_food();
        menuTestSteps.click_and_hold_onion_cake();
    }
}
