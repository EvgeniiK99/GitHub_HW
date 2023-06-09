package pages;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.lang.String.format;

public class GitHubSelenidePage {
    public GitHubSelenidePage openGitHubSelenide() {
        open("/selenide/selenide");
        return this;
    }

    public GitHubSelenidePage openTab(String tabName) {
        $(format("#%s-tab", tabName)).click();
        return this;
    }
}
