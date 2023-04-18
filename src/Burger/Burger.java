package Burger;

public class Burger {
    private final String bun;
    private final String meat;
    private final String cheese;
    private final String greens;
    private final String mayo;

    public Burger() {
        this.bun = "булочка";
        this.meat = "м'ясо";
        this.cheese = "сир";
        this.greens = "зелень";
        this.mayo = "майонез";
        System.out.print("Бургер стандарт:  ");
        printIngredients();
    }

    public Burger(boolean isDiet) {
        this.bun = "булочка";
        this.meat = "м'ясо";
        this.cheese = "сир";
        this.greens = "зелень";
        if (!isDiet) {
            this.mayo = "майонез";
        } else {
            this.mayo = "без майонезу";
        }
        System.out.print("Бургер дієтичний: ");
        printIngredients();
    }

    public Burger(int meatCount) {
        this.bun = "булочка";
        this.meat = "м'ясо x" + meatCount;
        this.cheese = "сир";
        this.greens = "зелень";
        this.mayo = "майонез";
        System.out.print("Бургер дабл мясо: ");

        printIngredients();
    }

    private void printIngredients() {
        System.out.println("(Склад: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayo + ")");
    }
}
