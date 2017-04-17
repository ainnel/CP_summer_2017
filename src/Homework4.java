import java.util.Scanner;
import java.io.*;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by Ania on 14.04.2017.
 */

public class Homework4 {
    public static void main(String[] args) throws FileNotFoundException, java.io.IOException
    {
        boolean  firstLine;             // Signal it is a header line
        double   open, close, change;   // Stock values

        NumberFormat nf =
                NumberFormat.getNumberInstance(new Locale("en", "US"));  // Numbers in file are in US format
        nf.setMinimumFractionDigits(6);
        nf.setMaximumFractionDigits(6);

        File myDir = new File("C:\\Project");
        File[] fileList = myDir.listFiles();

        for (File f : fileList)
        {
            if ( !f.getName().toLowerCase().endsWith(".csv") )
                continue;

            // Create output file
            String aux = f.toString();
            String newFileName = aux.substring(0,aux.length()-4)+"-out.csv";
            File newFile = new File(newFileName);
            f.createNewFile();
            FileWriter fw = new FileWriter(newFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw, true);

            // Process one file
            Scanner scanner = new Scanner(f);
            firstLine = true;
            while (scanner.hasNext())
            {
                String currLine = scanner.nextLine();
                if ( firstLine )
                {  firstLine = false;
                    out.println(currLine+",Percentage change");
                    continue;
                }

                // Divide the String into an array using
                // the delimiter ","
                String[] elem = currLine.split(",");
                open = Double.parseDouble(elem[1]);
                close= Double.parseDouble(elem[4]);
                change = (close-open)/open;
                // System.out.println(currLine+','+nf.format(change));
                out.println(currLine+','+nf.format(change));
            }
            out.close();
        }
    }
}

