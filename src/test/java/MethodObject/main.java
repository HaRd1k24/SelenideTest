package MethodObject;

public class main {
    public static void main(String[] args) {
      Contact contact = new Contact("Lev",1,12345678);
      Contact contact1 = new Contact("Lev",1,12345678);

        System.out.println(contact.equals(contact1));
    }

}