package BaseElements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class TaskElements {
//    public static SelenideElement bugTupe = $x("//input[@id='issuetype-field']");
//    public static SelenideElement bugTypeSort = $x("//*[@id='type-val']");//input[@role='combobox'])[2]//following-sibling::div//Li[contains(text(),'Ошибка' )]
//    public static SelenideElement thematic = $x("input[@name='summary']");
//    public static SelenideElement aboutBug = $x("(//textarea(@name='description']");
//    public static SelenideElement versionA = $x("(//option(@value='10001])[1]");
//    public static SelenideElement aboutBug2 = $x("//textarea(@name='environment']");
//    public static SelenideElement versionB = $x("(//option[@value='10001'])[2]");
//    public static SelenideElement assignMe = $x("//button[contains(text(),'Назначить меня')]");
//    public static SelenideElement createBtn = $x("(//input(@value='Создать']");
//    public static SelenideElement alLTasks = $x("//a[contains(@title, 'Поиск и просмотр недавних задач')]");
//    public static SelenideElement myTasks = $x("(//a[contains(text(), 'Мои открытые задачи')])[1]");
//    public static SelenideElement ownTask = $x("//li(@title='123123']");
//    public static SelenideElement businessProcessBtn = $x("//span[text()='Бизнес-процесс']");
//    public static SelenideElement doneBtn = $x("//span[text()='Выполнено']");
//    public static SelenideElement statusval=$x("//strong(contains[text(),'Статус:')]//following-sibling::span");
//    public static SelenideElement versionCheck = $x("//strong[@title='Исправить в версиях']//following-sibling::span");



//}

    public static SelenideElement createBtn = $x("//*[@id='create_link']");
    public static SelenideElement taskType = $x("//*[@id='issuetype-single-select']/span");

    public static SelenideElement taskName = $x("//input[@class='text long-field']");
    public static SelenideElement description = $x("//body[@id='jira']/ancestor::html//div[@class='wiki-edit-content']//iframe");
    public static SelenideElement version2 = $x("//*[@id='fixVersions']/optgroup/option[2]");
    public static SelenideElement priorityVer = $x("//*[@id='priority-field']");

    public static SelenideElement environment = $x("//iframe[@id='mce_32_ifr']");





}

