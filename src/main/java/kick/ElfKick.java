package kick;

import lotr.Character;

import java.util.Random;

public class ElfKick implements BasicKick{
    @Override
    public void kick(Character whoKick, Character whoIsKicked) {
        if (whoIsKicked.getHp() < whoKick.getHp()) {
            whoIsKicked.setHp(0);
        }
        else {
            whoIsKicked.setPower(whoIsKicked.getPower() - 1);
        }
    }
}
