package tests;

import org.junit.jupiter.api.Test;

public class TestGitHubSelenide extends TestBase {


    @Test
    void gitHubSoftAssertions() {
        gitHubSelenidePage
                .openGitHubSelenide()
                .openTab("wiki");
        gitHubSelenideWikiPage.selectPage("SoftAssertions");
        softAssertionsPage.findTestJUnit5();

    }
}
