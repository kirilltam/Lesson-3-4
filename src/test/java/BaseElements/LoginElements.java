package BaseElements;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class LoginElements {
    public static SelenideElement username = $x("//*[@id='login-form-username']");
    public static SelenideElement password = $x("//*[@id='login-form-password']");
    public static SelenideElement loginBtn = $x("//*[@id='login']");

    //Assert Element
    public static SelenideElement asserElement = $x("//h1");

}
