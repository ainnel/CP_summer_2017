/**
 * Created by ag67511 on 3/8/2017.
 */
public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello World");

        int a;
        a = 5;
        a++;
        int b = a;

        b = b + 5;
        b = b * 3;
        a = a / 4;

        int c = 11 % 4;


        System.out.println("a=" + a);
        System.out.println("b=" + b);
        System.out.println("c=" + c);

        double d1 = 45.5;
        double d2 = 5.2;
        double d3 = d1 / d2;

        System.out.println("d3");

        Float fl = new Double(d3).floatValue();
        fl = new Integer(b).floatValue();

        System.out.println(fl);




    }
}

