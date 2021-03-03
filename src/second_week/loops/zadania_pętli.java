package second_week.loops;

import java.util.Scanner;

public class zadania_pętli {
    public static void main(String[] args) {
        //zadanie1
        int i;
        System.out.println("\n"+"zadanie1");
        for ( i = 0; i <= 20; i = i+2 ) {
            System.out.println("I to = " + i);
        }

        //zadamie2
        System.out.println("\n"+"zadanie2");
        for ( i = 30; i >= 0; i = i-3 ) {
            System.out.println("I to = " + i);
        }

        //zadamie3
        System.out.println("\n"+"zadanie3");
        for ( i= 1;  i< 11; i++) {
           System.out.println(i + " przejscie pętli");
           for ( int j = 1; j < 11; j++) {
               int iloczyn =i*j;
               if (iloczyn%2==0){
                   System.out.println( + i +"*" + j + " = " + iloczyn+ "\t");
               }
               else{
                   System.out.println(+ i +"*" + j + " = " +"X");
               }

           }
       }

        //zadamie4
        System.out.println("\n"+"zadanie4");

        for ( i = -40; i <= 40; i = i+1 ) {
            if (i%4==0){
                System.out.println("I to = " + i);
            }
        }

        //zadamie5
        int x=0;
        System.out.println("\n"+"przerobione zadanie 1");
        while (x != 22) {
            System.out.println(x);
            x++;
            x++;

        }
        int z=30;
        System.out.println("\n"+"przerobione zadanie 2");
        do {
            System.out.println(z);
            z--;
            z--;
            z--;
        } while ( z !=-3 );

        //zadamie*
        System.out.println("\n"+"zadanie *");
        int h=10;
        for ( i = 0; i < h; i++){
            for (int j = h; j > i; j--){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }

        //zadamie**
       System.out.println("\n"+"zadanie **");

        System.out.print("#########");
       for (i=0;i<5;i++){

           for (int j = 0; j < 10; j++){
               if (j>=1&&j<=8){
                   System.out.print(" ");
               }
               else{
                   System.out.print("#");
               }
            }
            System.out.println();
       }
        System.out.print("##########");

        //zadamie***
        System.out.println("\n"+"zadanie ***");
        System.out.print("Podaj wysokość ");
        Scanner skaner = new Scanner(System.in);
        int q = skaner.nextInt();
        for ( i = 0; i < q+1; i++){
            for (int j = q+1; j > i; j--){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }






    }
}
