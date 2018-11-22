
import java.util.Scanner;

public class DataTaker {
    static Scanner in = new Scanner(System.in);

    static int takeAmountOfCarriages() {
        System.out.println("Введите колл-во вагонов");
        int amountOfCarriages = askIntValue();
        return amountOfCarriages;
    }

    static int[] takeTypeOfCarriages(int amountOfCarriages) {
        int[] typeOfCarriages = new int[amountOfCarriages];
        System.out.println("Введите тип каждого из вагонов\n1 - Пассажирский, 1-й класс\n2 - Пассажирский, 2-й класс\n3 - Грузовой ");
        for (int i = 0; i < amountOfCarriages; i++) {
            System.out.println("Вагон номер " + (i + 1));
            typeOfCarriages[i] = askIntValue();
        }
        return typeOfCarriages;
    }

    static String takeDepartCity() {
        System.out.println("Введите  один из городов, приведённых ниже, как город отправки\nKharkiv Kiyiv Lviv");
        String departCity = askStringValue();
        return departCity;
    }

    static String takeArriveCity() {
        System.out.println("Введите  один из городов, приведённых ниже, как город прибытия.Города прибытия и отправки не должны совпадать\nKharkiv Kiyiv Lviv");
        String arriveCity = askStringValue();
        return arriveCity;
    }

    static int askIntValue() {
        if (in.hasNextInt())
            return in.nextInt();
        else {
            System.out.println("Введите число");
            askIntValue();
        }
        return 0;
    }

    static String askStringValue() {
        boolean isValueNormal = false;
        String tempString = in.next();
        while (isValueNormal) {
            for (Cites c : Cites.values()) {
                if (String.valueOf(c) == tempString) {
                    isValueNormal = true;
                } else {
                    System.out.println("Ввод неверен");
                    askStringValue();
                }
            }
        }
        return tempString;
    }
}
