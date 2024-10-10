import java.time.LocalDate;

public class Main {
    public static void checkingLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0 && year > 1584) || (year % 400 == 0 && year > 1584)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " " + "год не является високосным");
        }
    }

    public static void getOSAndYear(int clientOS, int clientDeviceYear) {

        String operationSystem;
        int currentYear = LocalDate.now().getYear();

        if (clientOS == 0) {
            operationSystem = "iOS";
        } else {
            operationSystem = "Android";
        }
        if (clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для" + " " + operationSystem + " " + "по ссылке");
        } else {
            System.out.println("Установите версию приложения для" + " " + operationSystem + " " + "по ссылке");
        }

    }

    public static void getDistance(int deliveryDistance) {

        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней: 1");
        } else if (deliveryDistance < 60 && deliveryDistance >= 20) {
            System.out.println("Потребуется дней: 2");
        } else if (deliveryDistance < 100 && deliveryDistance >= 60) {
            System.out.println("Потребуется дней: 3");
        } else if (deliveryDistance >= 100) {
            System.out.println("Доставки нет");
        }

    }

    public static void main(String[] args) {

        /* Задание 1. */
        int value = 2024;
        checkingLeapYear(value);

        /* Задание 2. */
        int value2 = 0;
        int value3 = 2012;
        getOSAndYear(value2, value3);

        /* Задание 3. */
        int deliveryDistance = 65;
        getDistance(deliveryDistance);

    }
}