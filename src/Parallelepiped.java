public class Parallelepiped {
    public static void main(String[] args) {
        int height = 5;
        int width = 5;
        int depth = 10;
        int volume = height * width * depth;
        System.out.println( " Об'єм паралелепіпеда = " + volume  );
        int length = 4 * (height + width + depth);
        System.out.println( " Сумарна довжина всіх сторін = " + length );
    }
}
