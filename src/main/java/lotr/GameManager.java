package lotr;

public class GameManager {
    public static void main(String[] args) {
        Character fistPlayer = CharacterFactory.createCharacter();
        Character secondPlayer = CharacterFactory.createCharacter();
        fight(fistPlayer, secondPlayer);
    }
    public static void fight(Character chr1, Character chr2) {
        System.out.println("Start of Fighting");
        System.out.println();
        System.out.println("The player 1 is " + chr1.getClass().getSimpleName()
                + " who fights with the player 2, who is " + chr2.getClass().getSimpleName() + "!");
        System.out.println();

        System.out.println(chr1.getClass().getSimpleName() + " with " + chr1.getHp() + " of hp and " + chr1.getPower() + " of power ");
        System.out.println(chr2.getClass().getSimpleName() + " with " + chr2.getHp() + " of hp and " + chr2.getPower() + " of power ");

        if (chr1 instanceof Hobbit && chr2 instanceof Hobbit) {
            System.out.println();
            System.out.println("Oops they are two hobbits, the only thing they can is cry :((");
            System.out.println("cry, cry, cry");
            System.out.println();
            return;
        }
        else if (chr1 instanceof Elf && chr2 instanceof Elf) {
            System.out.println();
            System.out.println("Oops they are two elfs, they will not fight with each other by principle");
            System.out.println();
            return;
        }
        System.out.println();

        while (chr1.isAlive() && chr2.isAlive()) {
            System.out.println(chr1.getClass().getSimpleName() + " kicks " + chr2.getClass().getSimpleName());
            chr1.kick(chr2);
            System.out.println("Statistic after the " + chr1.getClass().getSimpleName() + " kicked " + chr2.getClass().getSimpleName() + ":");
            System.out.println("    " + chr1.getClass().getSimpleName() + " with " + chr1.getHp() + " of hp and " + chr1.getPower() + " of power ");
            System.out.println("    " + chr2.getClass().getSimpleName() + " with " + chr2.getHp() + " of hp and " + chr2.getPower() + " of power ");
            System.out.println();
            if (!chr2.isAlive()) {
                break;
            }
            System.out.println(chr2.getClass().getSimpleName() + " kicks " + chr1.getClass().getSimpleName());
            chr2.kick(chr1);
            System.out.println("Statistic after the " + chr2.getClass().getSimpleName() + " kicked " + chr1.getClass().getSimpleName() + ":");
            System.out.println("    " + chr1.getClass().getSimpleName() + " with " + chr1.getHp() + " of hp and " + chr1.getPower() + " of power ");
            System.out.println("    " + chr2.getClass().getSimpleName() + " with " + chr2.getHp() + " of hp and " + chr2.getPower() + " of power ");
            System.out.println();
        }
        if (chr1.isAlive() && !chr2.isAlive()) {
            System.out.println("The player 1, " + chr1.getClass().getSimpleName() + " wins");
        } else if (!chr1.isAlive() && chr2.isAlive()) {
            System.out.println("The player 2, " + chr2.getClass().getSimpleName() + " wins");
        }
    }
}
