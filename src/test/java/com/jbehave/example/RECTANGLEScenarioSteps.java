package com.jbehave.example;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.jbehave.example.Rectangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RECTANGLEScenarioSteps {

    private Rectangle rectangle;
   

    @Given("un rectangle avec un identifiant <id>")
    public void crerRectangle(@Named("id") int id) {
    	rectangle = new Rectangle(id);
    }

    @When("longueur est égale à <longueur>")
    public void setLongueur(@Named("longueur") int longueur) {
    	rectangle.setLongueur(longueur);
    }

    @When("largeur est égale à <largeur>")
    public void setLargeur(@Named("largeur") int largeur) {
    	rectangle.setLargeur(largeur);
    }

    @Then("surface est égale à <surface>")
    public void checkMoney(@Named("surface") int surface) {
        assertThat(rectangle.getSurface(), is(surface));
    }


}
