package org.example;

/**
 * Owner: Omar Parra
 * Date: 2023-04-06
 */
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new ElectricPokemon("Pikachu", 100);
        Pokemon squirtle = new WaterPokemon("Squirtle", 80);
        Pokemon charmander = new ElectricPokemon("Charmander", 90);

        System.out.println("Battle Start!");

        //Test cases
        testElectricAttack(pikachu, squirtle);
        testWaterAttack(squirtle, pikachu);
        testFirePokemon(charmander);

        System.out.println(pikachu.getName() + " health: " + pikachu.getHealth());
        System.out.println(squirtle.getName() + " health: " + squirtle.getHealth());

    }

    public static void testElectricAttack(Pokemon attacker, Pokemon defender){
        attacker.attack(defender);
        //assert health based on expected damage (super effective)
    }

    public static void testWaterAttack(Pokemon attacker, Pokemon defender){
        attacker.attack(defender);
        //assert health based on expected damage (not very effective)
    }

    public static void testFirePokemon(Pokemon firePokemon){
        //test Fire pokemon behavior

    }
}