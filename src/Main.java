/**
 * Created by michaelplott on 9/15/16.
 */
public class Main {
    public static void main(String[] args) {
        String[] names = new String[3];
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
        }
    }

