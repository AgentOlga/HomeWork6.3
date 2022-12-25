import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        // Реализуйте метод, который получает в качестве параметра год, проверяет, является ли он високосным, и выводит результат в консоль.
        task2();
        // Вспомните задание 2 из урока «Условные операторы», где вы предлагали пользователю облегченную версию приложения.
        // Напишите метод, куда подаются два параметра: тип операционной системы (0 — iOS, 1 — Android ) и год выпуска устройства.
        //Если устройство старше текущего года, предложите ему установить облегченную версию.
        //Текущий год можно получить таким способом:
        //int currentYear = LocalDate.now().getYear();
        //Или самим задать значение вручную — ввести в переменную числовое значение.
        //В результате программа должна выводить в консоль сообщение, какую версию приложения (обычную или облегченную)
        //и для какой ОС (Android или iOS) установить пользователю.
        task3();
        //доработать код, а именно написать метод, который на вход принимает дистанцию и возвращает итоговое количество дней доставки.


        defineApp(1,2019);
        printRulesDeliveryCard(95);
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2022 - 100;
        for (int i = year; i < year + 300; i++) {
            if (isLeapYear(i))
                System.out.println(i + " год является високосным.");
            else
                System.out.println(i + " год не является високосным.");
        }

    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 || year % 100 == 0 || year % 400 == 0;
    }

    public static void task2() {
        System.out.println("Задача 2");

    }
    public static void defineApp(int mobileOs, int mobileYear) {
        String osName = getClientOs(mobileOs);
        String osVersion = getAppVersion(mobileYear);
        System.out.println("Для ОС " + osName + " установите " + osVersion + " версия ");
    }

    public static String getClientOs(int mobileOs) {
        if (mobileOs == 0) {
            return "iOs";
        } else {
            return "android";
        }
    }

    public static String getAppVersion(int mobileYear) {
        int currentYear = LocalDate.now().getYear();
        if (currentYear != mobileYear) {
            return "Lite";
        } else {
        }
        return "usual";
    }

    public static void task3() {
        System.out.println("Задача 3");
    }
    public static int rulesDeliveryCard (int distance) {
        int deliveryDays;
        if (distance <= 20) {
            deliveryDays = 1;
        }
        else  if (distance <= 60) {
            deliveryDays = 2;
        }
        else if (distance <= 100) {
            deliveryDays = 3;
        }
        else {
            deliveryDays = 0;
        }
        return deliveryDays;
    }
    public static void printRulesDeliveryCard (int distance) {
        System.out.println("Потребуется дней : " + rulesDeliveryCard(distance) + " для доставки.");
    }
}
