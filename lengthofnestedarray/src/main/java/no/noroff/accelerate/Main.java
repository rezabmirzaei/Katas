package no.noroff.accelerate;

public class Main {

    public static void main(String[] args) {
        LengthOfNestedArray lona = new LengthOfNestedArray();

        // [1, [2, 3]]
        System.out.println(lona.getLength(new Object[] { 1, new Object[] { 2, 3 } }));

        // [1, [2, [3, 4]]]
        System.out.println(lona.getLength(new Object[] { 1, new Object[] { 2, new Object[] { 3, 4 } } }));

        // Empty case (return 0)
        System.out.println(lona.getLength(new Object[] {}));

        // [1, ["s", true], 45.5, [[3, 5], "hi"]] -> 7 elements total
        Object[] nestedArray = {
                1,
                new Object[] { "s", true },
                45.5,
                new Object[] { new Object[] { 3, 5 }, "hi" }
        };
        System.out.println(lona.getLength(nestedArray));
    }

}
