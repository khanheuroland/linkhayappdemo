package linkhayapp.questions;

import linkhayapp.ui.AppScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class DisplayNamePopup implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        return AppScreen.PUT_DISPLAY_NAME.resolveAllFor(actor).size()>0;
    }

    public static Question<Boolean> isShow()
    {
        return new DisplayNamePopup();
    }
}
