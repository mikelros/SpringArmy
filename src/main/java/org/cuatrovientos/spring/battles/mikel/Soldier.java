package org.cuatrovientos.spring.battles.mikel;

public class Soldier {
	private String name;
	private int firePower;

	public Soldier() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFirePower() {
		return firePower;
	}

	public void setFirePower(int firePower) {
		this.firePower = firePower;
	}

	@Override
	public String toString() {
		return "Soldier [name=" + name + ", firePower=" + firePower + "]";
	}

}
