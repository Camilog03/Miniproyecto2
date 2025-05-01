public class Attack {
    private final String name;
    private final Type typeOfDamage;
    private final double attackPower;
    private final boolean isSpecial;


    //Constructor
    public Attack(String name, Type typeOfDamage, double attackPower, boolean isSpecial) {
        this.name = name;
        this.typeOfDamage = typeOfDamage;
        this.attackPower = attackPower;
        this.isSpecial = isSpecial;
    }

    public boolean isSpecial() {
        return isSpecial;
    }

    //Setters and Getters
    public String getName() {
        return name;
    }

    public Type getTypeOfDamage() {
        return typeOfDamage;
    }

    public double getAttackPower() {
        return attackPower;
    }

    //toString method to print the object on the console
    @Override
    public String toString() {return name + " - " + attackPower;}



    
}



