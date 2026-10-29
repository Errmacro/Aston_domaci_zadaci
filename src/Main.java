import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Integer,String> squad = new HashMap<>();
        squad.put(1,"Simon Vukcevic");
        squad.put(2,"Milivoje Cirkovic");
        squad.put(4,"Zoran Mirkovic");
        squad.put(7,"Nenad Brnovic");
        squad.put(25,"Ivica Kralj");
        squad.put(30,"Nikolas Asprogenis");

        System.out.print("Список состава:");
        printSquad(squad);

        System.out.print("Получение по ключу:");
        System.out.println(squad.get(25));

        squad.remove(30);
        System.out.print("Получение после удаления:");
        printSquad(squad);
    }
    static void printSquad(Map<Integer, String> squad) {
        for (Map.Entry<Integer, String> entry : squad.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
