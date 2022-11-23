package homework_6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Selection choice = new Selection();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String stringChoice;
        int intChoice;
        double doubleChoice;
        List<Notebook> result;

        while (flag) {
            System.out.println("""
                    Выбирите критерий для поиска ноутбука:
                    1- Производитель
                    2- Цвет
                    3- Размер экрана
                    4- Марка процессора
                    5- Количество ядер процессора
                    6- Размер оперативной памяти
                    7- Размер жесткого диска
                    8- Марка видеокарты
                    9- Выход
                        """);
            String operation = sc.nextLine();
            switch (operation) {
                case ("1"):
                    System.out.println("Введите производителя ноутбука:");
                    stringChoice = sc.nextLine();
                    result = new ArrayList<>(choice.getByBrend(stringChoice));
                    if (result.isEmpty()) {
                        System.out.println("Нет подходящего ноутбука");
                    } else {
                        for (Notebook item : result) {
                            System.out.println(item);
                        }
                    }
                    break;

                case ("2"):
                    System.out.println("Введите цвет ноутбука:");
                    stringChoice = sc.nextLine();
                    result = new ArrayList<>(choice.getByColor(stringChoice));
                    if (result.isEmpty()) {
                        System.out.println("Нет подходящего ноутбука");
                    } else {
                        for (Notebook item : result) {
                            System.out.println(item);
                        }
                    }
                    break;

                case ("3"):
                    System.out.println("Введите размер экрана:");
                    doubleChoice = sc.nextDouble();
                    result = new ArrayList<>(choice.getByScrean(doubleChoice));
                    if (result.isEmpty()) {
                        System.out.println("Нет подходящего ноутбука");
                    } else {
                        for (Notebook item : result) {
                            System.out.println(item);
                        }
                    }
                    break;

                case ("4"):
                    System.out.println("Введите бренд процессора:");
                    stringChoice = sc.nextLine();
                    result = new ArrayList<>(choice.getByBrendCpu(stringChoice));
                    if (result.isEmpty()) {
                        System.out.println("Нет подходящего ноутбука");
                    } else {
                        for (Notebook item : result) {
                            System.out.println(item);
                        }
                    }
                    break;

                case ("5"):
                    System.out.println("Введите минимальное количество ядер процессора:");
                    intChoice = sc.nextInt();
                    result = new ArrayList<>(choice.getByNumCores(intChoice));
                    if (result.isEmpty()) {
                        System.out.println("Нет подходящего ноутбука");
                    } else {
                        for (Notebook item : result) {
                            System.out.println(item);
                        }
                    }
                    break;

                case ("6"):
                    System.out.println("Введите минимальный обьем оперативной памяти:");
                    intChoice = sc.nextInt();
                    result = new ArrayList<>(choice.getByRam(intChoice));
                    if (result.isEmpty()) {
                        System.out.println("Нет подходящего ноутбука");
                    } else {
                        for (Notebook item : result) {
                            System.out.println(item);
                        }
                    }
                    break;

                case ("7"):
                    System.out.println("Введите минимальный обьем жесткого диска:");
                    intChoice = sc.nextInt();
                    result = new ArrayList<>(choice.getByMemory(intChoice));
                    if (result.isEmpty()) {
                        System.out.println("Нет подходящего ноутбука");
                    } else {
                        for (Notebook item : result) {
                            System.out.println(item);
                        }
                    }
                    break;

                    case ("8"):
                    System.out.println("Введите бренд видеокарты:");
                    stringChoice = sc.nextLine();
                    result = new ArrayList<>(choice.getByBrendVideo(stringChoice));
                    if (result.isEmpty()) {
                        System.out.println("Нет подходящего ноутбука");
                    } else {
                        for (Notebook item : result) {
                            System.out.println(item);
                        }
                    }
                    break;    

                case ("9"):
                    flag = false;
                    sc.close();
                    break;
            }
        }
    }
}
