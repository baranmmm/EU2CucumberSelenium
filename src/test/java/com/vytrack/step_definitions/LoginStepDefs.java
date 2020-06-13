package com.vytrack.step_definitions;

import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.util.Map;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url= ConfigurationReader.get("url");
//        WebDriver driver= Driver.get();
//        driver.get(url);
        Driver.get().get(url);

    }

    @When("the user enter the driver information")
    public void the_user_enter_the_driver_information() {
        LoginPage loginPage=new LoginPage();
        //loginPage.login(ConfigurationReader.get("driver_username"), ConfigurationReader.get("driver_password"));
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        loginPage.login(username, password);


    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {

        BrowserUtils.waitFor(4);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Verify title", "Dashboard", actualTitle);

    }

    @When("the user enter the store manager information")
    public void the_user_enter_the_store_manager_information() {
        LoginPage loginPage=new LoginPage();
        String username = ConfigurationReader.get("store_manager_username");
        String password = ConfigurationReader.get("store_manager_password");
        loginPage.login(username, password);
    }

    @When("the user enter the sales manager information")
    public void the_user_enter_the_sales_manager_information() {
        LoginPage loginPage=new LoginPage();
        String username = ConfigurationReader.get("sales_manager_username");
        String password = ConfigurationReader.get("sales_manager_password");
        loginPage.login(username, password);
    }

    @When("the user logs in using {string} username and {string} password")
    public void the_user_logs_in_using_username_and_password(String username, String password) {
        LoginPage loginPage=new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the title should be {string}")
    public void the_title_should_be(String expectedTitle) {

        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userProfile) {
        the_user_is_on_the_login_page();
        if(userProfile.equalsIgnoreCase("driver")){
            the_user_enter_the_driver_information();
        }else if(userProfile.equalsIgnoreCase("sales manager")){
            the_user_enter_the_sales_manager_information();
        }else if(userProfile.equalsIgnoreCase("store manager")){
            the_user_enter_the_store_manager_information();
        }else{
            System.out.println("Invalid user profile");
        }
    }

    @When("the user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String , String > userInfo) {

        LoginPage loginPage=new LoginPage();
        loginPage.login(userInfo.get("username"), userInfo.get("password"));
        DashboardPage dashboardPage=new DashboardPage();
        String actualUserName = dashboardPage.getUserName();
        String expectedUserName=userInfo.get("firstname")+" "+userInfo.get("lastname");
        Assert.assertEquals(expectedUserName, actualUserName);

    }

}
