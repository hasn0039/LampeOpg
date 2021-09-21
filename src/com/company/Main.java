package com.company;

public class Main {

    public static void main(String[] args) {
	Lampe stue = new Lampe(true);
        System.out.println(stue);
	Lampe køkken = new Lampe(false);
        System.out.println(køkken);
    Lampe loft = new Lampe();
        System.out.println(loft);
    loft.trykKnap();
        System.out.println(loft);
    }
}
