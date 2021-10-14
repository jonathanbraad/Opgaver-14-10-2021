package com.company.ex2;

public class Controller {

    final static int PRCVAT = 25;
    final static String MSG = "MOMS";
    final static String CURRENCY = "Kr";

    public static void runController() {
        Dialog dialog1 = new Dialog();
        CalculateVat vat1 = new CalculateVat();
        View view1 = new View();
        double userIn = dialog1.doDiag();
        double moms = vat1.doVAT(userIn);
        view1.doView(moms,MSG);
}
}
