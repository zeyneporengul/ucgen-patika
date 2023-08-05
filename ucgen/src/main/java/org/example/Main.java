package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int counter;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir değer giriniz: ");
        counter = input.nextInt();

        for(int i=counter; i>=0; i--){
            for(int k=1; k<=counter-i; k++){
                System.out.print(" ");
            }for(int p=1; p<=(2*i)-1; p++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}