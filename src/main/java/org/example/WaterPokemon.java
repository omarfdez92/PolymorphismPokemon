package org.example;

public class WaterPokemon extends Pokemon{

    public WaterPokemon(String name, int health) {
        super(name, health, Type.WATER);
    }

    @Override
    public int calculateDamage(Type attackerType, Type defenderType){
        if (attackerType == Type.ELECTRIC){
            //Electric is weak against Water!
            return super.calculateDamage(attackerType, defenderType) / 2;
        } else {
            return super.calculateDamage(attackerType, defenderType);
        }
    }
}
