package io.codeDifferently;

import org.junit.Test;
import org.junit.Assert;



public class FruitTest {
    @Test
    public void constructorTest() {
        // Given
        String type = "apple";
        int energy = 20;

        // When
        Fruit testFruit = new Fruit(type, energy);
        String actualType = testFruit.getType();
        int actualEnergy = testFruit.getEnergy();

        // Then
        Assert.assertEquals(type, actualType);
        Assert.assertEquals(energy, actualEnergy);
    }
}