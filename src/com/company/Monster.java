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

    //per subire danni
    public void subisci(int danni){};

    //ritorna l'attributo danno
    public int attacco(){};

    //tostring classico
    public String toString(){};
}
