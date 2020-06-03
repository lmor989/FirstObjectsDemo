package io.codeDifferently;

import org.junit.Assert;
import org.junit.Test;

public class HumanTest {
    @Test
    public void constructorTest() {
        // Given
        String first = "Fred";
        String last = "Flintstone";
        int energy = 50;
        
        // When
        Human testHuman = new Human(first, last);
        String actualF = testHuman.getFirstName();
        String actualL = testHuman.getLastName();
        int actualE = testHuman.getEnergy();

        // Then
        Assert.assertEquals(first, actualF);
        Assert.assertEquals(last, actualL);
        Assert.assertEquals(energy, actualE);
    }

    @Test
    public void eatTest() {
        // Given
        Fruit apple = new Fruit("apple", 10);
        Human testHuman = new Human("Barney", "Rubble");
        int expectedEnergy = 60;

        // When
        testHuman.eat(apple);
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void workTest() {
        // Given
        Human testHuman = new Human("Bam", "Bams");
        int expectedEnergy = 30;

        // When
        testHuman.work(2);
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void energyMaxTest() {
        // Given
        Human testHuman = new Human("Wilma", "Flintstone");
        Fruit testFruit = new Fruit("Orange", 20);
        Fruit testFruit2 = new Fruit("Pear", 20);
        Fruit testFruit3 = new Fruit("Lemon", 20);
        Human.maxEnergy = 100;
        int expectedEnergy = 100;

        // When
        testHuman.eat(testFruit);
        testHuman.eat(testFruit2);
        testHuman.eat(testFruit3);
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

    @Test
    public void workMin() {
        // Given
        Human testHuman = new Human("Bam", "Flintstone");
        int expectedEnergy = 50;

        // When
        testHuman.work(6);
        int actualEnergy = testHuman.getEnergy();

        // Then
        Assert.assertEquals(expectedEnergy, actualEnergy);

    }

    @Test
    public void maxEnergyChangeTst() {
        // Given
        Human h1 = new Human("John", "Doe");
        Fruit testFruit = new Fruit("Orange", 20);
        Fruit testFruit2 = new Fruit("Pear", 20);
        Fruit testFruit3 = new Fruit("Lemon", 20);
        int expectedEnergy = 110;


        // When
        Human.maxEnergy = 150;
        h1.eat(testFruit);
        h1.eat(testFruit2);
        h1.eat(testFruit3);
        int actualEnergy = h1.getEnergy();

        // Then
        Assert.assertEquals(expectedEnergy, actualEnergy);
    }

}