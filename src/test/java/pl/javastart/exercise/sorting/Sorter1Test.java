package pl.javastart.exercise.sorting;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Sorter1Test {

    private List<Human> humans;
    private Sorter1 sorter;

    @Before
    public void init() {
        sorter = new Sorter1();

        humans = new ArrayList<>();
        humans.add(new Human(1L, "Adam", "Kowalski"));
        humans.add(new Human(4L, "Damian", "Klaus"));
        humans.add(new Human(2L, "Kasia", "Kowalsky"));
        humans.add(new Human(5L, "Adrian", "Zonk"));
        humans.add(new Human(3L, "Konrad", "Tatar"));
        humans.add(new Human(6L, "Zofia", "Adamska"));
    }


    @Test
    public void shouldSortByName() {
        // when
        List<Human> sortedHumans = sorter.sortByName(humans);

        // then
        assertThat(sortedHumans.get(0).getName(), is("Adam"));
        assertThat(sortedHumans.get(1).getName(), is("Adrian"));
        assertThat(sortedHumans.get(2).getName(), is("Damian"));
        assertThat(sortedHumans.get(3).getName(), is("Kasia"));
        assertThat(sortedHumans.get(4).getName(), is("Konrad"));
        assertThat(sortedHumans.get(5).getName(), is("Zofia"));
    }


}
