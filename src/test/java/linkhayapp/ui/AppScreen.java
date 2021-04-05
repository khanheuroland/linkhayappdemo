package linkhayapp.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

public class AppScreen {
    public static final Target TITLE = Target.the("App title")
            .located(By.id("vn.vcc.linkhayapp:id/tvTitle"));
    public static final Target MENU_BUTTON = Target.the("Menu button")
            .located(By.id("vn.vcc.linkhayapp:id/btnTicker"));
    public static final Target POST_NEWS_BUTTON = Target.the("Post News button")
            .located(By.id("vn.vcc.linkhayapp:id/layoutPostNews"));
    public static final Target POST_IMAGE_BUTTON = Target.the("Post Image button")
            .located(By.id("vn.vcc.linkhayapp:id/layoutPostImage"));
    public static final Target POST_VIDEO_BUTTON = Target.the("Post Video button")
            .located(By.id("vn.vcc.linkhayapp:id/layoutPostVideo"));
    public static final Target TAB_HOT = Target.the("Hot News tab button")
            .located(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Hot\"]"));
    public static final Target TAB_NEW = Target.the("New News tab button")
            .located(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"New\"]"));
    public static final Target TAB_FRIEND = Target.the("Friend tab button")
            .located(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Friend\"]"));
    public static final Target TAB_UPDATE =Target.the("Update tab button")
            .located(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Update\"]"));
    public static final Target TAB_PERSONAL = Target.the("Personal tab button")
            .located(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Personal\"]"));

    public static final Target PUT_DISPLAY_NAME = Target.the("Input display name")
            .located(By.id("vn.vcc.linkhayapp:id/action_bar_root"));
}
