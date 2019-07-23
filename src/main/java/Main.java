package main.java;

import main.java.exception.IntOddException;
import main.java.exception.MoreThan100Exceptions;
import main.java.exception.NullExceptions;
import main.java.exception.PalindromeExceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the word: ");
        Scanner scanner = new Scanner(System.in);
        String obj = scanner.nextLine();
        String o = "";
        if (obj.equals("")||obj.equals(" ")) {
            o = null;
        }
        System.out.println("Enter the number: ");
        Integer i = Integer.parseInt(scanner.nextLine());
        scanner.close();
        try {
            Server.palindrome(obj);
        } catch (PalindromeExceptions e) {
            e.printStackTrace();
        }
        try {
            Server.oddNumber(i);
        } catch (IntOddException e) {
            e.printStackTrace();
        }
        try {
            Server.number(i);
        } catch (MoreThan100Exceptions e) {
            e.printStackTrace();
        }
        try {
            Server.object(o);
        } catch (NullExceptions e) {
            e.printStackTrace();
        }
    }
}
