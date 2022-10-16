// Реализовать простой калькулятор
package homework_1;
import java.util.Scanner;

public class task_3 {
    static void calc(int num_1, int num_2, String sign) {
        switch(sign) {
            case ("+"):
            System.out.printf("%d + %d = %d", num_1, num_2, num_1 + num_2);
            break;
            case ("-"):
            System.out.printf("%d - %d = %d", num_1, num_2, num_1 - num_2);
            break;
            case ("*"):
            System.out.printf("%d * %d = %d", num_1, num_2, num_1 * num_2);
            break;
            case ("/"):
            if (num_2 == 0){
                System.out.println("На ноль делить нельзя!");
                break;
            }
            float a = num_1;
            float b = num_2;
            // Double res = (Double)num_1 / (Double)num_2;
            System.out.printf("%.1f / %.1f = %.2f", a, b, a / b);
            break;

        }
    }
    public static void main(String[] args) {
    Scanner iScanner = new Scanner(System.in);
    System.out.println("Введите первое число: ");
    int a = iScanner.nextInt();
    System.out.print("Введите + для сложения\nВведите - для вычитания\nВведите * для умножения\nВведите / для деления\n");
    String choice = iScanner.next();
    System.out.println("Введите второе число: ");
    int b = iScanner.nextInt();
    iScanner.close();
    calc(a, b, choice);   
    }
}
