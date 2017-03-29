import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Ania on 22.03.2017.
 */
public class TextFileRead {

    public static void main(String[] args) {
        //  throws FileNotFoundException {
        /*
        System.out.print("Please provide input: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(input);
*/

        File myFile = new File("D:\\file.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(myFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int i=0;
        while (scanner.hasNext()) {
            String currLine = scanner.nextLine();
            System.out.println(i + ": " + currLine);
            i++;
        }
    }
}

