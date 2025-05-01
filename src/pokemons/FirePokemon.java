package src.pokemons;

import java.util.ArrayList;
import java.util.Scanner;

import src.actions.Attack;

public class FirePokemon extends Pokemon {

    //Constructor and somes attacks to the type of pokemon
    public FirePokemon(String name, Type type, short hp, short defenseFisic, short defenseSpecial, short speed) {
        super(name, type, hp, defenseFisic, defenseSpecial, speed);

        //Add fisic attacks to attacks of class

        attacksOfClass.add(new Attack("Lanzallamas", Type.FIRE, (short) 60, false));
        attacksOfClass.add(new Attack("Golpe Ígneo", Type.FIRE, (short) 45, false));
        attacksOfClass.add(new Attack("Placaje de Fuego", Type.FIRE, (short) 40, false));
        attacksOfClass.add(new Attack("Tacleo Llamas", Type.FIRE, (short) 35, false));
        attacksOfClass.add(new Attack("Puño Fuego", Type.FIRE, (short) 50, false));
        attacksOfClass.add(new Attack("Bola de Fuego", Type.FIRE, (short) 55, false));
        attacksOfClass.add(new Attack("Impacto Llama", Type.FIRE, (short) 65, false));
        attacksOfClass.add(new Attack("Rugido Infernal", Type.FIRE, (short) 40, false));
        attacksOfClass.add(new Attack("Ataque Calor", Type.FIRE, (short) 50, false));
        attacksOfClass.add(new Attack("Garras Ardientes", Type.FIRE, (short) 45, false));

        //Add specials attacks to attacks of class

        attacksOfClass.add(new Attack("Rayo Solar", Type.FIRE, (short) 75, true));
        attacksOfClass.add(new Attack("Llamarada", Type.FIRE, (short) 80, true));
        attacksOfClass.add(new Attack("Fuego Fatuo", Type.FIRE, (short) 65, true));
        attacksOfClass.add(new Attack("Lluvia de Llamas", Type.FIRE, (short) 70, true));
        attacksOfClass.add(new Attack("Luz Solar", Type.FIRE, (short) 60, true));
        attacksOfClass.add(new Attack("Explosión Solar", Type.FIRE, (short) 85, true));
        attacksOfClass.add(new Attack("Furia Ígnea", Type.FIRE, (short) 55, true));
        attacksOfClass.add(new Attack("Fuego Sagrado", Type.FIRE, (short) 90, true));
        attacksOfClass.add(new Attack("Torrente de Fuego", Type.FIRE, (short) 65, true));
        attacksOfClass.add(new Attack("Tempestad de Llamas", Type.FIRE, (short) 75, true));


    }

    @Override
    public void doAttack(Pokemon oponentPokemon, byte indexAttackSelected) {

        double effectivity;
        switch (oponentPokemon.getType()){
            case WATER -> effectivity = 0.5;
            case ROCK -> effectivity = 0.5;
            case FIRE -> effectivity = 0.5;
            case PLANT -> effectivity = 2.0;
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
