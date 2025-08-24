package org.example;
import java.util.Random;
public class Dice {
    Integer diceCount;

    public static Random random = new Random();

    public Dice(Integer diceCount) {
        this.diceCount = diceCount;
    }

    public void setDiceCount(Integer diceCount) {
        this.diceCount = diceCount;
    }

    public Integer rollDice()
    {
        return random.nextInt(6) + 1;
    }
}
