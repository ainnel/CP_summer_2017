
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.io.BufferedReader;

/**
 * Created by Ania on 09.05.2017.
 */
public class Homework5 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Map map = new HashMap();

        try (BufferedReader br = new BufferedReader(new FileReader("D:\\Workingfromhome.txt"))) {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (map.get(words[i]) == null) {
                        map.put(words[i], 1);
                    } else {
                        int newValue = Integer.valueOf(String.valueOf(map.get(words[i])));
                        newValue++;
                        map.put(words[i], newValue);
                    }
                }
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
        }
        Map<String, String> sorted = new TreeMap<String, String>(map);
        for (Object key : sorted.keySet())

        {
            System.out.println("Word: " + key + "\tCounts: " + map.get(key));
        }
    }
}

