import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
/**
 * Created by Ania on 09.05.2017.
 */
public class Homework5 {
    public static void main(String[] args) throws FileNotFoundException, java.io.IOException {
        File myFile = new File("C:\\Workingfromhome.docx");
        Scanner scanner = null;
        try {
            scanner = new Scanner(myFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int i = 0;
        while (scanner.hasNext()) {
            Map<String, File> shapeMap = new HashMap<>();
            File word; word = shapeMap.put("word", new File(String.valueOf(5)));

            System.out.println("word: " + shapeMap.get("word"));

            System.out.println();

            for (String s : shapeMap.keySet()) {
                System.out.println(s + " = " + shapeMap.get(s));
            }

        }
    }
}