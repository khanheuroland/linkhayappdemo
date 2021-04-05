package linkhayapp.features;

import linkhayapp.common.Tabs;
import linkhayapp.questions.DisplayNamePopup;
import linkhayapp.questions.ShowLoginForm;
import linkhayapp.tasks.Login;
import linkhayapp.tasks.OpenTab;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.waits.Wait;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.is;

@RunWith(SerenityRunner.class)
public class LoginStory {
    Actor anna = Actor.named("The User");

    @Managed(driver = "Appium")
    public WebDriver herBrowser;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void should_show_login_success_with_valid_username_and_password()
    {
        anna.attemptsTo(
                OpenTab.withName(Tabs.Ca_Nhan),
                Wait.until(ShowLoginForm.isShow(), is(true)).forNoLongerThan(15).seconds(),
                Login.withUserName("khanh.tx@live.com").andPassword("@admin")
        );

        anna.should(
                seeThat(DisplayNamePopup.isShow(), is(true))
        );
    }
}
