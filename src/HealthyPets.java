import java.util.Random;
import java.util.Scanner;

/**
 * Created by Daniel Bojic
 * Date: 2020-09-27
 * Time: 15:47
 * Project: 1
 * Copyright: MIT
 */
public class HealthyPets {
    public enum Namn{
        SIXTEN("Sixten",5000), DOGGE ("Dogge", 10000),
        VENUS("Venus", 5000), OVE("Ove", 3000), HYPNO("Hypno", 1000);

        public final String djurNamn;
        public final int djurVikt;

        public String getDjurNamn() {
            return djurNamn;
        }

        public int getDjurVikt() {
            return djurVikt;
        }

        Namn(String namn, int vikt){
            this.djurNamn = namn;
            this.djurVikt =vikt;
        }
    }

    HealthyPets() {

        Play();


    }

    public void Play() {

        Scanner in = new Scanner(System.in);
        String svar = null;
        String svarCase;

        System.out.println("Vilket djur ska få mat?");
        svarCase = in.nextLine();
        svar = svarCase.toLowerCase();
        if (svar.equals("sixten")) {
            Djur sixten = new Hund(Namn.SIXTEN.getDjurNamn(), Namn.SIXTEN.getDjurVikt());
            System.out.println(sixten.portion());
        } else if (svar.equals("dogge")) {
            Djur dogge = new Hund(Namn.DOGGE.getDjurNamn(), Namn.DOGGE.getDjurVikt());
            System.out.println(dogge.portion());
        } else if (svar.equals("venus")) {
            Djur venus = new Katt(Namn.VENUS.getDjurNamn(), Namn.VENUS.getDjurVikt());
            System.out.println(venus.portion());
        } else if (svar.equals("ove")) {
            Djur ove = new Katt(Namn.OVE.getDjurNamn(), Namn.OVE.getDjurVikt());
            System.out.println(ove.portion());
        } else if (svar.equals("hypno")) {
            Djur hypno = new Orm(Namn.HYPNO.getDjurNamn(), Namn.HYPNO.getDjurVikt());
            System.out.println(hypno.portion());
        } else {
            Radbrytning();
            System.out.println("Ogiltigt svar!");
            System.out.println("Försök igen!");
            Radbrytning();
            Play();
        }


    }

    public void Radbrytning() {
        System.out.println("---------------------------------");
    }
}
