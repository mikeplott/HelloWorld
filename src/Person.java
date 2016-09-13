/**
 * Created by michaelplott on 9/12/16.
 */
public class Person {
    String name;
    int age;
    boolean isAlive;


    String getName() {
        return name;
    }

    void setName(String newName) {
        if (newName.contains(" ")) {
            name = newName;
        }

    }

    int getAge() {
        return age;
    }

    void setAge(int newAge) {
        if (newAge >= 18) {
            age = newAge;
        }
    }

    boolean getIsAlive() {
        return isAlive;
    }

    void setIsAlive(boolean newIsAlive) {
        if (age > 100) {
            isAlive = false;
        }
        else {
            isAlive = newIsAlive;

        }
    }
}
