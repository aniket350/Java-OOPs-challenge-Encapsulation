package com.stackroute.oop;

public class Encapsulation {

    public static void main(String[] args){

        Printer prntr = new Printer();
        prntr.setTonerLevel(10);
        prntr.setNoOfPages(20);
        prntr.setTonerLevel(110);
        prntr.setDuplexPrinter(true);
        System.out.println(prntr.getTonerLevel());
        System.out.println(prntr.getNoOfPages());
    }
}