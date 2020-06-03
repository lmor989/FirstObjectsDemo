package io.codeDifferently;

public class Human {
    private String fName;
    private String lName;
    static int maxEnergy = 100;
    private int energy;

    public Human(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
        this.energy = 50;
    }

    public void eat(Fruit fruit) {
        //this.energy = this.energy + fruit.energy;
        if (this.energy + fruit.getEnergy() <= maxEnergy) {
            this.energy = this.energy + fruit.getEnergy();
        } else {
            this.energy = maxEnergy;
            System.out.println("Energy is full");
        }
    }

    public void work(int hours) {
        int energySpent = hours * 10;

        if (this.energy - energySpent < 0) {
            System.out.println("Couldn't do the work, energy too low. Try to eat something and get this work done later");
        } else {
            this.energy = this.energy - energySpent;
        }
    }

    public int getEnergy() {
        return this.energy;
    }

    public String getFirstName() {
        return this.fName;
    }

    public String getLastName() {
        return this.lName;
    }
}