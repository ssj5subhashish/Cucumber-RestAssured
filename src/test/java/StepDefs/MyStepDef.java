package StepDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDef extends BaseStepDef {

    @When ("^I hit the posts for id (\\d+)$")
    public void i_hit_the_posts_for_id(int id){
        System.out.println("This Works");
    }

    @Then("^I should get \"([^\"]*)\" as \"([^\"]*)\"$")
    public void i_should_get_as(String value, String key){
        System.out.println("This works too");
    }


}
