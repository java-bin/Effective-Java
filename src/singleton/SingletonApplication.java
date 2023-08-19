package singleton;

public class SingletonApplication {
    public static void main(String[] args) {
        FieldFactory fieldFactory = FieldFactory.INSTANCE;
        fieldFactory.leaveTheBuilding();

        StaticFactory staticFactory = StaticFactory.getInstance();
        staticFactory.leaveTheBuilding();

        EnumType enumType = EnumType.INSTANCE;
        enumType.leaveTheBuilding();
    }
}
