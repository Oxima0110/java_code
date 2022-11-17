// Реализуйте структуру телефонной книги с помощью HashMap, 
// учитывая, что 1 человек может иметь несколько телефонов.

package homework_5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task_1 {

    public static void main(String[] args) {
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> phonebook = new HashMap<>();
        phonebook.put(745382, "Ivanov");
        phonebook.put(748582, "Ivanov");
        phonebook.put(945632, "Petrov");
        phonebook.put(881569, "Sidorov");

        while (flag) {
            System.out.println("""
                    Какую операцию вы хотите выполнить?
                    1-Запись в телефонную книгу
                    2-Поиск в телефонной книге
                    3-Удаление записи
                    4- Просмотр телефонной книги
                    5- Выход\n
                        """);
            String choice = sc.nextLine();
            switch (choice) {
                case ("1"):
                    System.out.println("Введите фамилию: ");
                    String name = sc.nextLine();
                    System.out.println("Введите телефон: ");
                    Integer number = sc.nextInt();
                    phonebook.put(number, name);
                    break;
                case ("2"):
                    System.out.println("Введите фамилию: ");
                    String name2 = sc.nextLine();
                    for (var item : phonebook.entrySet()) {
                        if (item.getValue().equals(name2)) {
                            System.out.printf("%s : %d\n", item.getValue(), item.getKey());
                        }
                    }
                    break;
                case ("3"):
                    System.out.println("Введите фамилию: ");
                    String name3 = sc.nextLine();
                    Integer number2 = 0;
                    for (var item : phonebook.entrySet()) {
                        if (item.getValue().equals(name3)) {
                            System.out.printf("%s : %d\n запись удалена\n", item.getValue(), item.getKey());
                            number = item.getKey();
                        }
                    }
                    phonebook.remove(number2);
                    break;

                case ("4"):
                    for (var item : phonebook.entrySet()) {
                        System.out.printf("%s : %d\n", item.getValue(), item.getKey());
                    }
                    break;
                case ("5"):
                    flag = false;
                    sc.close();
                    break;
            }

        }
    }
}
