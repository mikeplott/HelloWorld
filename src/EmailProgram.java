import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by michaelplott on 9/20/16.
 */
public class EmailProgram {

    public static void main(String[] args) {
        HashMap<String, User> users = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter name:");
            String name = scanner.nextLine();

            User user = users.get(name);
            if (user == null) {
                user = new User();
                user.name = name;
                users.put(name, user);
            }

            System.out.println("[1] New email");
            System.out.println("[2] List emails");
            String option = scanner.nextLine();

            if (option.equalsIgnoreCase("1")) {
                System.out.println("Type email destination:");
                String dest = scanner.nextLine();
                System.out.println("Type email body:");
                String body = scanner.nextLine();
                Email e = new Email(dest,"",body, false);
                user.emails.add(e);
            }
            else if (option.equalsIgnoreCase("2")) {
                for (Email email : user.emails) {
                    System.out.println(email.destination + " " + email.body);
                }
            }
            else {
                System.out.println("Invalid option");
            }
        }
    }
}
