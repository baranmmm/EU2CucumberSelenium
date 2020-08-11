package com.vytrack.step_definitions;

import com.vytrack.pages.ContactsPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ContactsStepDefs {

    @When("the user clicks the {string} from contacts")
    public void the_user_clicks_the_from_contacts(String email) {
        ContactsPage contactsPage=new ContactsPage();
        contactsPage.getContactEmail(email).click();


    }

    @Then("the information should be same with the database")
    public void the_information_should_be_same_with_the_database() {

        //get actual data from UI


        //get expected data from database


        //Compare UI with DB


    }
}
