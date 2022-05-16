package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack{

    public Shaman() {
        health = 100;
        physDef = 20;
        magicDef = 20;
        physAtt = 10;
        magicAtt = 15;
    }

    @Override
    public void healHimself() {
        if(health + 50 > 100){
            health = 100;
        } else {
            health += 50;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.health + 30 > 100){
            hero.health = 100;
        } else {
            hero.health += 30;
        }
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
        return "Shaman{" +
                "health=" + health +
                '}';
    }
}
