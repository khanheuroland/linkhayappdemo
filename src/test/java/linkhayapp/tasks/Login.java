package linkhayapp.tasks;

import linkhayapp.ui.LoginScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Login implements Task {
    String useraccount;
    String password;
    public Login(String username, String password)
    {
        this.useraccount = username;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.useraccount).into(LoginScreen.ACCOUNT_FIELD),
                Click.on(LoginScreen.NEXT_STEP_BUTTON),
                Enter.theValue(this.password).into(LoginScreen.PASSWORD_FIELD),
                Click.on(LoginScreen.LOGIN_BUTTON)
        );
    }

    public static LoginBuilder withUserName(String username)
    {
        return new LoginBuilder(username);
    }
    public static class LoginBuilder
    {
        private String username;
        public LoginBuilder(String username)
        {
            this.username = username;
        }

        public Login andPassword(String password)
        {
            return instrumented(Login.class, username, password);
        }
    }
}
