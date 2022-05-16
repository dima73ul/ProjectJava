package day11.task2;

public class Warrior extends Hero implements PhysAttack{

    public Warrior() {
        health = 100;
        physDef = 80;
        magicDef = 0;
        physAtt = 30;
    }

    @Override
    public void physicalAttack(Hero hero) {
        double var = physAtt - (physAtt * (hero.physDef / 100.0));
        if (hero.health - var <= 0) {
            hero.health = 0;
        } else {
            hero.health -= var;
        }
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }
}
