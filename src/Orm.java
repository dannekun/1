/**
 * Created by Daniel Bojic
 * Date: 2020-09-25
 * Time: 09:12
 * Project: 1
 * Copyright: MIT
 */
public class Orm extends Djur {

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
