

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

        // FIRE
        randomPokemons.add(new FirePokemon("Charmander", Type.FIRE, 39.0, 43.0));
        randomPokemons.add(new FirePokemon("Vulpix", Type.FIRE, 38.0, 40.0));
        randomPokemons.add(new FirePokemon("Growlithe", Type.FIRE, 55.0, 45.0));

        // WATER
        randomPokemons.add(new WaterPokemon("Squirtle", Type.WATER, 44.0, 65.0));
        randomPokemons.add(new WaterPokemon("Psyduck", Type.WATER, 50.0, 48.0));
        randomPokemons.add(new WaterPokemon("Totodile", Type.WATER, 50.0, 64.0));

        // ELECTRIC
        randomPokemons.add(new ElectricPokemon("Pikachu", Type.ELECTRIC, 35.0, 40.0));
        randomPokemons.add(new ElectricPokemon("Mareep", Type.ELECTRIC, 55.0, 40.0));
        randomPokemons.add(new ElectricPokemon("Magnemite", Type.ELECTRIC, 25.0, 70.0));

        // PLANT
        randomPokemons.add(new PlantPokemon("Bulbasaur", Type.PLANT, 45.0, 49.0));
        randomPokemons.add(new PlantPokemon("Bellsprout", Type.PLANT, 50.0, 35.0));
        randomPokemons.add(new PlantPokemon("Treecko", Type.PLANT, 40.0, 35.0));

        // ROCK
        randomPokemons.add(new RockPokemon("Geodude", Type.ROCK, 40.0, 100.0));
        randomPokemons.add(new RockPokemon("Onix", Type.ROCK, 35.0, 160.0));
        randomPokemons.add(new RockPokemon("Nosepass", Type.ROCK, 30.0, 135.0));

        // GROUND
        randomPokemons.add(new GroundPokemon("Sandshrew", Type.GROUND, 50.0, 85.0));
        randomPokemons.add(new GroundPokemon("Diglett", Type.GROUND, 10.0, 25.0));
        randomPokemons.add(new GroundPokemon("Phanpy", Type.GROUND, 90.0, 60.0));

        // FLYING
        randomPokemons.add(new FlyingPokemon("Pidgey", Type.FLYING, 40.0, 35.0));
        randomPokemons.add(new FlyingPokemon("Spearow", Type.FLYING, 40.0, 30.0));
        randomPokemons.add(new FlyingPokemon("Taillow", Type.FLYING, 40.0, 30.0));

        Random rand = new Random();

        for (int i = 0; i < MAX_POKEMONS; i++) {
            selectPokemonslist.add(randomPokemons.get(rand.nextInt(randomPokemons.size())));
            for (int j = 0; j < Pokemon.getMaxAttacks(); j++) {
                selectPokemonslist.get(selectPokemonslist.size() - 1).selectAttackRandom();
                /* 15 NEED TO BE CHANGED AS AN ATTRIBUTE THAT REPRESENTS
                   THE AMOUNT OF ATTACKS THAT ARE ON THE CLASS */
            }
        }
    }

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
    
}