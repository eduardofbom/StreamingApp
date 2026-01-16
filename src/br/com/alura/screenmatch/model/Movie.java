package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.Calculations.Classificable;

public class Movie extends Title implements Classificable {
    // SPECIFC FIELDS
    private String director;

    // CONSTRUCTORS
    public Movie(String name, int yearOfRelease) {
        super(name, yearOfRelease);
    }

    // SPECIF GETTERS AND SETTERS
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) getAverage() / 2;
    }
}
