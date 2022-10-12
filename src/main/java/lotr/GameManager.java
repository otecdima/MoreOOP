package lotr;

public class GameManager {
    public static void main(String[] args) {
        Character fistPlayer = CharacterFactory.createCharacter();
        Character secondPlayer = CharacterFactory.createCharacter();
        System.out.println(secondPlayer.getClass().getSimpleName());
        fight(fistPlayer, secondPlayer);
    }
    public static void fight(Character chr1, Character chr2) {
        System.out.println("Start of Fighting");
        System.out.println("The player 1 is" + chr1.getClass().getSimpleName()
                + "who fights with the player 2, who is" + chr2.getClass().getSimpleName());
        System.out.println();
        if (chr1 instanceof Hobbit && chr2 instanceof Hobbit) {
            System.out.println("Oops they are two hobbits, the only thing they can is cry :((");
            System.out.println("cry, cry, cry");
            return;
        }
        else if (chr1 instanceof Elf && chr2 instanceof Elf) {
            System.out.println("Oops they are two elfs, they will not fight with each other by principle");
            return;
        }
        System.out.println();

        while (chr1.isAlive() && chr2.isAlive()) {
            System.out.println("first beats second");
            chr1.kick(chr2);
            if (!chr2.isAlive()) {
                break;
            }
            System.out.println("second beats fist");
            chr2.kick(chr1);
        }
    }
}
