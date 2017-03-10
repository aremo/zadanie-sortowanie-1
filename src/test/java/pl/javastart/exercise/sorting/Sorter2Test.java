package pl.javastart.exercise.sorting;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Sorter2Test {

    private List<Human> humans;
    private Sorter2 sorter;

    @Before
    public void init() {
        sorter = new Sorter2();

        humans = new ArrayList<>();
        humans.add(new Human(1L, "Adam", "Kowalski"));
        humans.add(new Human(4L, "Damian", "Klaus"));
        humans.add(new Human(2L, "Kasia", "Kowalski"));
        humans.add(new Human(5L, "Adrian", "Zonk"));
        humans.add(new Human(3L, "Kasia", "Tatar"));
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
        assertThat(sortedHumans.get(4).getName(), is("Kasia"));
        assertThat(sortedHumans.get(5).getName(), is("Zofia"));
    }

    @Test
    public void shouldSortBySurname() {
        // when
        List<Human> sortedHumans = sorter.sortBySurname(humans);

        // then
        assertThat(sortedHumans.get(0).getSurname(), is("Adamska"));
        assertThat(sortedHumans.get(1).getSurname(), is("Klaus"));
        assertThat(sortedHumans.get(2).getSurname(), is("Kowalski"));
        assertThat(sortedHumans.get(3).getSurname(), is("Kowalski"));
        assertThat(sortedHumans.get(4).getSurname(), is("Tatar"));
        assertThat(sortedHumans.get(5).getSurname(), is("Zonk"));
    }

    @Test
    public void shouldSortById() {
        // when
        List<Human> sortedHumans = sorter.sortById(humans);

        // then
        assertThat(sortedHumans.get(0).getId(), is(1L));
        assertThat(sortedHumans.get(1).getId(), is(2L));
        assertThat(sortedHumans.get(2).getId(), is(3L));
        assertThat(sortedHumans.get(3).getId(), is(4L));
        assertThat(sortedHumans.get(4).getId(), is(5L));
        assertThat(sortedHumans.get(5).getId(), is(6L));
    }


}
