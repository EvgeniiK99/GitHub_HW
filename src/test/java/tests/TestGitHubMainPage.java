package tests;

import org.junit.jupiter.api.Test;

public class TestGitHubMainPage extends TestBase {
    @Test
    void SolutionTest() {
        gitHubMainPage
                .openMainPage()
                .selectMenu("Solutions")
                .selectLink("Enterprise");
        enterprisePage
                .checkEnterprisePage();
    }
}
