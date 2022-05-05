package WebHooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;


public class WebHooks {
    @BeforeAll
    public static void SetUp(){
        Configuration.startMaximized = true;

        }
    @AfterEach
    public void SetDown() {
        WebDriverRunner.closeWebDriver();
    }

//    public void setUp(){
//        WebDriverManager.chromedriver().setup();
//        com.codeborne.selenide.Configuration.driverManagerEnabled = true;
//        com.codeborne.selenide.Configuration.browserSize = "1920x1080";
//    }
//
//    @Before
//    public void Init() {
//        setUp();
//
//
//
//
//    }
//    @After
//    public void tearDown(){
//        Selenide.closeWebDriver();
//
//    }


}