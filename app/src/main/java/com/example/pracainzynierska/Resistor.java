package com.example.pracainzynierska;

public class Resistor  {
    //public Object getpasek1; <- getPasek1 to będzie metoda a nie pole
    String pasek;
    int pasek1;
    int pasek2;
    double v;
    String o;

    //Konstruktor też nie może być pusty! W konstruktorze konfigurujesz swój obiekt :)
    public Resistor(String pasek, int pasek1, int pasek2, double v, String o) {
        this.pasek = pasek;
        this.pasek1 = pasek1;
        this.pasek2 = pasek2;
        this.v = v;
        this.o = o;
    }

    @Override
    public String toString() {
        return this.pasek; // Zwracamy to co ma się wyświetlić
    }

    // Gettery - zwracamy to o czym mówi nazwa metody

    public int getpasek1() {
        return this.pasek1;
    }

    public int getpasek2() {

        return this.pasek2;
    }

    public double getv() {
        return this.v;
    }

    public String geto() {

        return this.o;
    }

    //reszte getterów spróbuj sam napisać ;)
}