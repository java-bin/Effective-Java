package memoryleak;

public class StackApplication {
    public static void main(String[] args) {
        String[] strings = {"String", "String1", "String2"};
        Stack stack = new Stack();
        for (String string : strings)
            stack.push(string);

        while (true)
            System.err.println(stack.pop());
    }
}
