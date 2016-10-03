import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

/**
 * Created by michaelplott on 9/21/16.
 */
public class Exercise03 {
    public static void main(String[] args) {
        String[] names = {"alice", "bob", "charlie", "daniel", "andrew", "alex"};
        // [] ["bob", "charlie", "daniel"]
        ArrayList<String> namesArr = new ArrayList<>(Arrays.asList(names));
        for (String name : names) {
            if (name.startsWith("a")) {
                namesArr.remove(name);
            }
        }
        System.out.println(namesArr);
        System.out.println();
        for (int i = 0; i < names.length; i++) {
            if (names[i].startsWith("a")) {
                namesArr.remove(names[i]);
            }
        }
        System.out.println(namesArr);
        System.out.println();

        // iterator
        namesArr = new ArrayList<>(Arrays.asList(names));
        Iterator<String> iter = namesArr.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            if (name.startsWith("a")) {
                iter.remove();
            }
        }

        // stream
        namesArr = new ArrayList<>(Arrays.asList(names));
        namesArr = namesArr.stream().filter((name) -> {
            return !name.startsWith("a");
        }).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(namesArr);
    }
}


