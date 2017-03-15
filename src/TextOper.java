/**
 * Created by ag67511 on 3/8/2017.
 */
public class TextOper {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "def";
        String s3 = s1 + s2;

        int posBC = s3.lastIndexOf("ab");

        System.out.println(s3);
        System.out.println(posBC);

        String s4 = s3.substring(2, 4);

    }
}

