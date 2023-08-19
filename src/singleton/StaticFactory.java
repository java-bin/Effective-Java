package singleton;
/*
static factory singleton
 */
public class StaticFactory {
    private static final StaticFactory INSTANCE = new StaticFactory();

    private StaticFactory() {}

    public static StaticFactory getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding() {
        System.out.println("I'm outta here!");
    }
}
