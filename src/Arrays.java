/**
 * Created by Ania on 22.03.2017.
 */
public class Arrays {

    public static void main(String[] args) {
        Integer[] arInt = new Integer[3];
        arInt[0] = 5;
        arInt[1] = 7;

        for (int i=0;i<arInt.length;i++) {
            System.out.println(arInt[i]);
        }

        String[] arStr = new String[]{
                "abc", "def", "ghi"
        };

        for (int j=0;j<arStr.length;j++) {
            System.out.println(arInt[j]);
        }

        System.out.println();

        for (String el: arStr) {
            System.out.println("foreach: " + el);

        }

    }
}
