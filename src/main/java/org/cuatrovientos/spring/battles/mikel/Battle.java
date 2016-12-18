/**
 * 
 */
package org.cuatrovientos.spring.battles.mikel;

import java.util.Random;

/**
 * Battle
 * 
 * @author Eugenia Pérez
 */
public class Battle {
	private Army army1;
	private Army army2;

	public Battle() {

	}

	/**
	 * makes war and returns the winner
	 * 
	 * @return
	 */
	public Army makeWar() {
		do {
			engage(army1.getRandomSoldier(), army2.getRandomSoldier());
		} while (!army1.areAllDead() && !army2.areAllDead());

		// Return just the winner
		return (army1.areAllDead() ? army2 : army1);
	}

	/**
	 * engages to soldiers, the one wirh more firepower wins
	 * 
	 * @param soldier1
	 * @param soldier2
	 * @return
	 */
	public Soldier engage(Soldier soldier1, Soldier soldier2) {
		if (soldier1.getFirePower() > soldier2.getFirePower()) {
			army2.remove(soldier2);
			return soldier1;
		} else {
			army1.remove(soldier1);
			return soldier2;
		}
	}

	/**
	 * @return the army1
	 */
	public Army getArmy1() {
		return army1;
	}

	/**
	 * @param army1
	 *            the army1 to set
	 */
	public void setArmy1(Army army1) {
		this.army1 = army1;
	}

	/**
	 * @return the army2
	 */
	public Army getArmy2() {
		return army2;
	}

	/**
	 * @param army2
	 *            the army2 to set
	 */
	public void setArmy2(Army army2) {
		this.army2 = army2;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Battle [army1=" + army1 + ", army2=" + army2 + "]";
	}

}
