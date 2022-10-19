// Дано четное число N (>0) и символы c1 и c2.
//  Написать метод, который вернет строку длины N, 
//  которая состоит из чередующихся символов c1 и c2, 
//  начиная с c1.

package seminar_2;

public class task_1 {
    public static void main(String[] args) {
        // System.out.print("\033[H\033[2J");
        StringBuilder sb = new StringBuilder();
        String c1 = "a";
        String c2 = "b";
        int n = 6;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sb.append(c1);
            } else {
                sb.append(c2);
            }
        }
        System.out.println(sb.toString());
    }
}
