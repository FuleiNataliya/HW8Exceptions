package main.java;

import main.java.exception.IntOddException;
import main.java.exception.MoreThan100Exceptions;
import main.java.exception.NullExceptions;
import main.java.exception.PalindromeExceptions;

public class Main {
    public static void main(String[] args) {

        try {
            Server.palindrome();
        } catch (PalindromeExceptions e) {
            e.printStackTrace();
        }
        try {
            Server.isOddNumber();
        } catch (IntOddException e) {
            e.printStackTrace();
        }
        try {
            Server.checkNumber();
        } catch (MoreThan100Exceptions e) {
            e.printStackTrace();
        }
        try {
            Server.checkNullObject();
        } catch (NullExceptions e) {
            e.printStackTrace();
        }
    }
}
