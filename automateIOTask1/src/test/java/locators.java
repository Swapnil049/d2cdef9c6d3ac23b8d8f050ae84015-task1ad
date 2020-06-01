import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class locators {

    private String chromeDriverPath = "D://SeleniumJars//chromedriver.exe";
    private String url = "https://automate.io";
    private String loginLink = "//a[text()='Login']";
    private String loginTab = "//a[text()='LOGIN']";
    private  String loginEmail = "//input[@id='email']";
    private  String loginPass = "//input[@id='password']";
    private String loginBtn = "//button[@type='submit']";
    private String appsLink = "//a[text()='APPS']";
    private String botsLink = "//a[text()='BOTS']";
    private String createBotTop = "//a[text()='Create a Bot']";
    private String leftTopBar = "//div[@id='navbar']/ul[1]/li";
    private String connectedAppsCounter = "//div[@class='control-box control-box-flex']/ul[1]/li/span";
    private String connectedApps = "//div[@class='box app-item']/a/img";
    private String addAppPlus = "//div[@id='navbar']/following::div[4]/ul[2]/a";
    private String searchApp = "//input[@placeholder='Search']";
    private String appList = "//aio-user-app-add-figure/div/span";                   //use 'title' for app name
    private String userName = "swapnil.srivastava49@gmail.com";
    private String pass = "Swapnil49#";

    private String newEmailTrigger = "//button[@data-toggle='dropdown']/following::div[1]/li/div[@title='New Email']";
    private String folderLabelTrigger = "//aio-content-dropdown/aio-content-label[@class='flex-row-wrapper']/label[1]/following::button[1]";
    private String folderLabelTriggerList = "//aio-content-dropdown/aio-content-label[@class='flex-row-wrapper']/label[1]/following::li/div";
    private String doAllTheseApp = "//button[@title='add action']/preceding::button[1]";
    private String connectedApp2nd = "//button[@title='add action']/preceding::aio-user-app-select-figure[@title='Gmail'][1]/div/img";
    private String sendAnEmailAction = "//button[@data-toggle='dropdown']/following::div[1]/li/div[@title='Send an Email']";
    private String fromNameButton = "//*[contains(@id,'_send_mail')]/div[2]/div[3]/div[1]/aio-content-group[1]/div/aio-content-input/aio-content-editable/div/div/div[2]/button";
    private String fromNameOption = "//*[contains(@id,'_send_mail')]/div[2]/div[3]/div[1]/aio-content-group[1]/div/aio-content-input/aio-content-editable/div/div/div[2]/aio-searchable-dropdown/div/li[2]/div[1]";
    private String fromAddressButton="//*[contains(@id,'_send_mail')]/div[2]/div[3]/div[1]/aio-content-group[2]/div/aio-content-input/aio-content-editable/div/div/div[2]/button";
    private String fromEmailOption = "//*[contains(@id,'_send_mail')]/div[2]/div[3]/div[1]/aio-content-group[2]/div/aio-content-input/aio-content-editable/div/div/div[2]/aio-searchable-dropdown/div/li[3]/div[1]";
    private String toAddressInputField= "//*[contains(@id,'_send_mail')]/div[2]/div[3]/div[1]/aio-content-group[4]/div/aio-content-input[1]/aio-content-multiple-input/div[1]/aio-content-editable/div/div/div[1]";
    private String subjectButton = "//*[contains(@id,'_send_mail')]/div[2]/div[3]/div[1]/aio-content-group[6]/div/aio-content-input/aio-content-editable/div/div/div[2]/button";
    private String subjectOption = "//*[contains(@id,'_send_mail')]/div[2]/div[3]/div[1]/aio-content-group[6]/div/aio-content-input/aio-content-editable/div/div/div[2]/aio-searchable-dropdown/div/li[6]/div[1]";
    private String emailBodyButton = "//*[contains(@id,'_send_mail')]/div[2]/div[3]/div[1]/aio-content-group[8]/div/aio-content-input/aio-content-editable/div/div/div[2]/button/i";
    private String emailBodyOption = "//*[contains(@id,'_send_mail')]/div[2]/div[3]/div[1]/aio-content-group[8]/div/aio-content-input/aio-content-editable/div/div/div[2]/aio-searchable-dropdown/div/li[14]/div[1]/span[1]";
    private String saveBtn = "//a[text()='Save']";
    private String toggleSwitchOff = "//span[text()='OFF']";
    private String doneBtn = "//button[contains(@class,'fixed-size-button')]";

    public String getChromeDriverPath() {
        return chromeDriverPath;
    }

    public String getUserName() {
        return userName;
    }

    public String getNewEmailTrigger() {
        return newEmailTrigger;
    }

    public String getFolderLabelTrigger() {
        return folderLabelTrigger;
    }

    public String getFolderLabelTriggerList() {
        return folderLabelTriggerList;
    }

    public String getDoAllTheseApp() {
        return doAllTheseApp;
    }

    public String getConnectedApp2nd() {
        return connectedApp2nd;
    }

    public String getSendAnEmailAction() {
        return sendAnEmailAction;
    }

    public String getFromNameButton() {
        return fromNameButton;
    }

    public String getFromNameOption() {
        return fromNameOption;
    }

    public String getFromAddressButton() {
        return fromAddressButton;
    }

    public String getFromEmailOption() {
        return fromEmailOption;
    }

    public String getToAddressInputField() {
        return toAddressInputField;
    }

    public String getSubjectButton() {
        return subjectButton;
    }

    public String getSubjectOption() {
        return subjectOption;
    }

    public String getEmailBodyButton() {
        return emailBodyButton;
    }

    public String getEmailBodyOption() {
        return emailBodyOption;
    }

    public String getSaveBtn() {
        return saveBtn;
    }

    public String getToggleSwitchOff() {
        return toggleSwitchOff;
    }

    public String getDoneBtn() {
        return doneBtn;
    }

    public String getPass() {
        return pass;
    }

    public String getUrl() {
        return url;
    }

    public String getLoginEmail() {
        return loginEmail;
    }

    public String getLoginPass() {
        return loginPass;
    }

    public String getLoginLink() {
        return loginLink;
    }

    public String getAppsLink() {
        return appsLink;
    }

    public String getLeftTopBar() {
        return leftTopBar;
    }

    public String getAddAppPlus() {
        return addAppPlus;
    }

    public String getSearchApp() {
        return searchApp;
    }

    public String getAppList() {
        return appList;
    }

    public String getLoginBtn() {
        return loginBtn;
    }

    public String getLoginTab() {
        return loginTab;
    }

    public String getConnectedApps() {
        return connectedApps;
    }

    public String getConnectedAppsCounter() {
        return connectedAppsCounter;
    }

    public String getBotsLink() {
        return botsLink;
    }

    public String getCreateBotTop() {
        return createBotTop;
    }


    public void clickElementFromList(WebDriver driver, List<WebElement> ele, String searchVal, String searchAttrib){

        for (WebElement eachEle : ele){

            if(searchAttrib.equalsIgnoreCase("text")){
                String eleText = eachEle.getText();
                if (eleText.equalsIgnoreCase(searchVal)){
                    eachEle.click();
                }
            }else{
                //System.out.println("ListVal="+eachEle.getAttribute(searchAttrib));
                if (eachEle.getAttribute(searchAttrib).equalsIgnoreCase(searchVal)){
                    eachEle.click();
                }
            }
        }
    }

}
