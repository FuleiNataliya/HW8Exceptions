package main.java;

import main.java.exception.IntOddException;
import main.java.exception.MoreThan100Exceptions;
import main.java.exception.NullExceptions;
import main.java.exception.PalindromeExceptions;

import java.util.Optional;
import java.util.Scanner;

class Server {
    private static Scanner scanner = new Scanner(System.in);

    static void palindrome() throws PalindromeExceptions {
        System.out.println("Enter the word: ");
        String p = scanner.nextLine();

        if (p.equalsIgnoreCase(new StringBuilder(p).reverse().toString())) {
            System.out.println("It is palindrome");
        } else {
            throw new PalindromeExceptions("It is not palindrome");
        }
    }

    static void isOddNumber() throws IntOddException {
        System.out.println("Enter the integer: ");
        int n = 0;
        try {
            n = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (n % 2 == 0) {
            System.out.println("It is odd number");
        } else {
            throw new IntOddException("It is not odd number");
        }
    }

    static void checkNumber() throws MoreThan100Exceptions {
        System.out.println("Enter the integer: ");
        int a = 0;
        try {
            a = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        if (a > 100) {
            throw new MoreThan100Exceptions("More 100");
        }
    }

    static void checkNullObject() throws NullExceptions {
        System.out.println("Enter the word: ");
        String obj = scanner.nextLine();
        if (obj.equals("") || obj.equals(" ")) {
            obj = null;
        }
        Optional<String> optional = Optional.ofNullable(obj);
        System.out.println(" This is optional " + optional.orElseThrow(NullExceptions::new));
    }
}



