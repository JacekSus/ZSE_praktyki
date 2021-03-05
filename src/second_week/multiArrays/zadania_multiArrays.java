package second_week.multiArrays;

import java.util.Random;

public class zadania_multiArrays {
    public static void main(String[] args) {
//        //zadanie1
//        System.out.println("\n"+"zadanie1");
//        int[][] arr=new int[5][5];
//        int value=0;
//        for (int i=0;i<5;i++){
//            for (int j=0;j<5;j++){
//                arr[i][i]=value;
//                value=value+5;
//
//                System.out.print(arr[i][i]+"\t");
//            }
//            System.out.println();
//
//        }
//        //zadanie2
//        System.out.println("\n"+"zadanie2");
        Random generator = new Random();
//
//        int[][][][] tab = new int[3][3][3][3];
//        int value2 = (generator.nextInt(100));
//        for (int i = 0; i < 3; i++){
//            for (int j = 0; j < 3; j++){
//                for (int m = 0; m < 3; m++) {
//                    for (int n = 0; n < 3; n++) {
//                        tab[i][j][m][n] = value2;
//                        value2 = (generator.nextInt(100));
//                        System.out.print("[" + i + "][" + j + "]["+m+"][" + n + "] = " + tab[i][j][m][n] + "\t");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
//        //zadanie3
//        System.out.println("\n"+"zadanie3");
//        int[][][][][] tab2 = new int[2][2][2][2][2];
//        int value3 =(generator.nextInt(110)+10);
//        for (int i = 0; i < 2; i++){
//            for (int j = 0; j < 2; j++){
//                for (int z =0; z <2; z++){
//                for (int m = 0; m < 2; m++) {
//                    for (int n = 0; n < 2; n++) {
//                        tab2[i][j][z][m][n] = value3;
//                        value3 = (generator.nextInt(110)+10);
//                        System.out.print("[" + i + "][" + j + "]["+z+"]["+m+"][" + n + "] = " + tab2[i][j][z][m][n] + "\t");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }
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
                    System.out.print(tab3[i][i]+"\t");
                    System.out.print(tab4[i][i]+"\t");
                    tab5[i][i]=tab4[i][i]+tab3[i][i];
                    System.out.print(tab5[i][i]+"\t");
                }
                System.out.println();

            }
            System.out.println();



        }












    }
}
