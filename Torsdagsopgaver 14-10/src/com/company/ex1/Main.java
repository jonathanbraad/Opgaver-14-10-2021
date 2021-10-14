package com.company.ex1;

public class Main {

    public static void main(String[] args) {
        //TODO:
        // lav en ny hund
        Dog myDog = new Dog("woodie", true);
        // sæt en ejer
        myDog.setOwner("Henning");
        // TODO: tilføj to hvalpe når hundeklassen er klar til hvalpe
        myDog.addOffSpring("woodiesnoopie");
        myDog.addOffSpring("woodiesfido");

        // print alle hvalpe
        for (String myD: myDog.offSpringList) {
            System.out.println(myD);
        }

        // print ejeren
        System.out.println("min hund er ejet af " + myDog.getOwner());
        // TODO: fodr hunden når hundeklassen er modificeret så den kan fodres
        String resString = myDog.feedDog();
        System.out.println(resString);
    }

}