/**
 * Created by Daniel Bojic
 * Date: 2020-09-25
 * Time: 09:12
 * Project: 1
 * Copyright: MIT
 */

//arv & interface
public class Katt extends Djur implements DjurInterface {

    Katt() {
    }

    Katt(String namn, int vikt) {
        super(namn, vikt);
    }

    @Override
    public String portion() {
        setDjurPortion(getVikt() / 150);
        return getNamn() + " ska få " + getDjurPortion() + "g kattfoder";
    }

}
