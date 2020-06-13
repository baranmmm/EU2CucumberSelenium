package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NavigationMenuStepDefs {

    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {
        System.out.println("The user navigated to Fleet then Vehicles");
    }

    @Then("title should be Vehicles")
    public void title_should_be_Vehicles() {

        System.out.println("Title is Vehicles");
    }

    @When("the user navigates to Marketing, Campaigns")
    public void the_user_navigates_to_Marketing_Campaigns() {
        System.out.println("The user navigated to Marketing then Campaigns");
    }

    @Then("title should be Campaigns")
    public void title_should_be_Campaigns() {
        System.out.println("Title is Campaigns");
    }

    @When("the user navigates to Activities, Calendar Events")
    public void the_user_navigates_to_Activities_Calendar_Events() {
        System.out.println("The user navigated to Activities then Calendar Events");
    }

    @Then("title should be Calendar Events")
    public void title_should_be_Calendar_Events() {
        System.out.println("Title is Calendar Events");
    }

    @When("the user navigates to {string} then {string}")
    public void the_user_navigates_to_then(String string, String string2) {
        DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.navigateToModule(string, string2);
    }

    @Then("default page number should be {int}")
    public void default_page_number_should_be(Integer expectedPageNumber) {
        ContactsPage contactsPage=new ContactsPage();

        String pageNumberText = contactsPage.pageNumber.getAttribute("value");
        Integer actualPageNumber= Integer.parseInt(pageNumberText);
        Assert.assertEquals(expectedPageNumber,actualPageNumber);

    }

    @Then("the user should see the following options")
    public void the_user_should_see_the_following_options(List<String > expectedMenuOptions) {

        BrowserUtils.waitFor(3);
        DashboardPage dashboardPage=new DashboardPage();
        List<WebElement> MenuOptionsList = dashboardPage.menuOptions;
        List<String> actualMenuOptions = BrowserUtils.getElementsText(MenuOptionsList);

        Assert.assertEquals(expectedMenuOptions,actualMenuOptions);

    }

}
