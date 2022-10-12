package lotr;

import kick.ElfKick;

public class Elf extends lotr.Character {
    public Elf() {
        super(10, 10, new ElfKick());
    }
}