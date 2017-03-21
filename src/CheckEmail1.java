/**
 * Created by Ania on 21.03.2017.
 */
public class CheckEmail1 {

    public static void main(String[] args) {
        boolean e;
        e = true && false;
        e = "abc@gmail.com".contains("@");
        e = "abc@gmail.com".contains(".");
        if (e) {
            System.out.print("e is valid");
        } else System.out.print("e is not valid");
    }
}