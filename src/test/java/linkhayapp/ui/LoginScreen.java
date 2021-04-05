package linkhayapp.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginScreen {
    public static Target LOGIN_FORM = Target.the("Login form").located(By.cssSelector("#loginForm"));
    public static Target ACCOUNT_FIELD = Target.the("Account field").located(By.cssSelector("input[name=account]"));
    public static Target NEXT_STEP_BUTTON = Target.the("Next button").located(By.cssSelector("a.btn-login"));
    public static Target PASSWORD_FIELD = Target.the("Password field").located(By.cssSelector("input[name=password]"));
    public static Target LOGIN_BUTTON = Target.the("Login button").located(By.cssSelector("div.btn-enter-pass a"));
}
