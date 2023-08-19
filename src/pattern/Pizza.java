package pattern;

import java.util.*;

// 참고: '시뮬레이트한 셀프 타입(simulated self-type)' 관용구는 빌더뿐 아니라 임의의 유동적인 계층구조를 허용한다.

public class Pizza {
    public enum Topping {
        HAM, MUSHROOM, ONION, PEPPER, SAUSAGE
    }
    final Set<Topping> toppings;

    // 추상 클래스 abstract class
    abstract static class  Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract  Pizza build();

        protected abstract T self();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
