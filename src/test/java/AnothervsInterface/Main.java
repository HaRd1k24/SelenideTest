package AnothervsInterface;

public class Main extends MyClass1 implements MyInterface,MyInterface1 {
    public static void main(String[] args) {
    new Main().yourNameAge();
        System.out.println(MyInterface.age);
        System.out.println(MyInterface1.age);
    }

    @Override
    void Bye() {
        System.out.println("Bye");
    }

    @Override
    public void yourSay() {
        System.out.println("Yes");
    }

    @Override
    public void yourNameAge() {
        MyInterface.super.yourNameAge();
    }
}

abstract class MyClass1{
    String s;
    int a;

    void hello(){
        System.out.println("Hello");
    }

    abstract void Bye();
}

interface MyInterface{
    String str = "qwe";
    int age = 15;

    void yourSay();

    default void yourNameAge(){
        System.out.println("Lev" + age);
    }
}

interface MyInterface1{
    String str = "qwe";
    int age = 10;

    void yourSay();

    default void yourNameAge(){
        System.out.println("Lev" + age);
    }
}