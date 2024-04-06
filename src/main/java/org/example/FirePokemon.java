package org.example;

public class FirePokemon extends Pokemon{

    public FirePokemon(String name, int health){
        super(name, health, Type.FIRE);
    }

    @Override
    public int calculateDamage(Type attackerType, Type defenderType){
        //Implement type effectiveness logic for Fire type here
        return super.calculateDamage(attackerType, defenderType);
    }
}
