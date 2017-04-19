import java.util.*;

/**
 * Created by Ania on 19.04.2017.
 */
public class Collections {
    public static void main(String[] args) {

        Collection<Integer> coll = new ArrayList<Integer>();
        List<Integer> list1 = new ArrayList<>();

        list1.add(2544);
        list1.add(65465);
        list1.add(25454);
        list1.add(2544);

        for (Integer el : list1) {
            System.out.println(el);
        }
        System.out.println();

        Set<String> mySet = new HashSet<>();
        mySet.add("Abc");
        mySet.add("Peter");
        mySet.add("Anne");

        for (String st : mySet) {
            System.out.println(st);
        }

        List<String> myStrList = new ArrayList<>();
        myStrList.add("MyString");

        myStrList.addAll(mySet);

        for(String s : myStrList) {
            System.out.println(s);
        }

        if (myStrList.contains("Peter")) {
            System.out.println("myStrList contains Peter");
        }

        Set<String> mySortedSet = new TreeSet<>();
        mySortedSet.addAll(myStrList);
        System.out.println();
        for (String s : mySortedSet) {
            System.out.println(s);
        }
    }
}

