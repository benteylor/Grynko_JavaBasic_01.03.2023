package Burger;

public class BurgerMain {
    public static void main(String[] args) {
        // Створення звичайного бургера
        Burger standart = new Burger();

        // Створення дієтичного бургера
        Burger notMayo = new Burger(true);

        // Створення бургера з подвійним м'ясом
        Burger burger3 = new Burger(2);
    }
}
