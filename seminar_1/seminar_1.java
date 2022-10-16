// Написать программу, которая запросит пользователя ввести 
// <Имя> в консоли. 
// Получит введенную строку и выведет в консоль сообщение
// “Привет, <Имя>!”

// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, 
// нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов
//  массива должны быть отличны от заданного, а остальные - 
//  равны ему.

package seminar_1;

import java.util.Scanner;

public class seminar_1 {
    public static void main(String[] args) {
        // Scanner iScanner = new Scanner(System.in);
        // System.out.println("Введите имя: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Привет, %s", name);
        // iScanner.close();
        // int arr[] = new int[] { 1, 1, 0, 1, 1, 1 };

        // Scanner iScanner = new Scanner(System.in);
        // System.out.println("Введите размер массива: ");
        // int size = iScanner.nextInt();
        // int arr[] = new int[size];
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println("Введите элемент массива: ");
        // arr[i] = iScanner.nextInt();
        // }
        // iScanner.close();
        // int max = 0;
        // int count = 0;
        // for (int i = 0; i < arr.length; i++) {
        // if (arr[i] == 1) {
        // count++;
        // if (count > max) {
        // max = count;
        // }
        // } else {
        // count = 0;
        // }
        // }
        // System.out.println(max);

        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a1 = iScanner.nextInt();
        System.out.println("Введите второе число: ");
        int a2 = iScanner.nextInt();
        iScanner.close();
        if (a1 == a2 * a2 || a2 == a1 * a1) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }

}
