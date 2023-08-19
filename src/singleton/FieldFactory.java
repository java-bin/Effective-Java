package singleton;
/*
public static final field singleton
 */
public class FieldFactory {
    public static final FieldFactory INSTANCE = new FieldFactory();

    private FieldFactory() {}

    public void leaveTheBuilding() {
        System.out.println("I'm outta here!");
    }
}
