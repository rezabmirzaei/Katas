package no.noroff.accelerate;

public class Main {
    public static void main(String[] args) {

        AlphabetSoup as = new AlphabetSoup();

        System.out.println("\nfor-loop reshuffle:");
        System.out.println(as.forLoopAlphabetSoup("hello"));
        System.out.println(as.forLoopAlphabetSoup("edabit"));
        System.out.println(as.forLoopAlphabetSoup("hacker"));
        System.out.println(as.forLoopAlphabetSoup("geek"));
        System.out.println(as.forLoopAlphabetSoup("javascript"));

        System.out.println("\nArrays.sort:");
        System.out.println(as.arraysSortAlphabetSoup("hello"));
        System.out.println(as.arraysSortAlphabetSoup("edabit"));
        System.out.println(as.arraysSortAlphabetSoup("hacker"));
        System.out.println(as.arraysSortAlphabetSoup("geek"));
        System.out.println(as.arraysSortAlphabetSoup("javascript"));

    }
}
