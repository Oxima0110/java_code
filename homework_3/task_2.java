
package homework_3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

// Пусть дан произвольный список целых чисел, удалить из него 
// четные числа

public class task_2 {

    public static ArrayList<Integer> getArray(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < num; i++) {
            list.add(rnd.nextInt(1, 50));
        }
        return list;
    }

    public static void intDelete(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) % 2 == 0) {
                array.remove(i);
                i -= 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int n = iScanner.nextInt();
        iScanner.close();
        ArrayList<Integer> listInput = getArray(n);
        System.out.println(listInput);
        intDelete(listInput);
        System.out.println(listInput);
    }
}
