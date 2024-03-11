import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String playerName = "Player";
        System.out.println("How much are players?");
        String[] players = new String[scanner.nextInt()];
        System.out.println("You have: " + players.length + " players");
        int answer1 = 0;
        int var = 0;

        for (int i = 0; i < players.length; i++) {
            String playerNumbers = playerName + i;
            System.out.println(playerNumbers);

            for (int count = 0; count < 3; count++) {
//              char[] chars = {'+', '-', '*', '/'};  Здесь я хотел вставить рандомную мат. операцию
//              char ch = chars[new Random().nextInt(chars.length)];

                int var1 = random.nextInt(10);
                int var2 = random.nextInt(10);
                int result = var1 + var2;
                // сюда как-то char 'ch' вместо "+"
                System.out.println(var1 + " + " + var2);
                System.out.println("Ваш ответ: ");

                if (scanner.nextInt() == result) {
                    answer1 = var = (var + 5);
                    System.out.println("Правильный ответ " + result +
                            ". Текущее количество баллов: " + answer1);
                } else {
                    answer1 = var = (var - 5);
                    System.out.println("Неправильный ответ. Правильный ответ " + result +
                            ". Текущее количество баллов: " + answer1);
                }
            }
            System.out.println(playerNumbers + " имеет " + answer1 + " баллов.");
        }
    }
}
