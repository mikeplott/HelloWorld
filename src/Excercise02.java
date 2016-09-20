import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by michaelplott on 9/20/16.
 */
public class Excercise02 {

    public static void main(String[] args) {
        Email[] emails = {
                new Email("alice@gmail.com", "HELLO", "yo", false),
                new Email("bob@gmail.com", "HELLO", "yo", false),
                new Email("charlie@gmail.com", "HELLO", "yo", false),
                new Email("alice@gmail.com", "HELLO", "yo", false),
                new Email("bob@gmail.com", "HELLO", "yo", false),
        };

        // hash map that loops like this:
        // "alice@gmail.com" -> arraylist of two emails
        // "bob@gmail.com" -> arraylist of two eamils
        // "charlie@gmail.com -> arraylist of one email
        //

        HashMap<String, ArrayList<Email>>allDaEmails = new HashMap<>();
//
//        for (int i = 0; i < emails.length; i++) {
//            Email email = emails[i];
//            String firstLetter = String.valueOf(email.destination.charAt(0));
//            allDaEmails.put(firstLetter, new ArrayList<String>);
//        }
//
//        for (int i = 0; i < emails.length; i++) {
//            String firstLetter = String.valueOf(charAt(0));
//            ArrayList<Email> arr = allDaEmails.get(firstLetter);
//
//            System.out.println(arr);
//
//
//
//    }

        for (Email e : emails) {
            ArrayList<Email> arr = allDaEmails.get(e.destination);
            if (arr == null) {
                arr = new ArrayList<>();
                allDaEmails.put(e.destination, arr);
            }
            arr.add(e);
        }
        System.out.println(allDaEmails);

        //ALTERNATIVE SOLUTION

        allDaEmails.clear();

        for (Email e : emails) {
            if (!allDaEmails.containsKey(e.destination)) {
                allDaEmails.put(e.destination, new ArrayList<>());
            }
            allDaEmails.get(e.destination).add(e);
        }
        System.out.println(allDaEmails);
}
}
