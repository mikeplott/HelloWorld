import java.util.ArrayList;

/**
 * Created by michaelplott on 9/26/16.
 */
public class Exercise04 {
    public static void main(String[] args) {
        String[] names = {"charlie", "david", "chuck" ,"bob", "alice", "andrew"};
        ArrayList<String> sortedNames = new ArrayList<>();
        //sortedNames must contain the names sorted alphabetically

//        for (int i = 0; i < names.length; i++) {
//            sortedNames.add(names[i]);
//            if (names[i].compareTo(sortedNames.get(i)) > sortedNames.get(i).compareTo(names[i])) {
//                sortedNames.add(names[i]);
//            }
//        }
        for (String name : names) {
            int index = 0;
            // find the correct index;
            for (String sortedName : sortedNames) {
                if (name.compareTo(sortedName) > 0) {
                    index++;
                }
                else {
                    break;
                }
            }
            sortedNames.add(index, name);
        }
        System.out.println(sortedNames);
    }
}
