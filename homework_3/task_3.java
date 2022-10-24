// Задан целочисленный список ArrayList. 
// Найти минимальное, максимальное и среднее ариф.
// из этого списка

package homework_3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class task_3 {

    public static ArrayList<Integer> getArray(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < num; i++) {
            list.add(rnd.nextInt(1, 50));
        }
        return list;
    }

    private static void getInt(ArrayList<Integer> array) {
        int minArr = array.get(0);
        int maxArr = array.get(0);
        float sumArr = 0;
        for (int i = 0; i < array.size(); i++) {
            sumArr += array.get(i);
            if (array.get(i) > maxArr) {
                maxArr = array.get(i);
            }
            if (array.get(i) < minArr) {
                minArr = array.get(i);
            }
        }
        sumArr = sumArr / array.size();
        System.out.printf("Максимальный элемент: %d. Минимальный элемент: %d. Среднее арифмет: %.2f", maxArr, minArr, sumArr);
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int n = iScanner.nextInt();
        iScanner.close();
        ArrayList<Integer> listInput = getArray(n);
        System.out.println(listInput);
        getInt(listInput);
    }
}
