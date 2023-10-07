package lotr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class KickTest {
    private Character king;
    private Character elf;
    private Character hobbit;

    @BeforeEach
    public void init() { king = new King(); 
                        elf = new Elf();
                        hobbit = new Hobbit();
                    }


    @Test
    public void testKickHobbit() {
        hobbit.kick(elf);
    }
    @Test
    public void testKickElf() {
        elf.kick(hobbit);
        assertFalse(hobbit.isAlive());
        if (king.getPower()>10){
            elf.kick(king);
            assertTrue(elf.getPower()==9);
        }
        else{
            assertFalse(king.isAlive());
        }
    }
    public static void main(String[] args) {
        GameManager game = new GameManager();
        Elf elf = new Elf();
        King king = new King();
        game.fight(elf, king);
    }
}
