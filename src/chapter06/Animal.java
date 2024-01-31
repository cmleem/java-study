package chapter06;

import java.util.ArrayList;

public class Animal {
    String name;
    int number;
    String condition;
    String[] aliasList = {"sun", "moon", "star"};

    public Animal(String name, int number, String condition) {
        this.name = name;
        this.number = number;
        this.condition = condition;
    }

    void setName(String name, int num, String condition) {
        String returnSentence = String.format("%s %s are(is) added in %s condition.", num, name, condition);
        System.out.println(returnSentence);
    }

    void sleep(){
        System.out.println(this.number +" "+ this.name+" are(is) sleeping.");
    }
    String showCondition(){
        return this.condition;
    }
    String response(String name, String condition){
        if(condition.equals("bad")) System.out.println("Take them to the vet.");
        return this.condition;
    }
    int showNum(){
        return this.number;
    }
    void getName(String name){
        for(String alias : aliasList){
            System.out.println("One of them is named "+alias);
        }
    }

    public static void main(String[] args) {
        Animal mammal = new Animal("lion", 5, "good");
        mammal.setName("monkey", 3, "normal");
        mammal.getName("monkey");
        mammal.sleep();

        Animal bird = new Animal("parrot", 9, "normal");
        bird.setName("eagle", 12, "normal");
        System.out.println("Number of "+bird.name+": "+ bird.showNum());

        Animal fish = new Animal("whale", 10, "good");
        fish.setName("salmon", 20, "bad");
        System.out.println("Condition of "+fish.name+": " +fish.response("Salmon","bad"));
    }
}
