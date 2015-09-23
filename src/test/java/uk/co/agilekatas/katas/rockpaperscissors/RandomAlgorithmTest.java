package uk.co.agilekatas.katas.rockpaperscissors;

import org.junit.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomAlgorithmTest {

    private TestRandom random = new TestRandom();
    private RandomAlgorithm algorithm = new RandomAlgorithm(random);

    @Test
    public void shouldReturnRock() {
        random.setNextInt(0);
        String move = algorithm.generateMove();
        assertThat(move).isEqualTo("Rock");
    }

    @Test
    public void shouldReturnScissors() {
        random.setNextInt(1);
        String move = algorithm.generateMove();
        assertThat(move).isEqualTo("Scissors");
    }

    @Test
    public void shouldReturnPaper() {
        random.setNextInt(2);
        String move = algorithm.generateMove();
        assertThat(move).isEqualTo("Paper");
    }

    private class TestRandom extends Random {

        private int nextInt;

        public void setNextInt(int nextInt) {
            this.nextInt = nextInt;
        }

        @Override
        public int nextInt(int bound) {
            return nextInt;
        }
    }
}