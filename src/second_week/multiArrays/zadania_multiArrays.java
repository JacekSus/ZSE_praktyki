package second_week.multiArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class zadania_multiArrays {
    public static void main(String[] args) {
        //zadanie1
        System.out.println("\n"+"zadanie1");
        int[][] arr=new int[5][5];
        int value=0;
        for (int i=0;i<5;i++){
            for (int j=0;j<5;j++){
                arr[i][i]=value;
                value=value+5;

                System.out.print(arr[i][i]+"\t");
            }
            System.out.println();

        }
        //zadanie2
        System.out.println("\n"+"zadanie2");
        Random generator = new Random();

        int[][][][] tab = new int[3][3][3][3];
        int value1 = (generator.nextInt(100));
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                for (int m = 0; m < 3; m++) {
                    for (int n = 0; n < 3; n++) {
                        tab[i][j][m][n] = value1;
                        value1 = (generator.nextInt(100));
                        System.out.print("[" + i + "][" + j + "]["+m+"][" + n + "] = " + tab[i][j][m][n] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
        //zadanie3
        System.out.println("\n"+"zadanie3");
        int[][][][][] tab2 = new int[2][2][2][2][2];
        int value2 =(generator.nextInt(110)+10);
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                for (int z =0; z <2; z++){
                for (int m = 0; m < 2; m++) {
                    for (int n = 0; n < 2; n++) {
                        tab2[i][j][z][m][n] = value2;
                        value2 = (generator.nextInt(110)+10);
                        System.out.print("[" + i + "][" + j + "]["+z+"]["+m+"][" + n + "] = " + tab2[i][j][z][m][n] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }
        //zadanie4
        System.out.println("\n"+"zadanie4");
        for (int i=0;i<2;i++){
            int[][] tab3=new int[2][2];
            int[][] tab4=new int[2][2];
            int[][] tab5=new int[2][2];
            int value3=(generator.nextInt(100));
            int value4=(generator.nextInt(100));
            for ( i=0;i<2;i++){
                for (int j=0;j<2;j++){
                    tab3[i][i]=value3;
                    tab4[i][i]=value4;
                    value3=(generator.nextInt(100));
                    value4=(generator.nextInt(100));
                    System.out.println();
                    System.out.println("pierwsza tablica: "+tab3[i][i]+"\t");
                    System.out.print("druga tablica: "+tab4[i][i]+"\n");
                    tab5[i][i]=tab4[i][i]+tab3[i][i];
                    System.out.print("dadane tablice: "+tab5[i][i]+"\t");
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println();
        }

        //zadanie do listy1
        System.out.println("\n"+"zadanie do listy1");


        System.out.println("1.stworzenie listy");
        ArrayList<String> lista_odmian_cebuli = new ArrayList<>();
        lista_odmian_cebuli.add("cebula zwyczajna");
        lista_odmian_cebuli.add("cebula perłowa");
        lista_odmian_cebuli.add("cebula kartoflanka");
        lista_odmian_cebuli.add("cebula wielopiętrowa");
        System.out.println(lista_odmian_cebuli);


        System.out.println("2.1 dodanie nowego obiektu");
        lista_odmian_cebuli.add( "cebula biała");
        System.out.println(lista_odmian_cebuli);
        System.out.println("2.2 dodanie nowego obiektu na podany indeks");
        lista_odmian_cebuli.add(5, "cebula czerwona");
        System.out.println(lista_odmian_cebuli);


        System.out.println("3.1 usuwanie obiektu z listy po nazwie");
        lista_odmian_cebuli.remove("cebula perłowa");
        System.out.println(lista_odmian_cebuli);
        System.out.println("3.2 usuwanie obiektu po indeksie");
        lista_odmian_cebuli.remove(1);
        System.out.println(lista_odmian_cebuli);


        System.out.println("4.nadpisywanie obiektu");
        lista_odmian_cebuli.set(0, "cebula cukrowa");
        System.out.println(lista_odmian_cebuli);


        System.out.println("5.sortowanie listy");
        Collections.sort(lista_odmian_cebuli);
        System.out.println(lista_odmian_cebuli);


        System.out.println("6.czyszczenie listy");
        lista_odmian_cebuli.clear();
        System.out.println(lista_odmian_cebuli);


    }
}
