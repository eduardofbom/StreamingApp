package br.com.alura.screenmatch.App;

import br.com.alura.screenmatch.model.Title;
import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Series;
import br.com.alura.screenmatch.model.Episode;

import br.com.alura.screenmatch.Calculations.CalculatorOfTime;
import br.com.alura.screenmatch.Calculations.RecommendationFilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Movie theGodFather = new Movie("The Godfather", 1972);
        theGodFather.setDurationInMinutes(180);
        theGodFather.setIncludedInPlan(true);

        Movie avatar = new Movie("Avatar", 2009);
        avatar.setDurationInMinutes(160);
        avatar.setIncludedInPlan(false);

        theGodFather.evaluate(8);
        theGodFather.evaluate(5);
        theGodFather.evaluate(10);

        Series lost = new Series("Lost", 2004);
        lost.setIsActive(false);
        lost.setQuantityOfSeasons(6);
        lost.setEpisodesPerSeason(20);
        lost.setMinutesPerEpisode(45);

        System.out.printf("Duration for binge-watch %s: %d minutes%n", lost.getName(), lost.getDurationInMinutes());

        CalculatorOfTime calculatorOfTime = new CalculatorOfTime();
        calculatorOfTime.includes(theGodFather);
        calculatorOfTime.includes(avatar);
        calculatorOfTime.includes(lost);
        System.out.println("Total time: " + calculatorOfTime.getTotalTime());

        Episode firstEpisode = new Episode("Episódio 1", lost);
        firstEpisode.setNumber(1);
        firstEpisode.setTotalViews(300);

        RecommendationFilter recommendationFilter = new RecommendationFilter();
        recommendationFilter.filter(theGodFather);
        recommendationFilter.filter(avatar);
        recommendationFilter.filter(firstEpisode);

        var dogville = new Movie("Dogville", 2003);
        dogville.setDurationInMinutes(178);
        dogville.setIncludedInPlan(true);

        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add(avatar);
        moviesList.add(theGodFather);
        moviesList.add(dogville);

        System.out.println("List size: " + moviesList.size());
        System.out.println("First movie: " + moviesList.getFirst());
//        moviesList.forEach(title -> System.out.println(title));
        moviesList.forEach(System.out::println);
        System.out.println("Movie toString: " + moviesList.getFirst().toString());


    }
}