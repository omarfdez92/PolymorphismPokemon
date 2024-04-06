package org.example;

public class ElectricPokemon extends Pokemon{

    public ElectricPokemon(String name, int health){
        super(name, health, Type.ELECTRIC);
    }

    @Override
    public int calculateDamage(Type attackerType, Type defenderType){
        if (defenderType == Type.WATER) {
            //Super effective!
            return 2 * super.calculateDamage(attackerType, defenderType);
        } else {
            return super.calculateDamage(attackerType, defenderType);
        }
    }
}
