/**
 * Created by Ania on 22.03.2017.
 */
public class BowlsRecursion {


    public static int countBowls(int row) {

        if (row==1) return 1;
        else return countBowls(row-1) + 2;

    }

    public static void main(String[] args) {
        int sum = countBowls(1000);

        System.out.println(sum);

        }

    }
