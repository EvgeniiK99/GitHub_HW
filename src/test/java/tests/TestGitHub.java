package tests;

import org.junit.jupiter.api.Test;

public class TestGitHub extends TestBase {


    @Test
    void gitHubSoftAssertions() {
        gitHubWikiPage
                .openGitHubSelenide()
                .openTab("wiki")
                .selectPage("SoftAssertions")
                .findTestJUnit5();
    }
}
