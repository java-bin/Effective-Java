package regex;

public class RegexApplication {
    public static void main(String[] args) {
        boolean check = false;

        for (int i = 0; i < 3; i++) {
            long start = System.nanoTime();
            for (int j = 0; j < 3; j++) {
//                check ^= RomanNumerals.isRomanNumeralSlow("MCMLXXVI");
                check ^= RomanNumerals.isRomanNumeralFast("MCMLXXVI");
            }
            long end = System.nanoTime();
            System.out.println(((end - start) / (1_000. * 3)) + " μs.");
        }
        if (!check) {
            System.out.println();
        }
    }
}
