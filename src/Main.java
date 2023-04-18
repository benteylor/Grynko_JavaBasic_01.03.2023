interface MobileInterface {
    void call();
    void sms();
    void internet();
}

interface LinuxOS {
    void runLinuxCommands();
}

interface iOS {
    void applePay();
}

class Androids implements MobileInterface, LinuxOS {
    public void call() {
        System.out.println("Дзвінки з Android");
    }
    public void sms() {
        System.out.println("Відправлення SMS з Android");
    }
    public void internet() {
        System.out.println("Перегляд веб-сторінок з Android");
    }
    public void runLinuxCommands() {
        System.out.println("Запуск команд Linux з Android");
    }
}

class iPhones implements MobileInterface, iOS {
    public void call() {
        System.out.println("Дзвінки з iPhone");
    }
    public void sms() {
        System.out.println("Відправлення SMS з iPhone");
    }
    public void internet() {
        System.out.println("Перегляд веб-сторінок з iPhone");
    }
    public void applePay() {
        System.out.println("Запуск команд Linux з iPhone");
    }
}

public class Main {
    public static void main(String[] args) {
        Androids androidPhone = new Androids();
        iPhones iPhone = new iPhones();

        androidPhone.call();
        androidPhone.sms();
        androidPhone.internet();
        androidPhone.runLinuxCommands();

        iPhone.call();
        iPhone.sms();
        iPhone.internet();
        iPhone.applePay();
    }
}