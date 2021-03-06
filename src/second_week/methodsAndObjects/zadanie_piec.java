package second_week.methodsAndObjects;

interface piecPiekacz {
    void pieczenieCiastek();
    void pieczenieChleba();


}

interface piecGrill {
    void grilowanieKurczaka();


}


public class zadanie_piec implements piecGrill,piecPiekacz  {

    private int czas;
    private int temperatura;
  

    @Override
    public void pieczenieCiastek() {
        czas = 10;
        temperatura = 180;
        
        wlaczPiec();
    }

    @Override
    public void pieczenieChleba() {
        czas = 69;
        temperatura = 220;
        
        wlaczPiec();
    }

    @Override
    public void grilowanieKurczaka() {
        czas = 102;
        temperatura = 420;
        
        wlaczPiec();
    }

   
    private void wlaczPiec() {
        System.out.println("Wlaczamy piec " +
                " ustawiamy temperature na: " + temperatura+"°C"
                + " i czas  na: " + czas + " minut");
    }

    public static void main(String[] args) {
        zadanie_piec zadanie_piec = new zadanie_piec();

        piecPiekacz piecPiekacz  = zadanie_piec;
        piecGrill piecGrill = zadanie_piec;

        piecPiekacz.pieczenieCiastek();
        piecPiekacz.pieczenieChleba();
        piecGrill.grilowanieKurczaka();
       
    }
}