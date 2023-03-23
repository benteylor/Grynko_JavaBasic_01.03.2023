import java.util.Arrays;
import java.util.Scanner;

public class CounterStrike {
    public static void main(String[] args) {
        System.out.print("Введите название первой команды: ");
        Scanner scan1 = new Scanner(System.in);
        String killers = scan1.nextLine();

        int[] k = new int[]{0, 5, 10, 20, 17};
        int sumHeadShot1 = Arrays.stream(k).sum();
        double average1 = sumHeadShot1 / (double) k.length;

        System.out.print(" Введите название второй команды: ");
        Scanner scan2 = new Scanner(System.in);
        String hunters = scan2.next();

        int[] h = new int[]{0, 5, 6, 20, 17};
        int sumHeadShot2 = Arrays.stream(h).sum();
        double average2 = sumHeadShot2 / (double) h.length;

        if (average1 > average2) {
            System.out.println("Победа " +killers);
        } else if (average1 < average2) {
            System.out.println("Победа " +hunters);
        } else {
            System.out.println("Ничья");
        }
    }
}


