package linkhayapp.questions;

import linkhayapp.ui.AppScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ScreenTitle implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(AppScreen.TITLE).viewedBy(actor).asString();
    }

    public static Question<String> title()
    {
        return new ScreenTitle();
    }
}
