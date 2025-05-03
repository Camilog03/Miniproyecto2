package src;

import src.pokemons.*;
import java.util.ArrayList;
import java.util.Scanner;

import Trainer;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        //Intro
        System.out.println("¡Bienvenido al mundo Pokémon, entrenador!");
        System.out.println("¡Prepárate para una aventura llena de batallas épicas! \nPor favor, ingresa los nombres de los entrenadores que se enfrentarán.");

        //Creating trainers
        System.out.print("Nombre del Entrenador 1: ");
        Trainer trainer1 = new Trainer(scanner.nextLine());
        System.out.print("Nombre del Entrenador 2: ");
        Trainer trainer2 = new Trainer(scanner.nextLine());

        System.out.println("\n\n¡Es hora de que el Entrenador 1 forme su equipo Pokémon!\n\n");

        menuTrainerDecisions(trainer1, scanner);

        System.out.println("\n\n¡Ahora es el turno del Entrenador 2 para formar su equipo Pokémon!\n\n");

        menuTrainerDecisions(trainer2, scanner);

        byte round = 1;

        while (true) {

            System.out.println("\n\n------ ¡Es momento de elegir a tus Pokémon para la batalla! ------");
            trainer1.showPokemons();
            Pokemon po1 = trainer1.selectPokemon(scanner);
            scanner.nextLine();

            trainer2.showPokemons();
            Pokemon po2 = trainer2.selectPokemon(scanner);
            scanner.nextLine();

            System.out.println("\n\n------ ¡Comienza la Batalla de la Ronda #" + round + "! ------");

            Pokemon attacker = po1;
            Pokemon defender = po2;

            if (po1.getHp() > po2.getHp()) {
                attacker = po2;
                defender = po1;
            }
            while (po1.isAlive() && po2.isAlive()) {

                System.out.println(attacker.getName() + " lanza un ataque feroz contra " + defender.getName() + "!");
                attacker.doAttack(defender, scanner);

                scanner.nextLine();

                System.out.println("\n\n¡" + defender.getName() + " tiene " + defender.getHp() + " puntos de vida restantes!");

                if (!defender.isAlive()) {
                    System.out.println("¡" + defender.getName() + " ha caído en combate!");
                    System.out.println("¡" + attacker.getName() + " es el vencedor de esta batalla!");
                    break;
                }
                System.out.println("\n\n¡Es el turno de " + defender.getName() + " para contraatacar!");

                //Change the attacker and defender
                Pokemon temp = attacker;
                attacker = defender;
                defender = temp;
            }
            if (round == 3) {
                break;
            } else {
                round++;
            }
        }
        winner(trainer1, trainer2);

    }

    public static void menuTrainerDecisions(Trainer trainer, Scanner scanner) {
        //Pokemon assignation for trainers
        System.out.println("\nEntrenador " + trainer.getTrainerName() + ", ¿cómo deseas formar tu equipo Pokémon?");
        System.out.println("1. Crear mi propio equipo Pokémon \n2. Recibir un equipo Pokémon al azar");
        System.out.print("Elige una opción: ");
        int option = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        while (option != 1 && option != 2) {
            System.out.println("Por favor, elige una opción válida.");
            System.out.print("Elige una opción: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
        }

        switch (option) {
            case 1:
                
                trainer.showPokemons();
                break;
            case 2:
                trainer.randomPokemon();
                trainer.showPokemons();
                break;
        }
    }

    public static void winner(Trainer trainer1, Trainer trainer2) {
        for (int i = 0; i < trainer1.getSelectPokemonslist().size(); i++) {
            if (trainer1.getSelectPokemonslist().get(i).isAlive()) {
                System.out.println("¡El gran vencedor es " + trainer1.getTrainerName() + "! ¡Felicidades, Maestro Pokémon!");
                break;
            } else if (trainer2.getSelectPokemonslist().get(i).isAlive()) {
                System.out.println("¡El gran vencedor es " + trainer2.getTrainerName() + "! ¡Felicidades, Maestro Pokémon!");
                break;
            }
        }
    }
}


