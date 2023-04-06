public class ShuttleNumbers {
    public static void main(String[] args) {
        int count = 0;
        int number = 1;
        while (count < 100) {
            if (!(String.valueOf(number).contains("4")) && !(String.valueOf(number).contains("9"))) {
                System.out.println("Spaceship " + (count + 1) + ": " + number);
                count++;
            }
            number++;
        }
    }
}


