// Напишите метод, который принимает на вход строку (String) 
// и определяет является ли строка палиндромом 
// (возвращает boolean значение).

package homework_2;

import java.util.Scanner;

public class task_3 {
    public static void getPalindrom(String strInput){
        String reverse = new StringBuffer(strInput).reverse().toString();
        System.out.println("\nСтрока до реверса: " + strInput);
        System.out.println("Строка в обратном порядке, после реверса: " + reverse);
        System.out.println(strInput.equalsIgnoreCase(reverse));
    }
    public static void main(String[] args) {
        // String str = "aBba";
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите строку для проверки: ");
        String str = iScanner.nextLine();
        iScanner.close();
        getPalindrom(str);
    }
}
