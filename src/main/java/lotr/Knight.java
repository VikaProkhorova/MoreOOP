package lotr;
import java.util.Random;

import Kick.KingStrategy;

public class Knight extends Character {
    private static Random random = new Random();

    public static int generateRandomValue(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }

    public Knight() {
        super(generateRandomValue(2, 12), generateRandomValue(2, 12), new KingStrategy());
    }
    
}
