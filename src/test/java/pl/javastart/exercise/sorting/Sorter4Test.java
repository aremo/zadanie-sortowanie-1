package pl.javastart.exercise.sorting;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.assertThat;

public class Sorter4Test {

    private List<Human> humans;
    private Sorter4 sorter;

    @Before
    public void init() {
        sorter = new Sorter4();

        humans = new ArrayList<>();
        humans.add(new Human(7L, "Adam", "Kowalski"));
        humans.add(new Human(1L, "Adam", "Kowalski"));
        humans.add(new Human(4L, "Damian", null));
        humans.add(new Human(3L, "Kasia", "Tatar"));
        humans.add(new Human(2L, "Kasia", "Kowalski"));
        humans.add(new Human(5L, null, "Zonk"));
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
        assertThat(sortedHumans.get(2).getName(), is("Damian"));
        assertThat(sortedHumans.get(2).getSurname(), nullValue());
        assertThat(sortedHumans.get(3).getName(), is("Kasia"));
        assertThat(sortedHumans.get(3).getSurname(), is("Kowalski"));
        assertThat(sortedHumans.get(4).getName(), is("Kasia"));
        assertThat(sortedHumans.get(4).getSurname(), is("Tatar"));
        assertThat(sortedHumans.get(5).getName(), is("Zofia"));
        assertThat(sortedHumans.get(5).getSurname(), is("Adamska"));
        assertThat(sortedHumans.get(6).getName(), nullValue());
        assertThat(sortedHumans.get(6).getSurname(), is("Zonk"));
    }

    @Test
    public void shouldSortFirstBySurnameThenByName() {
        // when
        List<Human> sortedHumans = sorter.sortBySurnameFirstThenByName(humans);

        // then
        assertThat(sortedHumans.get(0).getSurname(), is("Adamska"));
        assertThat(sortedHumans.get(0).getName(), is("Zofia"));
        assertThat(sortedHumans.get(1).getSurname(), is("Kowalski"));
        assertThat(sortedHumans.get(1).getName(), is("Adam"));
        assertThat(sortedHumans.get(2).getSurname(), is("Kowalski"));
        assertThat(sortedHumans.get(2).getName(), is("Adam"));
        assertThat(sortedHumans.get(3).getSurname(), is("Kowalski"));
        assertThat(sortedHumans.get(3).getName(), is("Kasia"));
        assertThat(sortedHumans.get(4).getSurname(), is("Tatar"));
        assertThat(sortedHumans.get(4).getName(), is("Kasia"));
        assertThat(sortedHumans.get(5).getSurname(), is("Zonk"));
        assertThat(sortedHumans.get(5).getName(), nullValue());
        assertThat(sortedHumans.get(6).getSurname(), nullValue());
        assertThat(sortedHumans.get(6).getName(), is("Damian"));
    }

    @Test
    public void shouldSortFirstBySurnameThenByNameThenById() {
        // when
        List<Human> sortedHumans = sorter.sortBySurnameFirstThenByNameThenById(humans);

        // then
        assertThat(sortedHumans.get(0).getSurname(), is("Adamska"));
        assertThat(sortedHumans.get(0).getName(), is("Zofia"));
        assertThat(sortedHumans.get(1).getSurname(), is("Kowalski"));
        assertThat(sortedHumans.get(1).getName(), is("Adam"));
        assertThat(sortedHumans.get(1).getId(), is(1L));
        assertThat(sortedHumans.get(2).getSurname(), is("Kowalski"));
        assertThat(sortedHumans.get(2).getName(), is("Adam"));
        assertThat(sortedHumans.get(2).getId(), is(7L));
        assertThat(sortedHumans.get(3).getSurname(), is("Kowalski"));
        assertThat(sortedHumans.get(3).getName(), is("Kasia"));
        assertThat(sortedHumans.get(4).getSurname(), is("Tatar"));
        assertThat(sortedHumans.get(4).getName(), is("Kasia"));
        assertThat(sortedHumans.get(5).getSurname(), is("Zonk"));
        assertThat(sortedHumans.get(5).getName(), nullValue());
        assertThat(sortedHumans.get(6).getSurname(), nullValue());
        assertThat(sortedHumans.get(6).getName(), is("Damian"));
    }
}
