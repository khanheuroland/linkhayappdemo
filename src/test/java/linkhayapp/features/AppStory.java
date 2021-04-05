package linkhayapp.features;

import linkhayapp.common.Tabs;
import linkhayapp.questions.ScreenTitle;
import linkhayapp.questions.ShowLoginForm;
import linkhayapp.tasks.OpenTab;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.*;

@RunWith(SerenityRunner.class)
public class AppStory {

    Actor anna = Actor.named("The User");

    @Managed(driver = "Appium")
    public WebDriver herBrowser;

    @Before
    public void annaCanBrowseTheWeb() {
        anna.can(BrowseTheWeb.with(herBrowser));
    }

    @Test
    public void show_list_of_new_News_when_open_new_news_tab() {
        anna.attemptsTo(OpenTab.withName(Tabs.Tin_Moi));
        anna.should(seeThat(ScreenTitle.title(), is("Tin mới")));
    }

    @Test
    public void show_list_of_friend_when_open_friend_tab(){
        anna.attemptsTo(OpenTab.withName(Tabs.Ban_Be));
        anna.should(seeThat(ScreenTitle.title(), is("Bạn bè")));
    }

    @Test
    public void show_login_form_when_open_personal_tab()
    {
        anna.attemptsTo(OpenTab.withName(Tabs.Ca_Nhan));
        anna.should(seeThat(ShowLoginForm.isShow(), is(true)));
    }
}