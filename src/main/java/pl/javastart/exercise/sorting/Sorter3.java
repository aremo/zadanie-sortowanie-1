package pl.javastart.exercise.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter3 {

    public List<Human> sortByNameFirstThenBySurname(List<Human> humans) {
        Collections.sort(humans, new Comparator<Human>() {

            @Override public int compare(Human o1, Human o2) {
                int result = o1.getName().compareTo(o2.getName());
                if (result == 0) {
                    return o1.getSurname().compareTo(o2.getSurname());
                } else {
                    return result;
                }
            }
        });

        return humans;
    }

    public List<Human> sortBySurnameFirstThenByName(List<Human> humans) {
        Collections.sort(humans, new Comparator<Human>() {

            @Override public int compare(Human o1, Human o2) {
                int result = o1.getSurname().compareTo(o2.getSurname());
                if (result == 0) {
                    return o1.getName().compareTo(o2.getName());
                } else {
                    return result;
                }
            }
        });

        return humans;
    }

    public List<Human> sortBySurnameFirstThenByNameThenById(List<Human> humans) {
        Collections.sort(humans, new Comparator<Human>() {

            @Override public int compare(Human o1, Human o2) {
                int result = o1.getSurname().compareTo(o2.getSurname());
                if (result == 0) {
                    result = o1.getName().compareTo(o2.getName());
                    if (result == 0) {
                        return o1.getId().compareTo(o2.getId());
                    } else {
                        return result;
                    }
                } else {
                    return result;
                }
            }
        });

        return humans;
    }
}