/**
 * Created by Daniel Bojic
 * Date: 2020-09-25
 * Time: 09:12
 * Project: 1
 * Copyright: MIT
 */
public class Hund extends Djur implements DjurInterface {


Hund(){

}


    Hund(String namn, int vikt) {
        super(namn, vikt);
    }



    @Override
    public String portion() {
        setDjurPortion(getVikt() / 100);
        return getNamn() + " ska få " + getDjurPortion() + "g hundfoder";
    }
}
