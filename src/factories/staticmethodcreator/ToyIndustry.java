package factories.staticmethodcreator;

public class ToyIndustry {
    public static void main(String[] args) {
        Toy doll = ToyFactory.getToy("DOLL");
        doll.repair();
        Toy train = ToyFactory.getToy("TRAIN");
        train.repair();
    }
}
