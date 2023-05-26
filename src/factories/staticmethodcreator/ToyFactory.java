package factories.staticmethodcreator;

import factories.concretecreator.furniture.Chair;
import factories.concretecreator.furniture.Table;

public class ToyFactory {

    public static Toy getToy(String toyType) {
        if (toyType == null) {
            return null;
        } else if (toyType.equalsIgnoreCase("TRAIN")) {
            return new Train();
        } else if (toyType.equalsIgnoreCase("DOLL")) {
            return new Doll();
        }
        return null;
    }

}
