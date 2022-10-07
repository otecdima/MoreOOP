package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Character {
    @Getter
    private int hp;
    @Getter@Setter
    private int power;

    public void kick(Character c) {
        System.out.println("wbfbeu");
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
