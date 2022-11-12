package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Monster gargoyle;
        Monster yeti;
        int i = 0;
        Random rand = new Random();

        gargoyle = new Monster("Marco il Gargoyle",225,46);
        yeti = new Monster("Enrico lo Yeti", 500, 73);

        while(yeti.getPuntiVita()>0 && gargoyle.getPuntiVita()>0){
            i = rand.nextInt(2);
            switch (i){
                case 0:
                    yeti.subisci(gargoyle.attacco());
                    System.out.println("Marco "+ gargoyle.getMossa(rand.nextInt(3))+" ad Enrico togliendoli "+gargoyle.attacco()+" punti vita.");
                    break;
                case 1:
                    gargoyle.subisci(yeti.attacco());
                    System.out.println("Enrico "+yeti.getMossa(rand.nextInt(3))+" a marco togliendoli "+yeti.attacco()+" punti vita.");
                    break;
            }
        }

        if (yeti.getPuntiVita()<=0){
            System.out.println("Ha vinto Marco");
        }else{
            System.out.println("Ha vinto Enrico");
        }
    }
}
