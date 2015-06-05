package TestStories;

import Steps.LoginPageSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by first on 04.06.2015.
 */
@RunWith(SerenityRunner.class)
public class LoginStory {

    @BeforeClass
    public static void initChromeDriver() {
        System.out.println("Test - " + System.getProperty("webdriver.chrome.driver"));
        System.setProperty("webdriver.chrome.driver", "D:\\Project\\ProfitroleTest\\chromedriver.exe");

    }

    @Managed(uniqueSession = true)
    public WebDriver webdriver;


    @Steps
    public LoginPageSteps loginPageSteps;

    @Test
    public void loginPage() {

        loginPageSteps.open_home_page();
        loginPageSteps.go_to_login_page();
        loginPageSteps.enter_login();
        loginPageSteps.enter_password();
        loginPageSteps.click_enter_button();
        loginPageSteps.assert_equals_logout();
    }
}
