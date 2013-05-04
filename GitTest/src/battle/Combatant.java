package battle;


public interface Combatant {
	
	public void attack(Combatant pEnemy) ;
	
	public void takeDamage(int pDam, boolean pIgnoreArmor) ;

	public boolean isDefeated() ;

	public int getDefense() ;

	public int getStr() ;

	public void saveVsMassiveDamage(int pDamage) ;
}
