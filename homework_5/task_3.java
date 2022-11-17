// На шахматной доске расставить 8 ферзей так, 
// чтобы они не били друг друга. И вывести Доску.

package homework_5;

import java.util.LinkedList;
import java.util.Random;

public class task_3 {

    public static boolean checking(LinkedList<Integer> arr_1, LinkedList<Integer> arr_2, int num_1, int num_2) {
        for (int i = 0; i < arr_1.size(); i++) {
            if (arr_1.get(i) == num_1) {
                return false;
            }
        }
        for (int i = 0; i < arr_2.size(); i++) {
            if (arr_2.get(i) == num_2) {
                return false;
            }
        }
        for (int i = 0; i < arr_1.size(); i++) {
            if (Math.abs(arr_1.get(i) - num_1) == Math.abs(arr_2.get(i) - num_2)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String[][] array = new String[8][8];
        int count = 0;
        while (count != 8) {
            LinkedList<Integer> list_x = new LinkedList<Integer>();
            LinkedList<Integer> list_y = new LinkedList<Integer>();
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = "0";
                }
            }
            Random rnd = new Random();
            int x_1 = rnd.nextInt(8);
            int y_1 = rnd.nextInt(8);
            array[x_1][y_1] = "Q";
            list_x.add(x_1);
            list_y.add(y_1);
            count = 1;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (checking(list_x, list_y, i, j)) {
                        array[i][j] = "Q";
                        list_x.add(i);
                        list_y.add(j);
                        count++;
                    }
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
