import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import jodd.json.meta.JSON;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by michaelplott on 9/21/16.
 */
public class ReadWriteJson {
    public static void main(String[] args) throws IOException {
        Person p = new Person("Mike Plott", 28, true);
        File f = new File("person.json");

        // write json
        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.serialize(p);
        System.out.println(json);
        FileWriter fw = new FileWriter(f);
        fw.write(json);
        fw.close();

        // read json
        FileReader fr = new FileReader(f);
        int fileSize = (int) f.length();
        char[] contents = new char[fileSize];
        fr.read(contents, 0, fileSize);
        JsonParser parser = new JsonParser();
        Person p2 = parser.parse(contents, Person.class);
        System.out.println(p2);
//        String.valueOf(contents);
//        System.out.println();
//        System.out.println(contents);
    }
}
