package battle;

import util.Dice;


public class Fighter implements Combatant {

	static final int BASEDEFENSE = 15;
	static final int CRITBY = 10;
	final int level;
	int hp = 10;
	int baseAttack;
	int baseDefense;
	int strBonus;
	int conBonus = 2;
	int dexBonus;
	int damDie = 8;
	int armor;
	int fortSave;
		
	/**
	 * Create a mock fighter
	 * @param pLevel Level of the fighter to be created
	 */
	public Fighter(int pLevel, int pStr, int pDex, int pArmor) {
		level = pLevel;
		strBonus = pStr;
		dexBonus = pDex;
		armor = pArmor;
		baseAttack = 3 + strBonus + level;
		baseDefense = 3 + dexBonus + level;
		fortSave = (3 + pLevel)/2 + conBonus;
		hp = (10 + (conBonus * 2)) + pLevel * 2;
	}
	
	/**
	 * Takes two fighters and makes them fight to the death for
	 * your amusement.  You sick bastard.
	 * @param p1 combatant 1
	 * @param p2 combatant 2
	 * @return negative if 1 won, positive if 2 won. zero if both died.
	 */
	static public int fight(Combatant p1, Combatant p2) {
		boolean done = false;
		while (!done) {
			p1.attack(p2);
			p2.attack(p1);
			if (p1.isDefeated() || p2.isDefeated()) {
				done = true;
			}
		}
		return (p1.isDefeated()?1:0) - (p2.isDefeated()?1:0);
	}
	
	public void attack(Combatant pEnemy) {
		int attackRoll = Dice.rollD20();
		int attackTotal = attackRoll + baseAttack + calcAttackModifiers();
		if (attackTotal >= pEnemy.getDefense()) {
			int dam = rollDamage();
			pEnemy.takeDamage(dam, attackRoll > 20);
			if (attackTotal >= pEnemy.getDefense() + CRITBY) {
				pEnemy.saveVsMassiveDamage(dam);
			}
		}
		
	}
	
	public void takeDamage(int pDam, boolean pIgnoreArmor) {
		int lostHp = (pDam - (pIgnoreArmor ? 0 : armor));
		if (lostHp > 0) {
			hp -= lostHp;					
		}
	}

	public boolean isDefeated() {
		return hp <= 0;		
	}

	public int getStr() {
		return strBonus;		
	}
	
	public int getDefense() {
		return BASEDEFENSE + calcDefenseModifiers() + baseDefense;		
	}

	public void saveVsMassiveDamage(int pDamage) {
		int save = (Dice.rollD20() + fortSave);
		if (save+5 < (10 + pDamage/2)) {
			// person failed badly health at -1 and bleeding.
			hp = -40;
		} else if (save < (10 + pDamage/2)) {
			// person barely faile HP should be 0
			hp = -40;
		}	
	}
	
	protected int calcAttackModifiers() {
		// placeholder for something better
		return 0;		
	}

	protected int calcDefenseModifiers() {
		// placeholder for something better
		return 0;		
	}

	protected int rollDamage() {
		return Dice.roll(damDie) + strBonus;		
	}

}
