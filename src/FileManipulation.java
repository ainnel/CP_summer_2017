/**
 * Created by Ania on 29.03.2017.
 */
public class FileManipulation {

    public static void main(String[] args){

        String home = System.getProperty("user.home");
        System.out.println(home);
        System.out.println(
                System.getProperty("java.io.tmpdir"));

        System.out.println(System.getenv("PATH"));

        System.out.println(System.getProperty("user.dir"));
    }
}
