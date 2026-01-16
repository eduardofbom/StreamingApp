package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.Calculations.Classificable;
import br.com.alura.screenmatch.model.Series;

public class Episode implements Classificable {
    // FIELDS
    private int number;
    private String name;
    private int totalViews;
    private Series series;

    // CONSTRUCTORS
    public Episode(String name, Series series) {
        this.name = name;
        this.series = series;
    }

    // GETTERS AND SETTERS
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getTotalViews() {
        return totalViews;
    }
    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public Series getSeries() {
        return series;
    }
    public void setSeries(Series series) {
        this.series = series;
    }

    @Override
    public int getClassification() {
        if (totalViews > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
