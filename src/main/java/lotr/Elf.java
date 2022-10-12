package lotr;

public class Elf extends lotr.Character {
    public Elf() {
        super(10, 10);
    }

    public void kick(Character c) {
        if (c.getHp() < this.getHp()) {
            c.setHp(0);
        }
        else {
            c.setPower(c.getPower() - 1);
        }
    }
}