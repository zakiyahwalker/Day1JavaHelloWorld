package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("Hi, who are you?");
        String n = input.nextLine();
        System.out.println("Hello, " + n + " nice to meet you!");
        System.out.println("How long have you been at Howard?");
        int y = input.nextInt(); //years at Howard
        System.out.println("Awesome! Congrats for being at Howard " + y + " years!");
        System.out.println("What is your GPA?");
        float g = input.nextFloat();
        System.out.println("Great job earning a " + g + " GPA!");

    }
}
