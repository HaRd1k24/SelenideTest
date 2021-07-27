package MethodObject;

import java.util.Objects;

public class Contact {
    String name;
    int id;
    int number;

    public Contact(String name, int id, int number) {
        this.name = name;
        this.id = id;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", number=" + number +
                '}';
    }

    @Override
    public boolean equals(Object o) {
       if(this == o) return true;
       if(o == null || getClass() != o.getClass()) return false;
       Contact contact = (Contact) o;
       return id == ((Contact) o).id && number == ((Contact) o).number || ((Contact) o).name.equals(name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, number);
    }
}
