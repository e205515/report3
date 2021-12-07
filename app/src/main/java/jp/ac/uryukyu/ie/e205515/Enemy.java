package jp.ac.uryukyu.ie.e205515;

/**
 * 敵クラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Enemy extends LivingThing{
/*
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;
*/
    //参照系メソッド
    /**
     * 敵の名前のgetter.
     * @return　敵の名前
     */
/*
    public String getName(){
        return name;
    }
*/
    /**
     * 敵のHPのgetter.
     * @return 敵のHP
     */

    public int getHitPoint() {
        return hitPoint;
    }

    /**
     * 敵の攻撃力のgetter.
     * @return 敵の攻撃力
     */
/*
    public int getAttack() {
        return attack;
    }
*/
    /**
     * 敵の生死状態のgetter.
     * @return 敵の生死状態
     */

    public boolean getDead() {
        return dead;
    }



    //更新系メソッド
    /**
     * 敵の名前のsetter.
     * @param n 敵の名前
     */
    public void setName(String n) {
        name = n;
    }
    /**
     * 敵のHPのsetter.
     * @param h 敵のHP
     */
    public void setHitPoint(int h) {
        hitPoint = h;
    }
    /**
     * 敵の攻撃力のsetter.
     * @param a 敵の攻撃力
     */
    public void setAttack(int a) {
        attack = a;
    }
    /**
     * 敵の生死状態のsetter.
     * @param d 敵の生死状態
     */
    public void setDead(boolean d) {
        dead = d;
    }


    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name モンスター名
     * @param maximumHP モンスターのHP
     * @param attack モンスターの攻撃力
     */
    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }

    /**
     * Heroへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param hero 攻撃対象
     */
/*
    public void attack(Hero hero){
        if(!dead){
            int damage = (int)(Math.random()*attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, hero.getName(), damage);
            hero.wounded(damage);
        }
    }
*/
    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    @Override
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。\n", name);
        }
    }

}