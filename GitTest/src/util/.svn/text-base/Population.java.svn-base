package util;

import java.util.Random;

/**
 * Created on Apr 11, 2005
 * @author zstlaw
 *
 * Simple test class for Dnd ideas
 */
public class Population {

    final static private Random rand = new Random();

    public static void main(String[] args) {

        System.out.println(Dice.roll(10,6)-35);
        calculatePopulation(12000);
        calculatePopulation(10000);
        calculatePopulation(500);

	}

    /**
     * Calculate number of individuals of each level in population.
     * Note : we are using straight 1/(power of 2) probability. So
     * there are half as many of level 2 as one, etc.
     * @param pPopulation number of people.
     */
    public static void calculatePopulation(final int pPopulation) {
        System.out.println("Calculating for a population of " + pPopulation);
        for (int x = 1; pPopulation/Math.pow(2, x) > 1; x++) {
            System.out.println("Level " + x + " = " +
                    ((int) (pPopulation/Math.pow(2, x))));
        }
    }

}
