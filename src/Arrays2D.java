/**
 * Created by Ania on 22.03.2017.
 */
public class Arrays2D {

    public static void main(String[] args) {

        Double[][] arr2D = new Double[3][3];
        arr2D[0][0] = 343d;
        arr2D[0][1] = 254d;
        arr2D[0][2] = 23.34d;
        arr2D[1][0] = 34.34;

        for (int row=0;row<arr2D.length;row++) {
            for (int co1=0;co1<arr2D[row].length;co1++) {
                System.out.println(arr2D[row][co1] + "\t");
            }
            System.out.println();
        }
    }
}

