/**
 * Created by Daniel Bojic
 * Date: 2020-09-25
 * Time: 09:11
 * Project: 1
 * Copyright: MIT
 */
public class Djur implements DjurInterface {
    public enum Namn{
        SIXTEN("Sixten",5000), DOGGE ("Dogge", 10000),
        VENUS("Venus", 5000), OVE("Ove", 3000), HYPNO("Hypno", 1000);

        public final String djurNamn;
        public final int djurVikt;

        Namn(String namn, int vikt){
            this.djurNamn = namn;
            this.djurVikt =vikt;
        }
    }


    private int vikt;
    private String namn;
    private int djurPortion;


    Djur() {
    }

    Djur(String namn, int vikt) {
        setNamn(namn);
        setVikt(vikt);
    }



    public String getNamn() {
        return namn;
    }

    public int getVikt() {
        return vikt;
    }

    public void setVikt(int vikt) {
        this.vikt = vikt;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public int getDjurPortion() {
        return djurPortion;
    }

    public void setDjurPortion(int djurPortion) {
        this.djurPortion = djurPortion;
    }

    @Override
    public String portion() {
        return "Välj ett djur";
    }

    @Override
    public String toString() {
        return getNamn();
    }
}
