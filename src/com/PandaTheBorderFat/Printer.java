package com.PandaTheBorderFat;

public class Printer {
    private int tonerLevel = 100;
    private int numberOfPages;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int numberOfPages, boolean duplexPrinter) {
        if(tonerLevel >= 0 && tonerLevel <= 100)
            this.tonerLevel = tonerLevel;
        this.numberOfPages = numberOfPages;
        this.duplexPrinter = duplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
