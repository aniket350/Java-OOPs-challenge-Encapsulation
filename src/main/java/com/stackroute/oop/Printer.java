package com.stackroute.oop;

public class Printer {
    private int tonerLevel;
    private int noOfPages;
    private boolean isDuplexPrinter;

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        if (tonerLevel > 100) {
            System.out.println("Can not print more than 100%");
        } else {
            this.tonerLevel = tonerLevel;
        }
    }
    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public boolean isDuplexPrinter() {
        return isDuplexPrinter;
    }

    public void setDuplexPrinter(boolean duplexPrinter) {
        isDuplexPrinter = duplexPrinter;
    }
}