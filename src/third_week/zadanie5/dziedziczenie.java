package third_week.zadanie5;

public class dziedziczenie {

public static class Vehicle {
    public void startEngine(){
        System.out.println("Silnik robi BRRR brrr");
    }
}
public static class car extends Vehicle{
    public void startEngine2(){
        System.out.println("powiadom prowadzącego o założenie pasów");
    }

    public void startEngine3() {
        System.out.println("zamknij drzwi");
    }
}
    public static class auto extends car{
        public void startEngine3(){
        }
    }



    public static void main(String[] args) {
    car car =new car();
    auto auto =new auto();
    car.startEngine();
    car.startEngine2();
    car.startEngine3();

    }



}