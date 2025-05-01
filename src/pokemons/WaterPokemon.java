package src.pokemons;

import java.util.ArrayList;
import java.util.Scanner;

import src.actions.Attack;

public class WaterPokemon extends Pokemon {

    //Constructor and somes attacks to the type of pokemon
    public WaterPokemon(String name, Type type, short hp, short defenseFisic, short defenseSpecial, short speed) {
        super(name, type, hp, defenseFisic, defenseSpecial, speed);

        //Add fisic attacks to attacks of class

        attacksOfClass.add(new Attack("Chorro de Agua", Type.WATER, (short) 40, false));
        attacksOfClass.add(new Attack("Puño Acuático", Type.WATER, (short) 45, false));
        attacksOfClass.add(new Attack("Impacto Marítimo", Type.WATER, (short) 50, false));
        attacksOfClass.add(new Attack("Tacleo Acuático", Type.WATER, (short) 35, false));
        attacksOfClass.add(new Attack("Tornado Acuático", Type.WATER, (short) 55, false));
        attacksOfClass.add(new Attack("Pisotón Submarino", Type.WATER, (short) 50, false));
        attacksOfClass.add(new Attack("Garras de Agua", Type.WATER, (short) 45, false));
        attacksOfClass.add(new Attack("Tajo Acuático", Type.WATER, (short) 60, false));
        attacksOfClass.add(new Attack("Fuerza del Mar", Type.WATER, (short) 55, false));
        attacksOfClass.add(new Attack("Golpe Marítimo", Type.WATER, (short) 50, false));


        //Add specials attacks to attacks of class

        attacksOfClass.add(new Attack("Hidrobomba", Type.WATER, (short) 70, true));
        attacksOfClass.add(new Attack("Rayo de Agua", Type.WATER, (short) 65, true));
        attacksOfClass.add(new Attack("Tormenta de Agua", Type.WATER, (short) 75, true));
        attacksOfClass.add(new Attack("Chorro de Hielo", Type.WATER, (short) 55, true));
        attacksOfClass.add(new Attack("Hielo Polar", Type.WATER, (short) 60, true));
        attacksOfClass.add(new Attack("Cascada", Type.WATER, (short) 65, true));
        attacksOfClass.add(new Attack("Lluvia Torrencial", Type.WATER, (short) 70, true));
        attacksOfClass.add(new Attack("Marea Alta", Type.WATER, (short) 80, true));
        attacksOfClass.add(new Attack("Pulso Acuático", Type.WATER, (short) 60, true));
        attacksOfClass.add(new Attack("Lluvia de Gotas", Type.WATER, (short) 50, true));


    }

    @Override
    public void doAttack(Pokemon oponentPokemon, byte indexAttackSelected) {
        double effectivity;
        switch (oponentPokemon.getType()){
            case GROUND -> effectivity = 2.0;
            case ROCK -> effectivity = 2.0;
            case FIRE -> effectivity = 2.0;
            case PLANT -> effectivity = 0.5;
            default -> effectivity = 1.0;
        }
        Attack selectedAttack = attacksInstance.get(indexAttackSelected);

        double damage;

        if (selectedAttack.isSpecial()) {
            damage = ((selectedAttack.getAttackPower()) / (double) oponentPokemon.getDefenseSpecial()) + 2;
        } else {
            damage = ((selectedAttack.getAttackPower()) / (double) oponentPokemon.getDefenseFisic()) + 2;
        }

        oponentPokemon.receiveDamage((short)(damage*effectivity));
    }
}