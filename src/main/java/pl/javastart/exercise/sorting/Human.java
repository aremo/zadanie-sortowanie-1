package pl.javastart.exercise.sorting;

public class Human {

    private Long id;
    private String name;
    private String surname;

    public Human(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
