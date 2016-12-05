package com.viet;

import com.viet.utilities.StringUtilities;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        boolean hasNext = scanner.hasNextLine();
        if(hasNext){
            String input = scanner.nextLine();
            String reverse = StringUtilities.reverse(input);
            System.out.println(reverse);
        }
    }
}
