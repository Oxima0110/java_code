// Текст задачи:
//  Напишите метод, который сжимает строку. 
//  Пример: вход aaaabbbcdd.
// Ответ: результат - a4b3cd2 для примера

package seminar_2;

public class task_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String c1 = "aaaabbbcdd";
        int count = 0;
        c1 = c1 + " ";
        for (int i = 0; i < c1.length() - 1; i++) {
            if (c1.charAt(i) == c1.charAt(i + 1)) {
                count++;
            } else {
                count++;
                sb.append(c1.charAt(i));
                if (count != 1) {
                    sb.append(count);
                }
                count = 0;
            }
        }
        System.out.println(sb.toString());
    }
}
