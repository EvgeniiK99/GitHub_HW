package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class EnterprisePage {
    public EnterprisePage checkEnterprisePage() {
        $("h4").shouldHave(text("GitHub for enterprises"));
        return this;
    }
}
