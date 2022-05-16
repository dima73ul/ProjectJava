package day11.task2;

public class Magician extends  Hero implements PhysAttack, MagicAttack{

    public Magician() {
        health = 100;
        physDef = 0;
        magicDef = 80;
        physAtt = 5;
        magicAtt = 20;
    }

    @Override
    public void magicalAttack(Hero hero) {
        double var = magicAtt - (magicAtt * (hero.magicDef / 100.0));
        if (hero.health - var <= 0) {
            hero.health = 0;
        } else {
            hero.health -= var;
        }
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
        return "Magician{" +
                "health=" + health +
                '}';
    }
}
