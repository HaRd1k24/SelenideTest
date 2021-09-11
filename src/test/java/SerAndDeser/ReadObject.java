package SerAndDeser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("people.bin"))) {
            Person[] person = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(person));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}

