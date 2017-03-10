package pl.javastart.exercise.sorting;

import java.util.Collections;
import java.util.List;

public class Sorter1 {

    public List<Human> sortByName(List<Human> humans) {
        Collections.sort(humans);
        return humans;
    }
}
