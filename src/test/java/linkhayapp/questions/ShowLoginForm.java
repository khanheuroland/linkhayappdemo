package linkhayapp.questions;

import io.appium.java_client.android.AndroidDriver;
import linkhayapp.ui.LoginScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.rmi.runtime.Log;

import java.util.ArrayList;

public class ShowLoginForm implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        AndroidDriver driver = (AndroidDriver) ((WebDriverFacade)BrowseTheWeb.as(actor).getDriver()).getProxiedDriver();
        ArrayList<String> contexts = new ArrayList(driver.getContextHandles());
        String webContext="";
        for (String context : contexts) {
            if (!context.equals("NATIVE_APP")) {
                webContext= context;
                break;
            }
        }
        driver.context(webContext);

        for (String handle : driver.getWindowHandles()) {
            driver.switchTo().window(handle);
            break;
        }
        return LoginScreen.LOGIN_FORM.resolveAllFor(actor).size()>0;
    }

    public static Question<Boolean> isShow()
    {
        return new ShowLoginForm();
    }
}
