package StepDefs;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static endpoints.EndpointMethods.getSelectedPosts;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MyStepDef extends BaseStepDef {

    @When ("^I hit the posts for id (\\d+)$")
    public void i_hit_the_posts_for_id(int id){
        response =  getSelectedPosts(1);
        response.prettyPrint();
        response.then().statusCode(is(200));
    }

    @Then("^I should get \"([^\"]*)\" as \"([^\"]*)\"$")
    public void i_should_get_as(String key, String value){
        assertThat(response.jsonPath().getString(key).replaceAll("\n", " "),is(value));
    }

}
