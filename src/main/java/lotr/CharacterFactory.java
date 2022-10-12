package lotr;

import java.util.Random;

public class CharacterFactory {
    public Character createCharacter() {
        Character[] characterList = {new Elf(), new King(), new Hobbit(), new Knight()};
        Random rand = new Random();
        int randomElement = rand.nextInt(characterList.length);
        return characterList[randomElement];
    }
}
