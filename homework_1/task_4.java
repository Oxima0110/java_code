// *+Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, 
// например 2? + ?5 = 69. Требуется восстановить выражение 
// до верного равенства. Предложить хотя бы одно решение 
// или сообщить, что его нет.

package homework_1;

import java.util.Scanner;
public class task_4 {
    static int solution_1(String num) {
        int num_q = 0;
        char num_0 = num.charAt(0);
        char num_1 = num.charAt(1);
        String[] str_num = num.split("");
        if (num_0 == '?' && Character.isDigit(num_1) == true) {
            num_q = Integer.parseInt(str_num[1]);
        }
        if (num_1 == '?' && Character.isDigit(num_0) == true) {
            num_q = Integer.parseInt(str_num[0]) * 10;
        }
        if (Character.isDigit(num_0) == true && Character.isDigit(num_1) == true) {
            num_q = Integer.parseInt(str_num[0]) * 10 + Integer.parseInt(str_num[1]);
        }

        return num_q;
    }

    static void get_result(int num_1, int num_2, int sum) {
        int res = 0;
        res = sum - num_1 - num_2;
        var length_1 = String.valueOf(num_1).length();
        var length_2 = String.valueOf(num_2).length();
        if (num_1 == 0 && num_2 > 0) {
            num_1 = res;
            System.out.printf("%d + %d = %d", num_1, num_2, sum);
        }
        if (length_1 == 2 && length_2 == 1) {
            num_1 = num_1 + res % 10;
            num_2 = num_2 + (res / 10) * 10;
            if (num_1 + num_2 == sum) {
                System.out.printf("%d + %d = %d", num_1, num_2, sum);
            } else {
                System.out.println("Нет решения.");
            }
        }
        if (length_1 == 1 && length_2 == 2) {
            num_2 = num_2 + res % 10;
            System.out.println(num_2);
            num_1 = num_1 + (res / 10) * 10;
            System.out.println(num_1);
            if (num_1 + num_2 == sum) {
                System.out.printf("%d + %d = %d", num_1, num_2, sum);
            } else {
                System.out.println("Нет решения.");
            }
        }
        if (res == 0) {
            System.out.printf("%d + %d = %d", num_1, num_2, sum);
        }
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите уравнение разделяя цифры и знаки пробелом: ");
        String num = iScanner.nextLine();
        iScanner.close();
        String[] arr = num.split(" ");
        String q = arr[0];
        String w = arr[2];
        int e = Integer.parseInt(arr[4]);
        int q_num = solution_1(q);
        int w_num = solution_1(w);
        get_result(q_num, w_num, e);
    }

}
