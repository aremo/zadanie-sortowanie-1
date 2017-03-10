package pl.javastart.exercise.sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sorter2 {

    public List<Human> sortByName(List<Human> humans) {
        Collections.sort(humans, new Comparator<Human>() {

            @Override public int compare(Human o1, Human o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        return humans;
    }

    public List<Human> sortBySurname(List<Human> humans) {
        Collections.sort(humans, new Comparator<Human>() {

            @Override public int compare(Human o1, Human o2) {
                return o1.getSurname().compareTo(o2.getSurname());
            }
        });
        return humans;
    }

    public List<Human> sortById(List<Human> humans) {
        Collections.sort(humans, new Comparator<Human>() {

            @Override public int compare(Human o1, Human o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        return humans;
    }
}
