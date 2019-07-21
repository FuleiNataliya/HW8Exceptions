package main.java.exception;

import java.util.function.Supplier;

public class NullExceptions extends Exception {
    public NullExceptions() {
        super("This null");
    }
}
