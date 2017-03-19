/**
 * Created by Ania on 19.03.2017.
 */
public class Fibonacci {

    public static void main(String[] args) {
        int n = 14;        /* number of Fibonacci numbers */
        int f1 = 0, f2 = 1;  /* fn , fn+1 */
        for (int i = 0; i <= n; i++) {
            System.out.println(f1);
            f2 = f1 + f2;
            f1 = f2 - f1;
        }
    }
}
