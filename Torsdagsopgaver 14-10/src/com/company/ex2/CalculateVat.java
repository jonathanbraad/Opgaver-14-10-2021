package com.company.ex2;

public class CalculateVat {

    final static int PRCVAT = 25;
    final static String MSG = "MOMS";
    final static String CURRENCY = "Kr";
    public static double doVAT(double number) {
        double VAT = number / 100 * PRCVAT;
        return VAT;
    }

}