package Steps;

import com.objects.HomePagePO;
import com.objects.MenuPagePO;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class MenuTestSteps extends ScenarioSteps {

    WebDriver driver = new ChromeDriver();

    HomePagePO homePage = PageFactory.initElements(driver, HomePagePO.class);
    MenuPagePO menuPage = PageFactory.initElements(driver, MenuPagePO.class);

    @Step
    public void open_home_page()

    {
        driver.get("http://gioia-profiterole.rhcloud.com/");
    }

    @Step
    public void click_create_menu() {
        homePage.getCreateMenuButton().click();
    }

    @Step
    public void click_menu_for_a_day_button() {
        homePage.getMenuForADayButton().click();
    }

    @Step
    public void click_choice_dinner() {
        menuPage.getDinnerButton().click();

    }

    @Step
    public void click_choice_jappanise_food() {
        menuPage.getJappaniseFoodButton().click();
    }

    @Step
    public void click_and_hold_onion_cake() {
        menuPage.getOnionCakes().clickAndHold(driver.findElement(new By.ByXPath(".//*[@id='dinner']")));
    }

}
