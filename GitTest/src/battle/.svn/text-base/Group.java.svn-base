package battle;

import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class Group {

	Collection<Combatant> col;
	
	public Group() {
		col = new Vector<Combatant>();
	}

	public void addCombatant(Combatant pFighter) {
		col.add(pFighter);
	}

	public Iterator<Combatant> getCombatants() {
		return col.iterator();
	}

	public void removeDead() {
		Iterator<Combatant> i = col.iterator();
		while (i.hasNext()) {
			Combatant c = i.next();
			if (c.isDefeated()) {
				col.remove(c);
				return;
			}
		}
	}

	/**
	 * 
	 * @return living member of group.  If none are still living last 
	 * fighter is returned instead.
	 */
	public Combatant getMember() {
		Iterator<Combatant> i = col.iterator();
		Combatant combatant = null;
		while (i.hasNext()) {
			combatant = i.next();
			if (!combatant.isDefeated()) return combatant;
		}
		return combatant;
	}

	/**
	 * 
	 * @return whether ther is still a living member of the group
	 */
	public boolean isDefeated() {
		Iterator<Combatant> i = col.iterator();
		while (i.hasNext()) {
			Combatant combatant = i.next();
			if (!combatant.isDefeated()) return false;
		}
		return true;
	}
	
	/**
	 * Takes two groups and makes them fight to the death for
	 * your amusement.  You sick bastard.
	 * @param p1 group 1
	 * @param p2 group 2
	 * @return negative if group 1 won, positive if group 2 won. 
	 *         zero if both groups are dead.
	 */
	static public int fight(Group g1, Group g2) {
		while (true) {
			Iterator<Combatant> i1 = g1.getCombatants();
			while (i1.hasNext()) {
				Combatant c = i1.next();
				c.attack(g2.getMember());
			}
			Iterator<Combatant> i2 = g2.getCombatants();
			while (i2.hasNext()) {
				Combatant c = i2.next();
				c.attack(g1.getMember());
			}
			g1.removeDead();
			g2.removeDead();
			if (g1.isDefeated() || g2.isDefeated()) {
				return (g1.isDefeated()?1:0) - (g2.isDefeated()?1:0);
			}
		}
	}
	
}
