package com.company;

public class Monster {
    private String nome;
    private int puntiVita;

    private String [] mosse={"sputa in un occhio","morde l'orecchio","lancia un occhiataccia"};
    private int [] danni ={15,40,70};


    public Monster (String nome, int puntiVita){
        this.nome=nome;
        this.puntiVita=puntiVita;
    }

    //per subire danni
    public void subisci(int danni){
        puntiVita-=danni;
    };

    //ritorna l'attributo danno
    public int attacco(int i){
        return danni[i];
    };

    public int getPuntiVita() {
        return puntiVita;
    }

    public String getMossa(int i){
        return mosse[i];
    }

    public String getNome() {
        return nome;
    }

    //tostring classico
    public String toString(){
        String str ="";
        str="Nome: "+nome;
        str+="\nPV: "+puntiVita;

        return str;
    };
}
