package Steps;

import com.objects.HomePagePO;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by first on 19.05.2015.
 */


public class HomePageSteps extends ScenarioSteps {


    WebDriver driver = new ChromeDriver();

    //    WebElement searhString = driver.findElement(By.className("search-query"));

    HomePagePO homePage = PageFactory.initElements(driver, HomePagePO.class);

    @Step
    public void open_home_page()

    {
        driver.get("http://gioia-profiterole.rhcloud.com/");
    }

    @Step
    public void send_keys_borsch() {
        homePage.getSearhString().sendKeys("Борщ");
    }

    @Step
    public void send_submit_borsch() {
        homePage.getSearhString().submit();
    }

    @Step
    public void assert_equals_borsch() {
        assertEquals("Борщ", driver.findElement(new By.ByTagName("p")).getText());
    }




/*    @AfterClass
    public void closeBrowser() throws Exception {
        driver.quit();
    }*/
}

