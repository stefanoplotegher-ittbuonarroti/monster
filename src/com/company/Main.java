package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Monster gargoyle;
        Monster yeti;
        int i;
        int k;
        Random rand = new Random();
        int attacco = 0;
        String [] arrayDeiNomi={"la potente Excalibur","un M16","la Daga del Brigante", "la un po' meno potente Excalibur","l'Arco dei Mille Sospiri"," Primiera e Ori","la Frusta della Giustizia","il Fioretto di Fuoco","la un po' più potente Excalibur","la Bolletta del Gas"};
        int [] arrayDeiDanni={50,10,23,15,28,41,30,45,67,90};

        gargoyle = new Monster("Marco il Gargoyle",500);
        yeti = new Monster("Enrico lo Yeti", 500);



        while(yeti.getPuntiVita()>0 && gargoyle.getPuntiVita()>0){
            i = rand.nextInt(4);
            switch (i){
                case 0:
                    attacco= rand.nextInt(3);
                    yeti.subisci(gargoyle.attacco(attacco));
                    System.out.println("\n- "+gargoyle.getNome()+" "+gargoyle.getMossa(attacco)+yeti.getNome()+" togliendoli "+gargoyle.attacco(attacco)+" punti vita.");
                    break;
                case 1:
                    gargoyle.subisci(yeti.attacco(attacco));
                    System.out.println("\n- "+yeti.getNome()+" "+yeti.getMossa(attacco)+gargoyle.getNome()+" togliendoli "+yeti.attacco(attacco)+" punti vita.");
                    break;
                case 2:
                    k = rand.nextInt(2);
                    int indice = rand.nextInt(10);
                    Weapon arma = new Weapon(arrayDeiDanni[indice],arrayDeiNomi[indice]);
                    switch (k) {
                        case 0:
                            gargoyle.raccogliArma(arma);
                            break;
                        case 1:
                            yeti.raccogliArma(arma);
                            break;
                    }
                    break;
                case 3:
                    k = rand.nextInt(2);
                    switch (k) {
                        case 0:
                            gargoyle.perdiArma();
                            break;
                        case 1:
                            yeti.perdiArma();
                            break;
                    }
                    break;
            }
        }

        if (yeti.getPuntiVita()<=0){
            System.out.println("\nHa vinto "+gargoyle.getNome());
        }else{
            System.out.println("\nHa vinto "+yeti.getNome());
        }
    }
}
