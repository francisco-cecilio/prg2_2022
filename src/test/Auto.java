package test;

import java.util.HashMap;

public class Auto<A, B> {
    //Attribute
    private A autoTeil1;
    private B autoTeil2;

    //Konstruktor
    public Auto(A motor, B felgen) {
        this.autoTeil1 = motor;
        this.autoTeil2 = felgen;
    }

    //Methode
    public A getAutoTeil1(){return autoTeil1;}
    public B getAutoTeil2(){return autoTeil2;}

    private HashMap<Integer, Auto> autos = new HashMap<>();

}
