package day7;

public class Player {

    private int stamina;
    public static final int MIN_STAMINA = 0;
    public static final int MAX_STAMINA = 100;
    private static int countPlayers = 0;

    public Player(int stamina) {
        this.stamina = stamina;
        if(countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public int getCountPlayers() {
        return countPlayers;
    }

    public  void run(Player player){
        player.stamina--;
        if(player.getStamina() == 0){
            System.out.println("Выносливость равно нулю игрок покидает поле");
            countPlayers--;
        }
    }

    public static void info(){
        System.out.println("Количество игроков на поле " + countPlayers);
        if(countPlayers < 6){
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }

}
