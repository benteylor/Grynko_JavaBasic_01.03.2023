import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        Random random = new Random();
        int[] first = new int[7];
        int[] second = new int[7];
        for (int i = 0; i < 7; i++) {
            first[i] = random.nextInt(10);
            second[i] = random.nextInt(10);
        }
        Arrays.sort(first);
        Arrays.sort(second);

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        int matches = 0;
        for (int i = 0; i < 7; i++) {
            if (first[i] == second[i]) {
                matches++;
            }
        }
        System.out.println("Кількість збігів: " + matches);
    }
}

