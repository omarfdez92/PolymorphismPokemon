package org.example;

/**
 * Owner: Omar Parra
 * Date: 2023-04-06
 */

public abstract class Pokemon {

    private String name;
    private int health;
    private Type type;

    public Pokemon(String name, int health, Type type) {
        this.name = name;
        this.health = health;
        this.type = type;
    }

    public void attack(Pokemon other){
        System.out.println(name + " attacks " + other.name);
        other.takeDamage( calculateDamage(this.type, other.type) );
    }

    public void takeDamage(int damage){
        this.health -= damage;
        System.out.println(name + " took " + damage + " points of damage!");
    }

    public int calculateDamage(Type attackerType, Type defenderType) {
        return 10;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }
}
