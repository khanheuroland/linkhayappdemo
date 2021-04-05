package linkhayapp.tasks;

import linkhayapp.common.Tabs;
import linkhayapp.ui.AppScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

import static linkhayapp.common.Tabs.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenTab implements Task {
    String tabName;
    Tabs tabToOpen;
    Target tabLocator;
    public OpenTab(Tabs tab)
    {
        this.tabToOpen = tab;
        switch (tab)
        {
            case Tin_Hot:
                tabName = "Tin hot";
                tabLocator = AppScreen.TAB_HOT;
                break;
            case Tin_Moi:
                tabName = "Tin mới";
                tabLocator = AppScreen.TAB_NEW;
                break;
            case Ban_Be:
                tabName="Bạn bè";
                tabLocator = AppScreen.TAB_FRIEND;
                break;
            case Cap_Nhat:
                tabName = "Cập nhật";
                tabLocator = AppScreen.TAB_UPDATE;
                break;
            case Ca_Nhan:
                tabName = "Cá nhân";
                tabLocator = AppScreen.TAB_PERSONAL;
                break;
        }
    }

    @Step("Open the \"#tabName\" tab")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(tabLocator)
        );
    }

    public static OpenTab withName(Tabs tabs)
    {
        return instrumented(OpenTab.class, tabs);
    }
}
