package Steps;

import com.objects.HomePagePO;
import com.objects.LoginPagePO;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by first on 04.06.2015.
 */
public class LoginPageSteps extends ScenarioSteps {

    WebDriver driver = new ChromeDriver();

    //    WebElement searhString = driver.findElement(By.className("search-query"));

    HomePagePO homePage = PageFactory.initElements(driver, HomePagePO.class);
    LoginPagePO loginPage = PageFactory.initElements(driver, LoginPagePO.class);

    @Step
    public void open_home_page()

    {
        driver.get("http://gioia-profiterole.rhcloud.com/");
    }

    @Step
    public void go_to_login_page() {
        homePage.getLoginString().click();
    }

    @Step
    public void enter_login() {
        loginPage.getUserString().sendKeys("slava-qa");

    }

    @Step
    public void enter_password() {
        loginPage.getPasswordString().sendKeys("a123456789");
    }

    @Step
    public void click_enter_button() {
        loginPage.getEnterButton().click();
    }

    @Step
    public void assert_equals_logout() {
        assertEquals("Выход", loginPage.getLogoutString().getText());
    }



}
