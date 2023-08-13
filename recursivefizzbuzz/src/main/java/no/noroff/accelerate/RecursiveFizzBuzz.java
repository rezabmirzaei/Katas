package no.noroff.accelerate;

public class RecursiveFizzBuzz {
public static void recursiveFizzBuzz(int start, int end) {

        if (start > end) {
            return;
        }

        if (start % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (start % 3 == 0) {
            System.out.println("Fizz");
        } else if (start % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(start);
        }

        recursiveFizzBuzz(start + 1, end);

    }

    public static void betterRecursiveFizzBuzz(int start, int end) {

        if (start > end) {
            return;
        }

        String result = "";
        if (start % 3 == 0) {
            result += "Fizz";
        }
        if (start % 5 == 0) {
            result += "Buzz";
        }

        if (!result.isEmpty()) {
            System.out.println(result);
        } else {
            System.out.println(start);
        }

        betterRecursiveFizzBuzz(start + 1, end);
    }

    public static void main(String[] args) {
        int start = 1;
        int end = 20;
        recursiveFizzBuzz(start, end);
        // betterRecursiveFizzBuzz(start, end);
    }
}
