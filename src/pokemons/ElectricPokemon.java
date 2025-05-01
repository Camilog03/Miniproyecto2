package src.pokemons;

import java.util.ArrayList;
import java.util.Scanner;

import src.actions.Attack;

public class ElectricPokemon extends Pokemon {


    //Constructor and somes attacks to the type of pokemon
    public ElectricPokemon(String name, Type type, short hp, short defenseFisic, short defenseSpecial, short speed) {
        super(name, type, hp, defenseFisic, defenseSpecial, speed);

        //Add fisic attacks to attacks of class

        attacksOfClass.add(new Attack("Puño Eléctrico", Type.ELECTRIC, (short) 50, false));
        attacksOfClass.add(new Attack("Rayo Corto", Type.ELECTRIC, (short) 45, false));
        attacksOfClass.add(new Attack("Impacto Voltaje", Type.ELECTRIC, (short) 60, false));
        attacksOfClass.add(new Attack("Tacleo Eléctrico", Type.ELECTRIC, (short) 40, false));
        attacksOfClass.add(new Attack("Golpe Relámpago", Type.ELECTRIC, (short) 55, false));
        attacksOfClass.add(new Attack("Puño Trueno", Type.ELECTRIC, (short) 50, false));
        attacksOfClass.add(new Attack("Voltio", Type.ELECTRIC, (short) 60, false));
        attacksOfClass.add(new Attack("Choque Eléctrico", Type.ELECTRIC, (short) 65, false));
        attacksOfClass.add(new Attack("Estallido Voltaico", Type.ELECTRIC, (short) 70, false));
        attacksOfClass.add(new Attack("Rayo Impacto", Type.ELECTRIC, (short) 75, false));

        //Add specials attacks to attacks of class

        attacksOfClass.add(new Attack("Rayo", Type.ELECTRIC, (short) 80, true));
        attacksOfClass.add(new Attack("Trueno", Type.ELECTRIC, (short) 90, true));
        attacksOfClass.add(new Attack("Relámpago", Type.ELECTRIC, (short) 75, true));
        attacksOfClass.add(new Attack("Chispa Eléctrica", Type.ELECTRIC, (short) 60, true));
        attacksOfClass.add(new Attack("Electrocañón", Type.ELECTRIC, (short) 85, true));
        attacksOfClass.add(new Attack("Carga Eléctrica", Type.ELECTRIC, (short) 70, true));
        attacksOfClass.add(new Attack("Destello", Type.ELECTRIC, (short) 65, true));
        attacksOfClass.add(new Attack("Electrochorro", Type.ELECTRIC, (short) 80, true));
        attacksOfClass.add(new Attack("Tornado Eléctrico", Type.ELECTRIC, (short) 90, true));
        attacksOfClass.add(new Attack("Rayo Solar Eléctrico", Type.ELECTRIC, (short) 75, true));

    }

    @Override
    public void doAttack(Pokemon oponentPokemon, byte indexAttackSelected) {

        double effectivity;

        switch (oponentPokemon.getType()){
            case WATER -> effectivity = 2.0;
            case ROCK -> effectivity = 2.0;
            case FIRE -> effectivity = 0.5;
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
