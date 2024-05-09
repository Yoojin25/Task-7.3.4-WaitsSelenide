package web_elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class Elements {
    public static SelenideElement addAndRemove = $x("//a[@href='/add_remove_elements/']");
    public static SelenideElement add = $x("//button[@onclick='addElement()']");
    public static SelenideElement delete = $x("//button[@class='added-manually']");
    public static SelenideElement keyPresses = $x("//a[@href='/key_presses']");
    public static SelenideElement inputKeyPresses = $x("//input[@id='target']");
    public static SelenideElement resultKeyPresses = $x("//p[@id='result']");
    public static SelenideElement checkboxes = $x("//a[@href='/checkboxes']");
    public static SelenideElement checkbox1 = $x("//input[@type='checkbox'][1]");
    public static SelenideElement inputs = $x("//a[@href='/inputs']");
    public static SelenideElement inputsNumber = $x("//input[@type='number']");
    public static SelenideElement dynamicLoading = $x("//a[@href='/dynamic_loading']");
    public static SelenideElement example1 = $x("//a[@href='/dynamic_loading/1']");
    public static SelenideElement start = $x("//button");
    public static SelenideElement helloWorld = $x("//div[@id='finish']/h4");
    public static SelenideElement alerts = $x("//a[@href='/javascript_alerts']");
    public static SelenideElement clickConfirm = $x("//button[@onclick='jsConfirm()']");
    public static SelenideElement formAuthentication = $x("//a[@href='/login']");
    public static SelenideElement username = $x("//input[@id='username']");
    public static SelenideElement password = $x("//input[@id='password']");
    public static SelenideElement login = $x("//button[@class='radius']");
    public static SelenideElement successLogin = $x("//div[@id='flash']");
    public static SelenideElement dropdown = $x("//a[@href='/dropdown']");
    public static SelenideElement selectOption = $x("//select[@id='dropdown']");
}
