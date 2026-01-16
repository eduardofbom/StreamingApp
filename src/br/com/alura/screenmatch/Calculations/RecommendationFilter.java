package br.com.alura.screenmatch.Calculations;

public class RecommendationFilter {
    // FIELDS
    private String recomendation;

    // METHODS
    public void filter(Classificable classificable) {
        if (classificable.getClassification() >= 4) {
            System.out.println("This one is among the current favorites.");
        } else if (classificable.getClassification() >= 2) {
            System.out.println("Very well rated at the moment.");
        } else {
            System.out.println("Add it to your watch list.");
        }
    }
}
