package no.noroff.accelerate;

public class LengthOfNestedArray {

    public int getLength(Object[] arr) {
        int count = 0;
        for (Object item : arr) {
            if (item instanceof Object[]) {
                count += getLength((Object[]) item);
            } else {
                count++;
            }
        }
        return count;
    }

}
