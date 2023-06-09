package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class GitHubSelenideWikiPage {
    SelenideElement rightBar = $(".wiki-rightbar");

    public GitHubSelenideWikiPage selectPage(String pageName) {
        rightBar.$("#wiki-pages-filter").setValue(pageName);
        rightBar.$$("a").findBy(text(pageName)).click();
        return this;
    }


}
