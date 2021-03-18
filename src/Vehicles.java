public class Vehicles {
    void details(){
        System.out.println("Car starts with key");
    }
}
 class Car extends Vehicles{
    void cost(){
        System.out.println("Scross costs Rs.150000");
    }
}
class Downcast{
    public static void main(String args[]){
        Vehicles vh=new Car();
        vh.details();
        Car c=(Car)vh;
        c.cost();
    }
}
