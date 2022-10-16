// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)

package homework_1;

import java.util.Scanner;

public class task_1 {

    static int sum(int number) {
        if (number == 1) return 1;
        return number + sum(number - 1);
    }
    static double factor(int number) {
        if (number == 1) return 1;
        return number * factor(number - 1);
    }

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = iScanner.nextInt();
        iScanner.close();
        int sum_num = sum(num);
        double factor_num = factor(num);
        System.out.printf("Треугольное число = %d \n", sum_num);
        System.out.printf("Факториал = %.1f", factor_num);
    }

}
