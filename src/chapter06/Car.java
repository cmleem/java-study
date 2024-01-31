public class Car {
    String company = "a";
    int speed = 100;
    String sw = "Samsung";
    String sheet;
    int seat = 4;

    String model;
    public Car(String company, int speed){
        this.company = company;
        this.speed = speed;
        this.sw = sw;
    }
    public Car(int speed){
        this.speed += 1000;
    }
    void printSpec(){
        //System.out.println("company: "+company+" speed: "+speed+" sw: "+sw+" sheet: "+sheet+" seat: "+seat);
        String sentence = String.format("company: %s, speed: %s, sw: %s, seat: %s", company, speed, sw, seat);
        System.out.println(sentence);
    }
    void changeSoftware(String sw){
        this.sw = sw;
    }
    void  changeSoftware(){
        this.sw = "LG";
    }
    void changeSheet(){
        this.sheet = "cool sheet";
    }
    void seatNumber(int seat){
        this.seat = seat;
    }

    void setModel(String model){
        this.model = model;
    }

    int getSpeed(){
        return speed;
    }

    public static void main(String args[]) {
        Car sonata1 = new Car("hyundai", 100);
        sonata1.changeSoftware("Apple");
        sonata1.printSpec();


        Car sonata2 = new Car("kia", 200);
        sonata2.changeSheet();
        sonata2.changeSoftware();
        sonata2.printSpec();

        Car Lamborghini = new Car(100);
        Lamborghini.seatNumber(2);
        Lamborghini.printSpec();
        Lamborghini.setModel("Urus");
    }
}

