/**
 * Created by Daniel Bojic
 * Date: 2020-09-25
 * Time: 09:12
 * Project: 1
 * Copyright: MIT
 */

//arv & interface
public class Orm extends Djur implements DjurInterface {

    Orm() {
    }

    Orm(String namn, int vikt) {
        super(namn, vikt);
    }

    @Override
    public String portion() {
        setDjurPortion(20);
        return getNamn() + " ska få " + getDjurPortion() + "g ormpellets";
    }
}
