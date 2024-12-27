package org.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class ItOutsourcing {

    @Step("Проверить, что страница IT-outsourcing открылась")
    public ItOutsourcing forItOutsourcing(){
        $(By.xpath("//h1"))
                .shouldHave(text("Комплексный IT-аутсорсинг"))
                .shouldBe(visible);
        return this;
    }
}
