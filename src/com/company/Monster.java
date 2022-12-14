package com.company;

public class Monster {
    private String nome;
    private int puntiVita;

    private Weapon arma = new Weapon(1,"il pugno");


    private String [] mosse={"usa il pugno su ","sputa in un occhio a ","morde l'orecchio a ","lancia un occhiataccia a"};
    private int [] danni ={1,15,40,70};


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

    public void raccogliArma(Weapon newArma){
        arma.setDanni(newArma.getDanni());
        arma.setNomeArma(newArma.getNomeArma());
        mosse[0]="usa "+arma.getNomeArma()+" su ";
        danni[0]= arma.getDanni();
    }

    public void perdiArma(){
        arma.setNomeArma("il pugno");
        arma.setDanni(1);
        mosse[0]="usa "+arma.getNomeArma()+" su ";
        danni[0]= arma.getDanni();
    }

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
