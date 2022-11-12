package com.company;

public class Monster {
    private String nome;
    private int puntiVita;
    private int danno;

    private String [] mosse={"sputa in un occhio","morde l'orecchio","lancia un occhiataccia"};


    public Monster (String nome, int puntiVita, int danno){
        this.nome=nome;
        this.puntiVita=puntiVita;
        this.danno=danno;
    }

    //per subire danni
    public void subisci(int danni){
        puntiVita-=danni;
    };

    //ritorna l'attributo danno
    public int attacco(){
        return danno;
    };

    public int getPuntiVita() {
        return puntiVita;
    }

    public String getMossa(int i){
        return mosse[i];
    }

    //tostring classico
    public String toString(){
        String str ="";
        str="Nome: "+nome;
        str+="\nPV: "+puntiVita;

        return str;
    };
}
