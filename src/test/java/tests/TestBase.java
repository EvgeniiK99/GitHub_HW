package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.*;

public class TestBase {
    GitHubSelenidePage gitHubSelenidePage = new GitHubSelenidePage();
    GitHubSelenideWikiPage gitHubSelenideWikiPage = new GitHubSelenideWikiPage();
    SoftAssertionsPage softAssertionsPage = new SoftAssertionsPage();
    GitHubMainPage gitHubMainPage = new GitHubMainPage();
    EnterprisePage enterprisePage = new EnterprisePage();

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
        Configuration.baseUrl = "https://github.com";
    }
}
