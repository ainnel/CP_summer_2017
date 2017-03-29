import java.io.File;

/**
 * Created by Ania on 29.03.2017.
 */
public class FileManipulation {

    public static void main(String[] args){

        String home = System.getProperty("user.home");
        System.out.println(home);
        System.out.println(
                System.getProperty("java.io.tmpdir"));

        System.out.println(System.getenv("C:\\Project"));

        System.out.println(System.getProperty("user.dir"));

        String tmpDir = System.getProperty("java.io.tmpdir");
        File tmpDirProject = new File(tmpDir);
        File[] fileList = tmpDirProject.listFiles();
        for (File f : fileList) {
            System.out.println(f.length());
            int sum = (int) f.length();
            System.out.println(sum);

        }
    }
}
