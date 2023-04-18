package FitnessTracker;

import java.time.LocalDate;
import java.time.Period;

public class FitnessTracker {

    private final String firstName;
    private String lastName;
    private final LocalDate dateOfBirth;
    private final String email;
    private final String phone;
    private int weight;
    private String bloodPressure;
    private int stepsPerDay;
    private final int age;

    public FitnessTracker(String firstName, LocalDate dateOfBirth, String email, String phone) {
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phone = phone;
        this.age = calculateAge();
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public void printAccountInfo() {
        System.out.println("Ім'я: " + firstName + " " + lastName);
        System.out.println("Дата народження: " + age);
        System.out.println("Емейл: " + email);
        System.out.println("Телефон: " + phone);
        System.out.println("Вага: " + weight + "кг");
        System.out.println("Тиск: " + bloodPressure);
        System.out.println("Кроки за день: " + stepsPerDay);
    }

    private int calculateAge() {
        LocalDate currentDate = LocalDate.of(2020, 1, 1);
        return Period.between(dateOfBirth, currentDate).getYears();
    }
    public static void main(String[] args) {

        FitnessTracker user1 = new FitnessTracker("Тарас", LocalDate.of(1995, 3, 25), "tar@mail.com", "+3-8093-81-77-104");
        FitnessTracker user2 = new FitnessTracker("Максим", LocalDate.of(1990, 9, 15), "max@mail.com", "+3-8093-35-16-156");
        FitnessTracker user3 = new FitnessTracker("Вано", LocalDate.of(1985, 5, 8), "vano@mail.com", "+3-8093-26-15-752");
        FitnessTracker user4 = new FitnessTracker("Тетяна", LocalDate.of(2000, 11, 30), "tat@mail.com", "+3-8093-11-79-258");
        FitnessTracker user5 = new FitnessTracker("Марина", LocalDate.of(1988, 7, 20), "mar@mail.com", "+3-8093-93-93-933");

        user1.setLastName("Таратуля");
        user1.setWeight(160);
        user1.setBloodPressure("120/80");
        user1.setStepsPerDay(10000);

        user2.setLastName("Перепелиця");
        user2.setWeight(178);
        user2.setBloodPressure("110/70");
        user2.setStepsPerDay(15000);

        user3.setLastName("Керзевадзе");
        user3.setWeight(189);
        user3.setBloodPressure("110/60");
        user3.setStepsPerDay(8000);

        user4.setLastName("Романюк");
        user4.setWeight(168);
        user4.setBloodPressure("130/90");
        user4.setStepsPerDay(7000);

        user5.setLastName("Любов");
        user5.setWeight(165);
        user5.setBloodPressure("140/80");
        user5.setStepsPerDay(12000);

        user1.printAccountInfo();
        System.out.println();
        user2.printAccountInfo();
        System.out.println();
        user3.printAccountInfo();
        System.out.println();
        user4.printAccountInfo();
        System.out.println();
        user5.printAccountInfo();
    }
}