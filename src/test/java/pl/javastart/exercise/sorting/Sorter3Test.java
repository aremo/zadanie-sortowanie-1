package pl.javastart.exercise.sorting;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Sorter3Test {

    private List<Human> humans;
    private Sorter3 sorter;

    @Before
    public void init() {
        sorter = new Sorter3();

        humans = new ArrayList<>();
        humans.add(new Human(7L, "Adam", "Kowalski"));
        humans.add(new Human(1L, "Adam", "Kowalski"));
        humans.add(new Human(4L, "Damian", "Klaus"));
        humans.add(new Human(3L, "Kasia", "Tatar"));
        humans.add(new Human(2L, "Kasia", "Kowalski"));
        humans.add(new Human(5L, "Adrian", "Zonk"));
        humans.add(new Human(6L, "Zofia", "Adamska"));
    }


    @Test
    public void shouldSortFirstByNameThenBySurname() {
        // when
        List<Human> sortedHumans = sorter.sortByNameFirstThenBySurname(humans);

        // then
        assertThat(sortedHumans.get(0).getName(), is("Adam"));
        assertThat(sortedHumans.get(0).getSurname(), is("Kowalski"));
        assertThat(sortedHumans.get(1).getName(), is("Adam"));
        assertThat(sortedHumans.get(1).getSurname(), is("Kowalski"));
        assertThat(sortedHumans.get(2).getName(), is("Adrian"));
        assertThat(sortedHumans.get(2).getSurname(), is("Zonk"));
        assertThat(sortedHumans.get(3).getName(), is("Damian"));
        assertThat(sortedHumans.get(3).getSurname(), is("Klaus"));
        assertThat(sortedHumans.get(4).getName(), is("Kasia"));
        assertThat(sortedHumans.get(4).getSurname(), is("Kowalski"));
        assertThat(sortedHumans.get(5).getName(), is("Kasia"));
        assertThat(sortedHumans.get(5).getSurname(), is("Tatar"));
        assertThat(sortedHumans.get(6).getName(), is("Zofia"));
        assertThat(sortedHumans.get(6).getSurname(), is("Adamska"));
    }

    @Test
    public void shouldSortFirstBySurnameThenByName() {
        // when
        List<Human> sortedHumans = sorter.sortBySurnameFirstThenByName(humans);

        // then
        assertThat(sortedHumans.get(0).getSurname(), is("Adamska"));
        assertThat(sortedHumans.get(0).getName(), is("Zofia"));
        assertThat(sortedHumans.get(1).getSurname(), is("Klaus"));
        assertThat(sortedHumans.get(1).getName(), is("Damian"));
        assertThat(sortedHumans.get(2).getSurname(), is("Kowalski"));
        assertThat(sortedHumans.get(2).getName(), is("Adam"));
        assertThat(sortedHumans.get(3).getSurname(), is("Kowalski"));
        assertThat(sortedHumans.get(3).getName(), is("Adam"));
        assertThat(sortedHumans.get(4).getSurname(), is("Kowalski"));
        assertThat(sortedHumans.get(4).getName(), is("Kasia"));
        assertThat(sortedHumans.get(5).getSurname(), is("Tatar"));
        assertThat(sortedHumans.get(5).getName(), is("Kasia"));
        assertThat(sortedHumans.get(6).getSurname(), is("Zonk"));
        assertThat(sortedHumans.get(6).getName(), is("Adrian"));
    }

    @Test
    public void shouldSortFirstBySurnameThenByNameThenById() {
        // when
        List<Human> sortedHumans = sorter.sortBySurnameFirstThenByNameThenById(humans);

        // then
        assertThat(sortedHumans.get(0).getSurname(), is("Adamska"));
        assertThat(sortedHumans.get(0).getName(), is("Zofia"));
        assertThat(sortedHumans.get(1).getSurname(), is("Klaus"));
        assertThat(sortedHumans.get(1).getName(), is("Damian"));
        assertThat(sortedHumans.get(2).getSurname(), is("Kowalski"));
        assertThat(sortedHumans.get(2).getName(), is("Adam"));
        assertThat(sortedHumans.get(2).getId(), is(1L));
        assertThat(sortedHumans.get(3).getSurname(), is("Kowalski"));
        assertThat(sortedHumans.get(3).getName(), is("Adam"));
        assertThat(sortedHumans.get(3).getId(), is(7L));
        assertThat(sortedHumans.get(4).getSurname(), is("Kowalski"));
        assertThat(sortedHumans.get(4).getName(), is("Kasia"));
        assertThat(sortedHumans.get(5).getSurname(), is("Tatar"));
        assertThat(sortedHumans.get(5).getName(), is("Kasia"));
        assertThat(sortedHumans.get(6).getSurname(), is("Zonk"));
        assertThat(sortedHumans.get(6).getName(), is("Adrian"));
    }
}
