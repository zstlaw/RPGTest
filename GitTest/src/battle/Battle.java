package battle;

import java.util.Random; 

/** 
 * Created on Apr 11, 2005 
 * @author zstlaw 
 * 
 * Simple test class for Dnd ideas
 */ 
public class Battle { 

    final static private Random rand = new Random(); 

    public static void main(String[] args) { 
		

		System.out.println("No Armor");
		for (int x = 1; x <= 1 ; x++) {
			fightMockDuel(10000, x, 2, 2, 2, 1, 4, 0, 2);
			fightMockDuel(10000, x, 2, 2, 2, 1, 3, 1, 2);
			fightMockDuel(10000, x, 2, 2, 2, 1, 2, 2, 2);
			fightMockDuel(10000, x, 2, 2, 2, 1, 1, 3, 2);
			fightMockDuel(10000, x, 2, 2, 2, 1, 0, 4, 2);
		}
		System.out.println("Light Armor");
		for (int x = 1; x <= 1 ; x++) {
			fightMockDuel(10000, x, 2, 2, 2, 1, 4, 0, 2);
			fightMockDuel(10000, x, 2, 2, 2, 1, 3, 1, 2);
			fightMockDuel(10000, x, 2, 2, 2, 1, 2, 2, 2);
			fightMockDuel(10000, x, 2, 2, 2, 1, 1, 3, 2);
			fightMockDuel(10000, x, 2, 2, 2, 1, 0, 4, 2);
		}
		System.out.println("Heavy Armor");
		for (int x = 1; x <= 1 ; x++) {
			fightMockDuel(10000, x, 2, 2, 2, 1, 4, 0, 2);
			fightMockDuel(10000, x, 2, 2, 2, 1, 3, 1, 2);
			fightMockDuel(10000, x, 2, 2, 2, 1, 2, 2, 2);
			fightMockDuel(10000, x, 2, 2, 2, 1, 1, 3, 2);
			fightMockDuel(10000, x, 2, 2, 2, 1, 0, 4, 2);
		}
		
		System.out.println("MOCK BATTLES");
		fightMockBattle(1000, 1, 1, 2, 1);
		fightMockBattle(1000, 1, 2, 2, 1);
		fightMockBattle(1000, 1, 3, 2, 1);
		fightMockBattle(1000, 1, 4, 2, 1);
		fightMockBattle(1000, 1, 5, 2, 1);
		fightMockBattle(1000, 1, 6, 2, 1);
		fightMockBattle(1000, 1, 1, 3, 1);
		fightMockBattle(1000, 1, 2, 3, 1);
		fightMockBattle(1000, 1, 3, 3, 1);
		fightMockBattle(1000, 1, 4, 3, 1);
		fightMockBattle(1000, 1, 5, 3, 1);
		fightMockBattle(1000, 1, 6, 3, 1);
		fightMockBattle(1000, 1, 7, 3, 1);
		fightMockBattle(1000, 1, 8, 3, 1);
	} 

    /** 
     * conduct mock battles
     */ 
    public static void fightMockDuel(final int pNum, final int pLev1, 
			final int pStr1, final int pDex1, final int pArm1, 
			final int pLev2, final int pStr2, final int pDex2, 
			final int pArm2) { 
		int f1Wins = 0;
		int f2Wins = 0;
		int numTies = 0;
		int f1MassDamKills = 0;
		int f2MassDamKills = 0;
		
		for (int x=0; x<pNum; x++) {
			Fighter f1 = new Fighter(pLev1, pStr1, pDex1, pArm1);
			Fighter f2 = new Fighter(pLev2, pStr2, pDex2, pArm2);
			int result = Fighter.fight(f1, f2);
			if (f2.hp == -40) f1MassDamKills++;
			if (f1.hp == -40) f2MassDamKills++;
			if (result == -1) f1Wins++;
			if (result == 1) f2Wins++;
			if (result == 0) numTies++;
		}
		System.out.println(" Battle [" +  pLev1 + " vs " + pLev2 + "]\t" + 
				(100.0*f1Wins)/pNum + "\t" + //(100.0*numTies)/pNum + "\t" + 
				(100.0*f2Wins)/pNum + "\t" + 
				(100.0*f1MassDamKills)/pNum + "\t" +
				(100.0*f2MassDamKills)/pNum);
    } 

	/**
	 * Fight mock battles
	 * @param pNumBattles number of battles to fight.
	 * @param pNum1 number of combatants in group 1
	 * @param pLev1 level of group 1 members
	 * @param pNum2 number of combatants in group 1
	 * @param pLev2 level of group 2 members
	 */
    public static void fightMockBattle(final int pNumBattles, final int pNum1, final int pLev1, final int pNum2, final int pLev2) { 
		int g1Wins = 0;
		int g2Wins = 0;
		
		for (int x=0; x<pNumBattles; x++) {
			Group g1 = new Group();
			Group g2 = new Group();
			for (int g1Count=0; g1Count<pNum1; g1Count++) {
				Fighter f = new Fighter(pLev1, 2, 2, 2);
				g1.addCombatant(f);
			}
			for (int g2Count=0; g2Count<pNum2; g2Count++) {
				Fighter f1 = new Fighter(pLev2, 2, 2, 2);
				g2.addCombatant(f1);
			}
			int result = Group.fight(g1, g2);
			if (result == -1) g1Wins++;
			if (result == 1) g2Wins++;
		}
		System.out.println(" Battle [" + pNum1 + "*" +  pLev1 + " vs " + 
				 pNum2 + "*" + pLev2 + "]\t" + 
				 (100.0*g1Wins)/pNumBattles + "\t" +  
				(100.0*g2Wins)/pNumBattles);
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
