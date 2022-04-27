package day7;

public class Task2 {
    public static void main(String[] args) {

        int min = 90;
        int max = 100;

        Player[] players = new Player[6];
        for (int i = 0; i < players.length; i++) {
            int rnd = rnd(min, max);
            players[i] = new Player(rnd);
        }

        int number = players[0].getStamina();
        for (int i = 0; i < number; i++) {
            players[0].run(players[0]);

        }

        Player.info();
    }

    public static int rnd(int min, int max)
    {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
