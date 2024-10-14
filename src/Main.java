import java.time.LocalDate;

public class Main {
    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }
    }

    public static String getRecommendations(int clientOS, int year) {
        String recommendation = "";
        if (year <= 2015) {
            if (clientOS == 1) {
                recommendation = "Установите облегченную версию приложения для Android по ссылке";
            } else if (clientOS == 0) {
                recommendation = "Установите облегченную версию приложения для iOS по ссылке";
            }
        } else {
            if (clientOS == 1) {
                recommendation = "Установите версию приложения для Android по ссылке";
            } else if (clientOS == 0) {
                recommendation = "Установите версию приложения для iOS по ссылке";
            }
        }
        return recommendation;
    }

    public static String getDaysToDelivery(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return "Потребуется дней: 1";
        } else if (deliveryDistance <= 60) {
            return "Потребуется дней: 2";
        } else if (deliveryDistance <= 100) {
            return "Потребуется дней: 3";
        } else {
            return "Доставка недоступна";
        }
    }

    public static void main(String[] args) {
        // Task 1
        int year = 2021;
        if (isLeapYear(year)) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }

        System.out.println();
        // Task 2
        int currentYear = LocalDate.now().getYear();
        int clientOS = 1;
        System.out.println(getRecommendations(clientOS, currentYear));

        System.out.println();
        //Task 3
        int deliveryDistance = 95;
        System.out.println(getDaysToDelivery(deliveryDistance));

    }
}