package br.com.alura.screenmatch.model;

public class Title implements Comparable<Title> {
    // Fields
    private String name;
    private int yearOfRelease;
    private boolean includedInPlan;
    private double sumOfReviews;
    private int quantityOfReviews;
    private int durationInMinutes;

    // Contructors
    public Title (String name, int yearOfRelease) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
    }
    public Title (String name, int yearOfRelease, boolean includedInPlan, double sumOfReviews, int quantityOfReviews, int durationInMinutes) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.includedInPlan = includedInPlan;
        this.sumOfReviews = sumOfReviews;
        this.quantityOfReviews = quantityOfReviews;
        this.durationInMinutes = durationInMinutes;
    }

    // Getters
    public String getName() {
        return name;
    }
    public int getYearOfRelease() {
        return yearOfRelease;
    }
    public boolean getIncludedInPlan() {
        return includedInPlan;
    }
    public int getQuantityOfReviews() {  // get
        return quantityOfReviews;
    }
    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }
    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    // Methods
    public void displaysTechnicalSpecifications() {
        System.out.printf("""
                Name: %s
                Year of release: %d
                %n""", name, yearOfRelease);
    }
    public void evaluate(double evaluation) {
        sumOfReviews += evaluation;
        quantityOfReviews++;
    }
    public double getAverage() {
        return sumOfReviews / quantityOfReviews;
    }

    // ToString Method
    @Override
    public String toString() {
        return name + "(" + yearOfRelease + ")";
    }


    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }
}
