package lotr;
import java.util.Random;
import Kick.KingStrategy;

public class King extends Character {
    private static Random random = new Random();

    public static int generateRandomValue(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
    
    public King() {
        super(generateRandomValue(5, 15), generateRandomValue(5, 15), new KingStrategy());
    }
}
