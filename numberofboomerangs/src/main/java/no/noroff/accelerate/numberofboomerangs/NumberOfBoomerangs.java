package no.noroff.accelerate.numberofboomerangs;

import java.util.List;

public class NumberOfBoomerangs {

    public int countBoomerangs(List<Integer> arr) {
        if (arr.isEmpty() || arr.size() < 3) {
            throw new IllegalArgumentException("Array must have at least 3 elements");
        }

        int count = 0;
        for (int i = 0; i < arr.size() - 2; i++) {
            if (isBoomerang(arr.subList(i, i + 3))) {
                count++;
            }
        }

        return count;
    }

    private boolean isBoomerang(List<Integer> subList) {
        return subList.get(0).equals(subList.get(2)) && !subList.get(0).equals(subList.get(1));
    }

}
