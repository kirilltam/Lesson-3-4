package Hooks;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;

import io.cucumber.java.Before;

import io.qameta.allure.selenide.AllureSelenide;
import static com.codeborne.selenide.Selenide.screenshot;




public class AllureResponse {




   @Before
    public static void setUp(){
       Configuration.reportsFolder = "allure-results";
        String listenerN = "AllureSelenide";

        // if (!SelenideLogger.hasListener((listenerN))) {

            SelenideLogger.addListener(listenerN, new AllureSelenide().screenshots(true)
                    .savePageSource(true));

        }


    }


