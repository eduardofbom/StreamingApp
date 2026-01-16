package br.com.alura.screenmatch.App;

import br.com.alura.screenmatch.model.Title;
import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Series;
import br.com.alura.screenmatch.model.Episode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainWithLists {
    public static void main(String[] args) {
        Movie theMatrix = new Movie("The Matrix", 1999);
        theMatrix.evaluate(10);

        Movie johnWick = new Movie("John Wick", 2014);
        johnWick.evaluate(9);

        Series laCasaDePapel = new Series("La Casa de Papel", 2017);


        ArrayList<Title> titles = new ArrayList<>();
        titles.add(theMatrix);
        titles.add(johnWick);
        titles.add(laCasaDePapel);

        for (Title title : titles) {
            System.out.println("Name: " + title.getName());;
            if((title instanceof Movie movie) && (movie.getClassification() > 2)) {
                System.out.println("Classification: " + movie.getClassification());
            }
        }

        Collections.sort(titles);
        System.out.println("Titles list sorted by name:");
        System.out.println(titles);
        titles.sort(Comparator.comparing(Title::getYearOfRelease));
        System.out.println("Titles list sorted by year of release:");
        System.out.println(titles);
    }
}
