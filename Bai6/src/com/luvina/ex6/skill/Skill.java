package com.luvina.ex6.skill;

public class Skill {
	protected String skillName;
	protected double damage;
	protected String properties;
	protected String describe;
	
	public double getDamage() {
		return damage;
	}

	public void setDamage(double damage) {
		this.damage = damage;
	}

	public void inputSkill(String skillName, double damage, 
			String properties, String describe) {
		this.skillName = skillName;
		this.damage = damage;
		this.properties = properties;
		this.describe = describe;
		
	}
	
	public void displaySkill() {
		System.out.println(skillName);
		System.out.println(damage);
		System.out.println(properties);
		System.out.println(describe);
	}

}
