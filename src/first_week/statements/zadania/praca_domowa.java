package first_week.statements.zadania;

import java.util.Scanner;


public class praca_domowa {
    public static void main(String[] args) {
        System.out.println("\n"+"zadanie1");
        //zadanie1
        Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj liczbe: ");
        int liczba = skaner.nextInt();

        if (liczba == 0) {
            System.out.println("liczba jest zerem");
        } else {
            if (liczba <= 0) {
                System.out.println("liczba jest mniejsza od zera");
            } else {
                System.out.println("liczba jest większa od zera");
            }
        }
        System.out.println("\n"+"zadanie2");
        //zadanie2
        System.out.print("Podaj liczbe1: ");
        int liczba1 = skaner.nextInt();
        System.out.print("Podaj liczbe2: ");
        int liczba2 = skaner.nextInt();
        System.out.print("Podaj liczbe3: ");
        int liczba3 = skaner.nextInt();
        if(liczba1==liczba2&&liczba2==liczba3){
            System.out.println("liczby są równe");
            System.out.println("libcza1 równa się:"+ liczba1);
            System.out.println("libcza2 równa się:"+ liczba2);
            System.out.println("libcza3 równa się:"+ liczba3);
        }
        else{
            if (liczba1>liczba2){
                if (liczba1>liczba3){
                    System.out.println("liczba1 jest największa");
                    System.out.println("libcza1 równa się:"+ liczba1);
                }
                else
                if (liczba1==liczba3){
                    System.out.println("liczba1 i lczba3 są największe ");
                    System.out.println("libcza1 równa się:"+ liczba1);
                    System.out.println("libcza3 równa się:"+ liczba3);
                }
            }
            else{
                if (liczba1==liczba2){
                    System.out.println("liczba1 i liczba2 są największe");
                    System.out.println("libcza1 równa się:"+ liczba1);
                    System.out.println("libcza2 równa się:"+ liczba2);

                }
                else{
                    if (liczba2>liczba3){
                        System.out.println("liczba2 jest największa");
                        System.out.println("libcza2 równa się:"+ liczba2);
                    }
                    else{
                        if (liczba2==liczba3){
                            System.out.println("liczba2 i liczba3 są największe");
                            System.out.println("libcza2 równa się:"+ liczba2);
                            System.out.println("libcza3 równa się:"+ liczba3);
                        }
                        else{
                            System.out.println("liczba3 jest najwieksza");
                            System.out.println("libcza3 równa się:"+ liczba3);
                        }
                    }
                }
            }

        }
        System.out.println("\n"+"zadanie3");
        //zadanie3
        System.out.print("Podaj login: ");
        String login = skaner.next();
        System.out.print("Podaj hasło: ");
        String haslo = skaner.next();
        if(login.equals("jan")){
            if (haslo.equals("kowalski")){
                System.out.println("zalogowano");
            }
            else{
                System.out.println("nie zalogowano");
            }

        }
        else{
            System.out.println("nie zalogowano");
        }
        System.out.println("\n"+"zadanie4");
        //zadanie4
        System.out.print("Podaj pierwszą liczbę: ");
        int liczbe1 = skaner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int liczbe2 = skaner.nextInt();
        System.out.print("Podaj trzecią liczbe: ");
        int liczbe3 = skaner.nextInt();
        if (liczbe1>liczbe2){
            if (liczbe2>liczbe3){
                System.out.println("kolejnośc malejąca");
            }
            else{
                System.out.println("brak kolejności");
            }
        }
        else{
            if (liczbe1<liczbe2){
                if (liczbe2<liczbe3){
                    System.out.println("kolejność rosnąca");
                }
                else{
                    System.out.println("brak kolejności");
                }
            }
            else{
                System.out.println("brak kolejności");
            }
        }
        System.out.println("\n"+"zadanie5");
        //zadanie5
        System.out.print("Podaj pierwszą liczbę: ");
        double a = skaner.nextDouble();
        System.out.print("Podaj drugą liczbę: ");
        double b = skaner.nextDouble();
        System.out.print("co chcesz zrobić (+, -, *, /): ");
        String y = skaner.next();


        switch (y) {
            case "+" -> {
                double suma = a + b;
                System.out.println(suma);
            }
            case "-" -> {
                double wynik = a - b;
                System.out.println(wynik);
            }
            case "*" -> {
                double iloczyn = a * b;
                System.out.println(iloczyn);
            }
            case "/" -> {
                double iloraz = a / b;
                System.out.println(iloraz);
            }
            default -> System.out.println("Nie wybrano poprawnej opcji.");
        }








    }
}

