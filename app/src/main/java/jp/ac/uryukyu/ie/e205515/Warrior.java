package jp.ac.uryukyu.ie.e205515;

public class Warrior extends LivingThing {

    public Warrior (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
     }

     public void attackWithWeponskill(LivingThing opponent) {
         if (!dead){
            int damage = (int)(attack * 1.5); 
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n",name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
}
