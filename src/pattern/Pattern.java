package pattern;

public class Pattern {
    public static void main(String[] args) {
        // 점층적 생성자 패턴
        TeleScopingConstructorPattern cocaCola = new TeleScopingConstructorPattern(240, 8, 100, 0, 35, 27);

        // 자바빈즈 패턴
        JavaBeansPattern cocaCola2 = new JavaBeansPattern();
        cocaCola2.setServingSize(240);
        cocaCola2.setServings(8);
        cocaCola2.setCalories(100);
        cocaCola2.setSodium(35);
        cocaCola2.setCarbohydrate(27);

        // 빌더 패턴
        BuilderPattern cocaCola3 = new BuilderPattern
                .Builder(240, 8)
                .calories(100).sodium(35).carbohydrate(27).build();

    }
}
