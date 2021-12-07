package jp.ac.uryukyu.ie.e205515;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponskillTest() {
        int defaultattack = 100;
        int defaultSlimeHp = 1000;
        Warrior demoWarrior = new Warrior("デモ戦士", 100, defaultattack);
        Enemy slime = new Enemy("スライムもどき", defaultSlimeHp, 100);
        for(int i = 0; i<3; i++){
            int beforeHp = slime.hitPoint;
            demoWarrior.attackWithWeponskill(slime);
            int diff = beforeHp - slime.hitPoint;
            assertEquals((int)(defaultattack* 1.5), diff);
        }
    }
}

