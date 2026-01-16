package br.com.alura.screenmatch.Calculations;


import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Series;
import br.com.alura.screenmatch.model.Title;


public class CalculatorOfTime {
    // FIELDS
    private int totalTime;

    // GETTERS AND SETTERS
    public int getTotalTime() {
        return totalTime;
    }

    // METHODS
    public void includes(Title title) {
        System.out.println("Adding duration in minutes by " + title.getName());
        totalTime += title.getDurationInMinutes();;
    }
}
