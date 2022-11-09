package com.company;

public class Monster {
    private String nome;
    private int puntiVita;
    private int danno;


    public Monster (String nome, int puntiVita, int danno){
        this.nome=nome;
        this.puntiVita=puntiVita;
        this.danno=danno;
    }

    public void subisci(int danni){};

    public int attacco(){};

    public String toString(){};
}
