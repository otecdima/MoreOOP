package lotr;

import kick.BasicKick;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Character {
    @Getter
    private int hp;
    @Getter@Setter
    private int power;
    private BasicKick kickFight;

    boolean isAlive() {
        return this.getHp() > 0;
    }

    public void kick(Character whoIsKicked) {
        this.kickFight.kick(this, whoIsKicked);
    }

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "hp=" + hp +
                ", power=" + power +
                '}';
    }
}
