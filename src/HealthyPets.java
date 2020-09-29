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


    HealthyPets() {

        Play();


    }

    public void Play() {



        System.out.println();

        Scanner in = new Scanner(System.in);
        String svar;
        Djur sixten = new Hund("Sixten", 5000);
        Djur dogge = new Hund("Dogge", 10000);
        Djur venus = new Katt("Venus", 5000);
        Djur ove = new Katt("Ove", 3000);
        Djur hypno = new Orm("Hypno", 1000);


        System.out.println("Vilket djur ska få mat?");
        svar = in.nextLine();
        svar.toLowerCase();
        if (svar.equals("sixten")) {
            System.out.println(sixten.portion());
        } else if (svar.equals("dogge")) {
            System.out.println(dogge.portion());
        } else if (svar.equals("venus")) {
            System.out.println(venus.portion());
        } else if (svar.equals("ove")) {
            System.out.println(ove.portion());
        } else if (svar.equals("hypno")) {
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
