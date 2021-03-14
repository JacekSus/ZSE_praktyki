package third_week.zadanie6;

public class przeciążenie_metody {
    public static class drukarka{
        public void startDruk(){
            System.out.println("drukarka robi BRRR BRRR");
        }
    }
    public static class druk extends drukarka{
        public void startDruk(){
            super.startDruk();
            System.out.println("powiadom o barku papieru");
        }
    }

    public static void main(String[] args) {
        druk druk =new druk();
        druk.startDruk();
    }













}
