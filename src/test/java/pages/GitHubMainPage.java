package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class GitHubMainPage {
    public GitHubMainPage openMainPage() {
        open("");
        return this;
    }
    public GitHubMainPage selectMenu(String menu) {
        $$("button").findBy(text(menu)).hover();


        return this;
    }
    public GitHubMainPage selectLink(String link) {
        $$("a.HeaderMenu-dropdown-link").findBy(text(link)).click();
        return this;
    }

}
