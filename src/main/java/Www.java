import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 * Created by ASudarenko on 12.03.2018.
 */
public class Www {
    public static void main(String[] args) throws FileNotFoundException {
        /*
            Путь к файлу
         */
        File f = new File("C:/Users/ASudarenko/Desktop/Words.txt");
        Scanner scanner = new Scanner(f);
        List<String> words =  new ArrayList<>();//new ArrayList();
        while (scanner.hasNext()) {
            words.add(scanner.next());
            System.out.println(words);
        }
    }
}
