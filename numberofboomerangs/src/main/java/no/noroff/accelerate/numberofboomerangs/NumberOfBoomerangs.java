package no.noroff.accelerate.numberofboomerangs;

import java.util.List;

public class NumberOfBoomerangs {

    public int countBoomerangs(List<Object> objList) {

        if (objList.isEmpty() || objList.size() < 3) {
            throw new IllegalArgumentException("List must contain minimum 3 elements");
        }

        for (Object obj : objList) {
            if (!(obj instanceof Integer)) {
                throw new IllegalArgumentException("List contains non-numeric elements");
            }
        }

        List<Integer> numbers = objList.stream().map(numbObj -> (Integer) numbObj).toList();

        int count = 0;
        for (int i = objList.size() - 3; i >= 0; i--) {
            if (isBoomerang(numbers.subList(i, i + 3))) {
                count++;
            }
        }

        return count;
    }

    private boolean isBoomerang(List<Integer> subList) {
        return subList.get(0).equals(subList.get(2)) && !subList.get(0).equals(subList.get(1));
    }

}
