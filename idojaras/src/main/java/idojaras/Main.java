package idojaras;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);

    //1.feladat
    //Bekérünk egy számot hogy hny fok van
    System.out.println("Hany fok van ma? ");
    int idojaras = Integer.parseInt(in.nextLine());

    //Kiíratjuk hogy hány fok van
    System.out.println("Az idojaras " + idojaras + "C°");
    if (idojaras < 0) {
        System.out.println("Fagypont alatt van");
    } else if (idojaras >= 0 && idojaras < 30) {
        System.out.println("Atalogos");
    } else if (idojaras > 30) {
        System.out.println("Tul meleg van");
    }

    //2.feladat
    System.out.println("Hany masodperccel halottad a dorgest a villamlás utan?");
    int masodperc = -1;
    //Másodperc megadasa, negatív szám esetén újra bekéri egy számot
    while(masodperc < 0) {
       masodperc = Integer.parseInt(in.nextLine());
        if (masodperc < 0) {
            System.out.println("Pozitiv szamot daj meg!");
        }
    }
    int sebesseg = 300; //m/s
    int tavolsag = sebesseg * masodperc;
    System.out.println("A villamlas tavolsaga " + tavolsag + " meter");
    


    

    
    
}
}