package util;

import java.util.Random;

/**
 * Created on Apr 11, 2005
 * @author zstlaw
 *
 * Simple test class for Dnd ideas
 */
public class Dice {

    final static private Random rand = new Random();

    /**
     * Contains special open ended rules for d20
     */
    public static int rollD20() {
		int total = 0;
		int roll = 0;
		do {
			roll = roll(20);
			total += roll;
		} while (20 == roll);

        return total;
    }

	/**
     * Roll die of size given in arguement
     * @param pDie size 20 for a 1d20
     * @return number between 1 and pDie.
     */
    public static int roll(final int pDie) {
        return rand.nextInt(pDie) + 1;
    }

    /**
     * Roll multiple die of size given in arguement
     * @param pNum number of dice.
     * @param pDie size 20 for a 1d20
     * @return number as if pNum dice of size dDie were rolled.
     */
    public static int roll(final int pNum , final int pDie) {
        int total = 0;
        for (int x = pNum; x > 0; x--) {
            total += roll(pDie);
        }
        return total;
    }


}
