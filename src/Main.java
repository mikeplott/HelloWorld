import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by michaelplott on 9/15/16.
 */
public class Main {
    public static void main(String[] args) {
    /*    String[] names = new String[3];
        names[0] = "Alice";
        names[1] = "Bob";
        names[2] = "Charlie";

          for(int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
    }
            //while loop
            int index = 0;
            while(index < names.length) {
                System.out.println(names[index]);
                index++;
            }

            //new for loop
            for(String name : names) {
                System.out.println(name);
            }

            // unboxed -> boxed
            // int -> Integer
            // long -> Long
            // boolean -> Boolean

            String indexStr = String.valueOf(index);
            int indexInt = Integer.valueOf(indexStr);

            Integer score = null;
*/
        /*
            static | sequential | Associative
           ----------------------------------
           dynamic | ArrayList  | HashMap
           ----------------------------------

         */

//        ArrayList<String> names2 = new ArrayList();
//        names2.add("Alice");
//        names2.add("Bob");
//        names2.add("Charlie");
//       // System.out.println(names2.get(0));
//        names2.remove(1);
//        System.out.println(names2);

        HashMap<String, Object> person = new HashMap();
        person.put("name", "Alice");
        person.put("age", 30);
        person.put("location", "Charleston");
        person.put("name", "Bob");
       // System.out.println(person.remove("age"));
        System.out.println(person);

       // names2.add(person);
        //System.out.println(names2);

       // person.put("names", names2);
        //System.out.println(person);
//        String alice = names2.get(0);
//        String bob = (String) person.get("name");
//
//        HashMap<String, Person> users = new HashMap<>();
//        Person p = new Person("Bob", 30, true);
//        users.put("bob", p);
//        Person p2 = users.get("bob");
//        Person p2 = users.get("alice");
//        if (p2 == null) {
//            users.put("alice", new Person("Alice", 30, true));
//        }
    }
}

