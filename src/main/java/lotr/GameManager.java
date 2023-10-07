package lotr;

public class GameManager {
    public void fight(Character c1, Character c2) {
        while (true){
            System.out.println(c1.toString()+" vs "+c2.toString());
            c1.kick(c2);
            System.out.println(c1.getClass().getSimpleName()+ " kick " +c2.getClass().getSimpleName());
            if (!c2.isAlive()){
                System.out.println(c2.getClass().getSimpleName()+ " is death");
                break;
            }
            System.out.println(c1.toString()+" vs "+c2.toString());
            c2.kick(c1);
            System.out.println(c2.getClass().getSimpleName()+ " kick " +c1.getClass().getSimpleName());
            if (!c1.isAlive()){
                System.out.println(c1.getClass().getSimpleName()+ " is death");
                break;
            }
        }
    }
}
