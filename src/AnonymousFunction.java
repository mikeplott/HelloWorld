/**
 * Created by michaelplott on 10/3/16.
 */
public class AnonymousFunction implements Runnable {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        r1.run();

        Runnable r2 = () -> {
            System.out.println("Hello from anonymous function!");
        };

        r2.run();

        AnonymousFunction r3 = new AnonymousFunction();
        r3.run();
    }

    @Override
    public void run() {
        System.out.println("Hello from separate method!");
    }

}
