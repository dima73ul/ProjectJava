package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack{

    public Paladin() {
        health = 100;
        physDef = 50;
        magicDef = 20;
        physAtt = 15;
    }

    @Override
    public void healHimself() {
        if(health + 25 > 100){
            health = 100;
        } else {
            health += 25;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        if(hero.health + 10 > 100){
            hero.health = 100;
        } else {
            hero.health += 10;
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
        return "Paladin{" +
                "health=" + health +
                '}';
    }

}
