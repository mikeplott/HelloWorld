import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by michaelplott on 9/16/16.
 */
public class HashMapStuff {


    static HashMap<String, Person> users = new HashMap<>();

    public static void main(String[] args) {

        users.put("Alice", new Person("Alice", 30, true));
        users.put("Bob", new Person("Bob", 40, true));
        Scanner scanner = new Scanner(System.in);

        boolean keepRunning = true;
        while (keepRunning) {
            System.out.println("Enter username");
            String name = scanner.nextLine();

            if (!users.containsKey(name)) {
                Person p = new Person(name, 30, true);
                users.put(name, p);
                System.out.println("Created new user!");
                }
                Person person = users.get(name);
                System.out.println("Logged in as: " + person.name);

            }
        }
    }









//}
//Scanner scanner = new Scanner(System.in);
//        if(users.get(name) == null) {
//            users.put(name,);
//        }
//            boolean loggedIn = true;
//            while(loggedIn) {
//                System.out.println("[1] Check Balance");
//                System.out.println("[2] Withdraw");
//                System.out.println("[3] Cancel");
//                String choice = scanner.nextLine();
//                if(choice.equals("3")){
//                    loggedIn = false;
//                }