package pattern;

import static pattern.NyPizza.Size.*;
import static pattern.Pizza.Topping.*;

public class PizzaApplication {
    public static void main(String[] args) {
        NyPizza nyPizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE)
                .addTopping(ONION)
                .build();
        CalzonePizza calzonePizza = new CalzonePizza.Builder()
                .addTopping(HAM)
                .sauceInside()
                .build();

        System.out.println("nyPizza = " + nyPizza);
        System.out.println("calzonePizza = " + calzonePizza);
    }
}
