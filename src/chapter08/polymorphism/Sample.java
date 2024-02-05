package chapter08.polymorphism;

public class Sample {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();
        //Lion lion = new Lion();
        Predator lion = new Lion();
        zookeeper.feed(lion);

        //Tiger tiger = new Tiger();
        Predator tiger = new Tiger();
        zookeeper.feed(tiger);
    }
}

class Animal{
    String name;
}
class Lion extends Animal implements Predator{
    @Override
    public String getFood(){
        return "fish";
    }
}
class Tiger extends Animal implements Predator{
    @Override
    public String getFood(){
        return "meat";
    }
}
class Zookeeper{
    void feed(Predator predator){
        System.out.println("feed " + predator.getFood());
    }
}
