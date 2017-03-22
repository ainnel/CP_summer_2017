/**
 * Created by Ania on 22.03.2017.
 */
public class SumArrElem {

    static Double sumArray(Double[] arr) {
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    public static void main(String[] args) {

        Double[] arDb = new Double[]{
                45.54, 53.23, 24.34
        };

        System.out.println(sumArray(arDb));
    }
}