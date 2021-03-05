package second_week.arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class zadania_tablice {
    public static void main(String[] args) {
        //zadanie1
        System.out.println("\n"+"zadanie1");

       char[] tab={'q','w','e','r','t','y','u','i','o','p'};
       for (int i=0; i <tab.length; i++){
           System.out.print(tab[i]+", ");
       }
        Arrays.sort(tab);
        System.out.println("Posortowane: " + Arrays.toString(tab));

        //zadanie2
        System.out.println("\n"+"zadanie2");
        String[] tab2={"PROSZĘ","PAŃSTWA","PAWEŁ","BĘDZIE","SKAKAŁ","TUTAJ","MAMY","Z","METR","PIĘĆDZIESIĄT"};

        for (int i=0; i <tab2.length; i++){
           System.out.print(tab2[i]+", ");
       }
        Arrays.sort(tab2, Collections.reverseOrder());
        System.out.println("Sortowanie w porządku malejącym: " + Arrays.toString(tab2));

        //zadanie3
        System.out.println("\n"+"zadanie3");
        String[] tab3={"ed","edd","eddy"};
        Random rand = new Random();

        int rand_int1 = rand.nextInt(3); //od 0 do 9

        System.out.println("wylosowane imię dla psa: " + tab3[rand_int1]);

        //zadanie4
        System.out.println("\n"+"zadanie4");
        String[] tab4={"jajecznicę","omleta","ugotowane jajko"};
        String[] tab5={"pizzę","lasagnę","spagetti"};
        String[] tab6={"bułkę z szynką","bułke z serem","bułkę z chlebem"};


        int rand_int2 = rand.nextInt(3);
        int rand_int3 = rand.nextInt(3);
        int rand_int4 = rand.nextInt(3);

        System.out.println("na śniadanie zjem: " + tab4[rand_int2]+"\n"+"na obiad zjem: "+tab5[rand_int3]+"\n"+"na kolacje zjem: "+tab6[rand_int4]);

        //zadanie5
        System.out.println("\n"+"zadanie5");

        Integer[]tab7={31,5,23,564,12,536,567,8,54,89,56,7,897,456,123,9675,9476,3654,354,2};
       for (int i=0; i <tab7.length; i++){
           System.out.print(tab7[i]+", ");
       }
        Arrays.sort(tab7,10,20,Collections.reverseOrder());
        Arrays.sort(tab7,0,9);
        System.out.println("Posortowane: "+Arrays.toString(tab7));






    }
}
