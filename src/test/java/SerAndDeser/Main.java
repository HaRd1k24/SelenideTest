package SerAndDeser;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) {
        Person[] personMassive = {new Person("Lev", 131),
                new Person("ABC", 25),
                new Person("Tom", 27)};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){
            oos.writeObject(personMassive);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
