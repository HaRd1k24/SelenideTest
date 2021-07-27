package AnnotaciiOverloadRide;

public interface Iimpl {
    public void say();
    public void fly();
}

abstract class bird implements Iimpl{
    @Override
    public void say(){
        System.out.println("Издаем звуки");
    }

    @Override
    public void fly(){
        System.out.println("Умеет летать");
    }
}
