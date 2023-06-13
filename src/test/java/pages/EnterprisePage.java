package pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class EnterprisePage {
    public EnterprisePage checkEnterprisePage() {
        $(".application-main").shouldHave(text("GitHub for enterprises"));
        return this;
    }
}
