package org.example;

public class HelloApp {

    public static void main(String[] args) {

        // Case 1: No arguments
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {

            String names = "";

            // Append all names with comma
            for (int i = 0; i < args.length; i++) {
                names += args[i] + ", ";
            }

            // Remove last ", " using substring
            names = names.substring(0, names.length() - 2);

            System.out.println("Hello, " + names + "!");
        }
    }
}