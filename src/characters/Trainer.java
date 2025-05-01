package src.characters;

import java.util.*;

import src.pokemons.*;


public class Trainer {

    private String trainerName;
    private static final byte MAX_POKEMONS = 3;
    private ArrayList<Pokemon> selectPokemonslist = new ArrayList<Pokemon>();


    public Trainer(String trainerName) {
        this.trainerName = trainerName;
    }
    //Getters and setters
    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {this.trainerName = trainerName;}

    public ArrayList<Pokemon> getSelectPokemonslist() {
        return selectPokemonslist;
    }

    public static byte getMaxPokemon() {
        return MAX_POKEMONS;
    }

    //Random pokemons

    public void randomPokemon(){
        ArrayList<Pokemon> randomPokemons = new ArrayList<>();

        // 🔥 FIRE
        randomPokemons.add(new FirePokemon("Charmander", Type.FIRE, (short) 39, (short) 43, (short) 50, (short) 65));
        randomPokemons.add(new FirePokemon("Vulpix", Type.FIRE, (short) 38, (short) 41, (short) 50, (short) 65));
        randomPokemons.add(new FirePokemon("Growlithe", Type.FIRE, (short) 55, (short) 50, (short) 45, (short) 60));

        // 💧 WATER
        randomPokemons.add(new WaterPokemon("Squirtle", Type.WATER, (short) 44, (short) 48, (short) 50, (short) 43));
        randomPokemons.add(new WaterPokemon("Psyduck", Type.WATER, (short) 50, (short) 48, (short) 45, (short) 42));
        randomPokemons.add(new WaterPokemon("Totodile", Type.WATER, (short) 50, (short) 60, (short) 50, (short) 43));

        // ⚡ ELECTRIC
        randomPokemons.add(new ElectricPokemon("Pikachu", Type.ELECTRIC, (short) 35, (short) 30, (short) 40, (short) 90));
        randomPokemons.add(new ElectricPokemon("Mareep", Type.ELECTRIC, (short) 55, (short) 40, (short) 50, (short) 35));
        randomPokemons.add(new ElectricPokemon("Magnemite", Type.ELECTRIC, (short) 25, (short) 35, (short) 70, (short) 45));

        // 🌿 PLANT
        randomPokemons.add(new PlantPokemon("Bulbasaur", Type.PLANT, (short) 45, (short) 49, (short) 65, (short) 45));
        randomPokemons.add(new PlantPokemon("Bellsprout", Type.PLANT, (short) 50, (short) 35, (short) 45, (short) 60));
        randomPokemons.add(new PlantPokemon("Treecko", Type.PLANT, (short) 40, (short) 35, (short) 50, (short) 70));

        // 🪨 ROCK
        randomPokemons.add(new RockPokemon("Geodude", Type.ROCK, (short) 40, (short) 100, (short) 40, (short) 20));
        randomPokemons.add(new RockPokemon("Onix", Type.ROCK, (short) 35, (short) 160, (short) 45, (short) 35));
        randomPokemons.add(new RockPokemon("Nosepass", Type.ROCK, (short) 30, (short) 135, (short) 50, (short) 30));

        // 🌍 GROUND
        randomPokemons.add(new GroundPokemon("Sandshrew", Type.GROUND, (short) 50, (short) 85, (short) 40, (short) 60));
        randomPokemons.add(new GroundPokemon("Diglett", Type.GROUND, (short) 10, (short) 25, (short) 50, (short) 100));
        randomPokemons.add(new GroundPokemon("Phanpy", Type.GROUND, (short) 90, (short) 60, (short) 45, (short) 40));

        // 🦅 FLYING
        randomPokemons.add(new FlyingPokemon("Pidgey", Type.FLYING, (short) 40, (short) 35, (short) 40, (short) 56));
        randomPokemons.add(new FlyingPokemon("Spearow", Type.FLYING, (short) 40, (short) 30, (short) 50, (short) 70));
        randomPokemons.add(new FlyingPokemon("Taillow", Type.FLYING, (short) 40, (short) 30, (short) 55, (short) 85));


        Random rand = new Random();

        for (int i = 0; i < MAX_POKEMONS; i++) {
            selectPokemonslist.add(randomPokemons.get(rand.nextInt(randomPokemons.size())));
            for (int j = 0; j < Pokemon.getMaxAttacks(); j++) {
                selectPokemonslist.get(selectPokemonslist.size() - 1).selectAttacksRandom();
                /* 15 NEED TO BE CHANGED AS AN ATTRIBUTE THAT REPRESENTS
                   THE AMOUNT OF ATTACKS THAT ARE ON THE CLASS */
            }
        }
    }

    /* DISABLE FUNCTIONS FOR THE GUI

    public void showPokemons() {
        Collections.sort(selectPokemonslist);
        System.out.println("\nPokemones del entrenador " + trainerName + ":");
        for (int i = 0; i < selectPokemonslist.size(); i++) {
            Pokemon pokemon = selectPokemonslist.get(i);
            System.out.println((i + 1) + ". " + pokemon);
        }
    }

    public Pokemon selectPokemon(Scanner scanner) {
        System.out.print("Seleccion de Pokemon (1-3): ");
        while(true) {
            int option = scanner.nextInt();
            if (selectPokemonslist.get(option-1).isAlive() && (option >= 1 && option <= 3)) {
                return selectPokemonslist.get(option-1);
            }
            else{
                System.out.println("Ingresa una opcion disponible");
            }
        }
    }
    */
}