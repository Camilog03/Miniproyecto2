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
<<<<<<< HEAD

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

=======
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
>>>>>>> 3081398daf635835d08a3a9c8a12fe1e3994afef

        Random rand = new Random();

        for (int i = 0; i < MAX_POKEMONS; i++) {
            selectPokemonslist.add(randomPokemons.get(rand.nextInt(randomPokemons.size())));
            for (int j = 0; j < Pokemon.getMaxAttacks(); j++) {
<<<<<<< HEAD
                selectPokemonslist.get(selectPokemonslist.size() - 1).selectAttacksRandom();
=======
                selectPokemonslist.get(selectPokemonslist.size() - 1).selectAttackRandom();
>>>>>>> 3081398daf635835d08a3a9c8a12fe1e3994afef
                /* 15 NEED TO BE CHANGED AS AN ATTRIBUTE THAT REPRESENTS
                   THE AMOUNT OF ATTACKS THAT ARE ON THE CLASS */
            }
        }
    }

<<<<<<< HEAD
    /* DISABLE FUNCTIONS FOR THE GUI

=======
>>>>>>> 3081398daf635835d08a3a9c8a12fe1e3994afef
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
<<<<<<< HEAD
    */
}
=======

    //Method to add pokemon created by the trainer
    public void addCreatedPokemon(Scanner scanner){
        System.out.println("\n\nVamos a crear tus pokemones!");

        for (int i = 0; i < getMaxPokemon(); i++) {
            System.out.println("\nPokemon " + (i + 1));
            System.out.print("Ingresa el nombre de tu pokemon:");
            String name = scanner.nextLine();

            System.out.print("Ingresa la vida (hp) de tu pokemon: ");
            int hp = scanner.nextInt();

            System.out.print("Ingresa la defensa (DEF) de tu pokemon: ");
            int defense = scanner.nextInt();

            scanner.nextLine();

            System.out.println("\n-----------Types of Pokemons----------");
            byte counter = 1;
            for (Type types : Type.values()) {
                System.out.println(counter + ". " + types);
                counter++;
            }

            boolean option = false;
            Type type = null;
            //To receive a valid option
            while (!option) {
                System.out.print("\nIngresa el tipo de tu pokemon:");
                String election = scanner.nextLine().toUpperCase();

                for (Type t : Type.values()) {
                    if (t.name().equals(election)) {
                        type = t;
                        option = true;
                        break;
                    }
                }

                if (!option) {
                    System.out.println("Tipo inválido. Intenta de nuevo.");
                }
            }
            //Create the pokemon according to its type
            switch (type) {
                case ELECTRIC:
                    selectPokemonslist.add(new ElectricPokemon(name, type, hp, defense));
                    selectPokemonslist.getLast().selectAttack(scanner);
                    break;
                case FIRE:
                    selectPokemonslist.add(new FirePokemon(name, type, hp, defense));
                    selectPokemonslist.getLast().selectAttack(scanner);
                    break;
                case FLYING:
                    selectPokemonslist.add(new FlyingPokemon(name, type, hp, defense));
                    selectPokemonslist.getLast().selectAttack(scanner);
                    break;
                case GROUND:
                    selectPokemonslist.add(new GroundPokemon(name, type, hp, defense));
                    selectPokemonslist.getLast().selectAttack(scanner);
                    break;
                case PLANT:
                    selectPokemonslist.add(new PlantPokemon(name, type, hp, defense));
                    selectPokemonslist.getLast().selectAttack(scanner);
                    break;
                case ROCK:
                    selectPokemonslist.add(new RockPokemon(name, type, hp, defense));
                    selectPokemonslist.getLast().selectAttack(scanner);
                    break;
                case WATER:
                    selectPokemonslist.add(new WaterPokemon(name, type, hp, defense));
                    selectPokemonslist.getLast().selectAttack(scanner);
                    break;
                default:
                    break;
            }
            scanner.nextLine();
        }
    }
}
>>>>>>> 3081398daf635835d08a3a9c8a12fe1e3994afef
