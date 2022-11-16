package com.company;

public class Weapon {
    private int danni;
    private String nomeArma;

    public Weapon (int danni, String nomeArma){
        this.danni=danni;
        this.nomeArma=nomeArma;
    }

    public int getDanni() {
        return danni;
    }

    public String getNomeArma() {
        return nomeArma;
    }
}
