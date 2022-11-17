// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдет и выведет повторяющиеся 
// имена с количеством повторений. Отсортировать по убыванию 
// популярности Имени.

package homework_5;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class task_2 {

    public static void showName(String[] array) {
        Map<String, Integer> mapName= new HashMap<>();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i].split(" ")[0].equals(array[j].split(" ")[0])) {
                    counter++;
                }
            }
            mapName.putIfAbsent(array[i].split(" ")[0], counter);
            counter = 0;
        }
        mapName.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
               .forEach(System.out::println);;
        
    }
    public static void main(String[] args) {

        String[] array = new String[] { "Иван Иванов", "Светлана Петрова", "Кристина Белова", "Анна Мусина",
                "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова",
                "Анна Владимирова", "Иван Мечников", "Петр Петин", "Иван Ежов" };
        showName(array);

    }
}
