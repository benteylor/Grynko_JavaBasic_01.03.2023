import java.util.Scanner;

public class TakeNumber {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int computer = numbers[(int) (Math.random() * numbers.length)];
        int user;
        Scanner input = new Scanner(System.in);
        System.out.print("Вам необходимо угадать число которое загадал компьютер от 1 до 10. ");
        do {
            System.out.print("Введите число: ");
            user = input.nextInt();
            if (user < computer) {
                System.out.println("Вы не угадали, попробуйте ещё раз.");
            } else if (user > computer) {
                System.out.println("Вы не угадали, попробуйте ещё раз.");
            } else {
                System.out.println("Поздравляю! Вы победили:)");
            }
        } while (user != computer);
    }
}
