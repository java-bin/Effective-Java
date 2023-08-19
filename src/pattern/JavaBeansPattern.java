package pattern;

/*
자바빈즈 패턴 - 일관성이 깨지고, 불변으로 만들 수가 없음.
 */
public class JavaBeansPattern {
    // final 없
    private int servingSize = -1;
    private int servings = -1;
    private int calories = 0; // optional
    private int fat = 0; // optional
    private int sodium = 0; // optional
    private int carbohydrate = 0; // optional

    // 생성자
    public JavaBeansPattern() {}
    // Setters
    public void setServingSize(int val) {
        servingSize = val;
    }

    public void setServings(int val) {
        servings = val;
    }

    public void setCalories(int val) {
        calories = val;
    }

    public void setFat(int val) {
        fat = val;
    }

    public void setSodium(int val) {
        sodium = val;
    }

    public void setCarbohydrate(int val) {
        carbohydrate = val;
    }

}
