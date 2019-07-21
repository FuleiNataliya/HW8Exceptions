package main.java;

import main.java.exception.IntOddException;
import main.java.exception.MoreThan100Exceptions;
import main.java.exception.NullExceptions;
import main.java.exception.PalindromeExceptions;

import java.util.Optional;


public class Server {

    static void palindrome (String p) throws PalindromeExceptions {
        if (p.equals(new StringBuilder(p).reverse().toString())) {
            System.out.println("It is palindrome");
        } else {
            throw new PalindromeExceptions("It is not palindrome");
        }
    }

    static void oddNumber(Integer n) throws IntOddException {
        if (n % 2 == 0) {
            System.out.println("It is number");
        } else {
            throw new IntOddException("It is not number");
        }
    }

    static void number(Integer a) throws MoreThan100Exceptions {
        if (a > 100) {
            throw new MoreThan100Exceptions("More 100");
        }
    }

    static void object(Object o) throws NullExceptions {
        Optional<Object> optional = Optional.ofNullable(o);
        System.out.println(" This is optional " + optional.orElseThrow(NullExceptions::new));
        }
    }



