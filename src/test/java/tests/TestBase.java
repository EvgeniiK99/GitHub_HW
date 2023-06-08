package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.GitHubWikiPage;

public class TestBase {
    GitHubWikiPage gitHubWikiPage = new GitHubWikiPage();
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://github.com";
        Configuration.holdBrowserOpen = true;

    }
}
