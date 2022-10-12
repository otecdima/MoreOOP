package lotr;

public class GameManager {
    public static void main(String[] args) {
        startGame();
    }
    public static void startGame() {
        System.out.println("Fighting");
        Character fistPlayer = new CharacterFactory().createCharacter();
        System.out.println(fistPlayer.getClass().getSimpleName());
        Character secondPlayer = new CharacterFactory().createCharacter();
        System.out.println(secondPlayer.getClass().getSimpleName());

        while (fistPlayer.isAlive() && secondPlayer.isAlive()) {
            System.out.println("fist beats second");
            fistPlayer.kick(secondPlayer);
            if (!secondPlayer.isAlive()) {
                break;
            }
            System.out.println("second beats fist");
            secondPlayer.kick(fistPlayer);
        }
    }
}
