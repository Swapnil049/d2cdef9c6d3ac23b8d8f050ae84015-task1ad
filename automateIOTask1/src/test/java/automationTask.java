//import org.apache.commons.logging.Log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class automationTask {

    public static void main (String args[]) throws InterruptedException {
        Logger logger= Logger.getLogger("automationTask");
        PropertyConfigurator.configure("log4j.properties");
        locators getLoc = new locators();

        String chromedriverPath = getLoc.getChromeDriverPath();
        System.setProperty("webdriver.chrome.driver", chromedriverPath);

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        logger.info("Browser Opened");

        driver.get(getLoc.getUrl());
        Thread.sleep(3000);

        driver.findElement(By.xpath(getLoc.getLoginLink())).click();
        Thread.sleep(3000);

        if (driver.findElement(By.xpath(getLoc.getLoginEmail())).isDisplayed()){

            driver.findElement(By.xpath(getLoc.getLoginTab())).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath(getLoc.getLoginEmail())).clear();
            driver.findElement(By.xpath(getLoc.getLoginEmail())).sendKeys(getLoc.getUserName());
            driver.findElement(By.xpath(getLoc.getLoginPass())).sendKeys(getLoc.getPass());
            driver.findElement(By.xpath(getLoc.getLoginBtn())).click();
            Thread.sleep(3000);
        }

        if (driver.findElement(By.xpath(getLoc.getAppsLink())).isDisplayed()){

            driver.findElement(By.xpath(getLoc.getAppsLink())).click();
            Thread.sleep(3000);

            String connAppsCounter = driver.findElement(By.xpath(getLoc.getConnectedAppsCounter())).getText();
            System.out.println("App COunter = "+connAppsCounter);

            if (connAppsCounter.equals('0')){

                System.out.println("Not authorised....need to authorise gmail");
                logger.info("Not authorised....need to authorise gmail");
                /*
                driver.findElement(By.xpath(getLoc.getAddAppPlus())).click();

                driver.findElement(By.xpath(getLoc.getSearchApp())).clear();
                driver.findElement(By.xpath(getLoc.getSearchApp())).sendKeys("gmail");

                List<WebElement> ele = driver.findElements(By.xpath(getLoc.getAppList()));
                getLoc.clickElementFromList(driver, ele,"Gmail","text" );
                */

            }else{
                System.out.println("Counter else part");
                List<WebElement> connApps = driver.findElements(By.xpath(getLoc.getConnectedApps()));

                for(WebElement onele:connApps){
                    System.out.println("app name"+onele.getAttribute("title"));
                    if(onele.getAttribute("title").equalsIgnoreCase("Gmail")){

                        driver.findElement(By.xpath(getLoc.getCreateBotTop())).click();


                        List<WebElement> appNm = driver.findElements(By.xpath("//div[@class='app-item box link-like pull-left small']/span"));
                        getLoc.clickElementFromList(driver,appNm,"gmail","text");

                        String newEmailTrigger = getLoc.getNewEmailTrigger();
                        String folderLabelTrigger = getLoc.getFolderLabelTrigger();
                        String folderLabelTriggerList = getLoc.getFolderLabelTriggerList();
                        String doAllTheseApp = getLoc.getDoAllTheseApp();
                        String connectedApp2nd = getLoc.getConnectedApp2nd();
                        String sendAnEmailAction = getLoc.getSendAnEmailAction();
                        String fromNameButton = getLoc.getFromNameButton();
                        String fromNameOption = getLoc.getFromNameOption();
                        String fromAddressButton=getLoc.getFromAddressButton();
                        String fromEmailOption = getLoc.getFromEmailOption();
                        String toAddressInputField= getLoc.getToAddressInputField();
                        String subjectButton = getLoc.getSubjectButton();
                        String subjectOption = getLoc.getSubjectOption();
                        String emailBodyButton = getLoc.getEmailBodyButton();
                        String emailBodyOption = getLoc.getEmailBodyOption();
                        String saveBtn = getLoc.getSaveBtn();
                        String toggleSwitchOff = getLoc.getToggleSwitchOff();
                        String doneBtn = getLoc.getDoneBtn();

                        driver.findElement(By.xpath(newEmailTrigger)).click();
                        Thread.sleep(3000);
                        driver.findElement(By.xpath(folderLabelTrigger)).click();
                        List<WebElement> trigList = driver.findElements(By.xpath(folderLabelTriggerList));
                        getLoc.clickElementFromList(driver,trigList,"inbox","title");

                        driver.findElement(By.xpath(doAllTheseApp)).click();
                        Thread.sleep(1000);

                        driver.findElement(By.xpath(connectedApp2nd)).click();
                        Thread.sleep(2000);

                        driver.findElement(By.xpath(sendAnEmailAction)).click();
                        Thread.sleep(2000);

                        driver.findElement(By.xpath(fromNameButton)).click();
                        //Thread.sleep(2000);

                        driver.findElement(By.xpath(fromNameOption)).click();
                        Thread.sleep(2000);

                        driver.findElement(By.xpath(fromAddressButton)).click();
                        //Thread.sleep(2000);

                        driver.findElement(By.xpath(fromEmailOption)).click();
                        Thread.sleep(2000);

                        driver.findElement(By.xpath(toAddressInputField)).sendKeys(getLoc.getUserName());
                        Thread.sleep(2000);

                        driver.findElement(By.xpath(emailBodyButton)).click();
                        //Thread.sleep(2000);

                        driver.findElement(By.xpath(emailBodyOption)).click();
                        Thread.sleep(2000);

                        driver.findElement(By.xpath(subjectButton)).click();
                        //Thread.sleep(2000);

                        driver.findElement(By.xpath(subjectOption)).click();
                        Thread.sleep(2000);

                        driver.findElement(By.xpath(saveBtn)).click();
                        Thread.sleep(2000);

                        driver.findElement(By.xpath(toggleSwitchOff)).click();
                        Thread.sleep(2000);

                        driver.findElement(By.xpath(doneBtn)).click();
                        Thread.sleep(2000);




                    }
                }
                //getLoc.clickElementFromList(driver, connApps, "Gmail", "title");

            }





        }
        System.out.println("******************Execution Completed**********************");
        logger.info("******************Execution Completed**********************");
        driver.quit();
    }
}
