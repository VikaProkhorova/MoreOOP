package Kick;

import java.util.Random;

import lotr.Character;

public class KingStrategy implements KickStrategy{
    private static Random random = new Random();

    public static int generateRandomValue(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
    @Override
    public void kick(Character whoKick, Character opponent) {
        opponent.setHp(opponent.getHp()-generateRandomValue(1, whoKick.getPower()));
    }
    
}
