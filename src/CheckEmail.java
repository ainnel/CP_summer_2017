import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Ania on 21.03.2017.
 */
public class CheckEmail {

    public static void main(String[] args) {
        String email = "text@gmail.com";
        Pattern pat = Pattern.compile("[A-Za-z0-9._=%&^#'!?]+[@A-Za-z0-9.]+.[A-za-z]");
        Matcher mat = pat.matcher(email);
        if (mat.matches()) {
            System.out.println("Email address valid");
        } else {
            System.out.println("Email address not valid");
            }
        }
    }