/**
 * 
 */
package org.cuatrovientos.spring.battles.mikel;

import java.util.Random;
import java.util.Vector;

/**
 * It manages an Army
 * @author Eugenia Pérez
 */
public class Army  {
	private String name;
	private Vector<Soldier> soldiers;
	
	/**
	 * constructor, calls init to create the crowd
	 * @param total Runners to create
	 */
	public Army(String name) {
		this.name = name;
	}


	/**
	 * removes a dead soldier from our army
	 * @param soldier
	 */
	public void remove (Soldier soldier) {
		soldiers.removeElement(soldier);
	}

	/**
	 * if there are no soldiers left, army is dead
	 * @return
	 */
	public boolean areAllDead () {
		return (soldiers.size() == 0);
	}

	/**
	 * returns one random soldier from army
	 * @return
	 */
	public Soldier getRandomSoldier() {
		Random random = new Random();
		
		return soldiers.elementAt(random.nextInt(soldiers.size()));
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the soldiers
	 */
	public Vector<Soldier> getSoldiers() {
		return soldiers;
	}


	/**
	 * @param soldiers the soldiers to set
	 */
	public void setSoldiers(Vector<Soldier> soldiers) {
		this.soldiers = soldiers;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Army [name=" + name + ", soldiers=" + soldiers + "]";
	}

}

