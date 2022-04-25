package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Gib bitte 3 Zahlen. Die erste Zahl: ");
        int eins = scan.nextInt();
        System.out.print("Die zweite Zhal: ");
        int zwei = scan.nextInt();
        System.out.print("Die dritte Zahl: ");
        int drei = scan.nextInt();

        if(eins > zwei && eins > drei) {
            System.out.println("Die größte Zahl ist " + eins);
        } else if(zwei > eins && zwei > drei) {
            System.out.println("Die größte Zahl ist " + zwei);
        } else {
            System.out.println("Die größte Zahl ist " + drei);
        }
    }
}
