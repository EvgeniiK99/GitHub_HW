package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.String.format;

public class GitHubWikiPage {
    SelenideElement rightBar = $(".wiki-rightbar");

    public GitHubWikiPage openGitHubSelenide() {
        open("/selenide/selenide");
        return this;
    }

    public GitHubWikiPage openTab(String tabName) {
        $(format("#%s-tab", tabName)).click();
        return this;
    }

    public GitHubWikiPage selectPage(String pageName) {
        rightBar.$("#wiki-pages-filter").setValue(pageName);
        rightBar.$$("a").findBy(text(pageName)).click();
        return this;
    }

    public GitHubWikiPage findTestJUnit5() {
        $("#wiki-body").$(byText("3. Using JUnit5 extend test class:")).sibling(0).shouldHave(exactText("@ExtendWith({SoftAssertsExtension.class})\n" +
                "class Tests {\n" +
                "  @Test\n" +
                "  void test() {\n" +
                "    Configuration.assertionMode = SOFT;\n" +
                "    open(\"page.html\");\n" +
                "\n" +
                "    $(\"#first\").should(visible).click();\n" +
                "    $(\"#second\").should(visible).click();\n" +
                "  }\n" +
                "}"));
        return this;
    }
}
