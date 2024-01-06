package school.mjc.stage0.loops.finalTask;

import java.util.Scanner;

public class MultiplicationTable {
    public static void printTable(int numberTableToPrint){
        for (int i=1; i<=10; i++) {
            System.out.println(i + " x " + numberTableToPrint + " = " + i*numberTableToPrint);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number");

        int number = input.nextInt();

        if (number<0) {
            System.out.println("You entered a negative number");
        } else {
            printTable(number);
        }
    }
}
