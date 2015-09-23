package uk.co.agilekatas.katas.rockpaperscissors;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class RockPaperScissorsRandomAiStepdefs {

    private List<String> moves;
    private RandomAlgorithm algorithm;


    @Given("^I am using a random algorithm$")
    public void I_am_using_a_random_algorithm() {
        algorithm = new RandomAlgorithm(new Random());
    }

    @When("^I produce (\\d+) moves$")
    public void I_produce_moves(int number) {
        moves = new ArrayList<>();
        for (int i = 0; i < number; i++)
            moves.add(algorithm.generateMove());
    }

    @Then("^the moves should contain:$")
    public void the_moves_should_contain(List<String> moves) {
        assertThat(this.moves).containsAll(moves);
    }
}
