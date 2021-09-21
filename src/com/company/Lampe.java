package com.company;

public class Lampe {
    //fields
    boolean tilstand;
    String status;

    //konstruktor
    public Lampe(boolean tilstand){
        this.tilstand = tilstand;
    }
    public Lampe(){//Her har jeg sagt programmet til at lyset er slukket
        // hvis der ikke er nogen parametere
        // så er den default false
        this.tilstand = false;
    }
//her har jeg lavet min trykPåKontakt
    public boolean trykKnap(){
        boolean tændt = tilstand = !tilstand;
        return tændt;
    }
//toString metode
    public String toString(){
        if(this.tilstand){
            status = "lys tændt";
        } else{
            status = "lys slukket";
        }
        return status;
    }

}
