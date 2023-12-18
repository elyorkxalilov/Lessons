package Assistent;

import java.util.Scanner;

public class Main_Assistent {
    public static void main(String[] args) {

        Assistent assistent = new Assistent();
        System.out.println(assistent.addTwoNumber(3, 5));
        System.out.println(assistent.pow(3, 5));
        System.out.println(assistent.abs(-8));

        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        System.out.println(assistent.getWholeSection(n));
    }
}
