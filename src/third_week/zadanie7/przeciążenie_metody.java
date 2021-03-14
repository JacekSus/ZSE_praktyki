package third_week.zadanie7;

public class przeciążenie_metody {

    public static class butelka{
        protected final int woda=69;
        protected int poziomwody=woda;

        public void dolewka(){
            int wypełnić = woda - poziomwody;
            dolewka(wypełnić);
        }
        public void dolewka(int wypełnić) {
            if (wypełnić + poziomwody> woda){
                System.out.println("nie mogę wypełnić butelki "+ wypełnić+ " litrami.");
            }
            else{
                poziomwody+=wypełnić;
                System.out.println("wypełniłem butelkę "+wypełnić+" litrami. ");
            }
        }

    }

    public static void main(String[] args) {
        butelka butelka =new butelka();
        System.out.println(butelka.poziomwody);
        butelka.dolewka();
        butelka.dolewka(10);
    }













}
