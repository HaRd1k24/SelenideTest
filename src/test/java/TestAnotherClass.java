public class TestAnotherClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
       // animal.eat();

        Animal animal1 = new Animal(){
            public void eat(){
                System.out.println("AnotherClass is eating...");
            }
        };

    }
}

class Animal{
    public void eat(){
        System.out.println("Animal is eating...");
    }
}
