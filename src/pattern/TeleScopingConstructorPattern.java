package pattern;

/*
Anti Pattern 점층적 생성자 패턴
 */
public class TeleScopingConstructorPattern {
    // final
    private final int servingSize;
    private final int servings;
    private final int calories; // optional
    private final int fat; // optional
    private final int sodium; // optional
    private final int carbohydrate; // optional

    public TeleScopingConstructorPattern(int servingSize, int servings, int calories) {
        this(servingSize, servings, calories, 0);
    }

    public TeleScopingConstructorPattern(int servingSize, int servings, int calories, int fat) {
        this(servingSize, servings, calories, fat, 0);
    }

    public TeleScopingConstructorPattern(int servingSize, int servings, int calories, int fat, int sodium) {
        this(servingSize, servings, calories, fat, sodium, 0);
    }

    public TeleScopingConstructorPattern(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrate) {
        this.servingSize = servingSize;
        this.servings = servings;
        this.calories = calories;
        this.fat = fat;
        this.sodium = sodium;
        this.carbohydrate = carbohydrate;
    }



}