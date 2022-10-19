// Напишите метод, который составит строку, состоящую 
// из 10 повторений слова TEST и метод, который запишет 
// эту строку в простой текстовый файл, обработайте 
// исключения.
package seminar_2;
import java.io.FileWriter;
import java.io.IOException;

public class task_3 {
    public static String concad(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append("TEST").append(" ");

        }
        return sb.toString();
    }
public static void writeFile(String inputString) {
    try (FileWriter fw = new FileWriter("file.txt", false)) {
        fw.write(inputString);
        fw.flush();
    } catch(IOException ex) {
        System.out.println(ex.getMessage());
    }
}
    public static void main(String[] args) {
String inputStr = concad();
writeFile(inputStr);           
    }
}
