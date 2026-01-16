package br.com.alura.screenmatch.model;

public class Series extends Title{
    // SPECIF FIELDS
    private int quantityOfSeasons;
    private int episodesPerSeason;
    private boolean isActive;
    private int minutesPerEpisode;

    // CONSTRUCTORS
    public Series(String name, int yearOfRelease) {
        super(name, yearOfRelease);
    }

    // GETTERS AND SETTERS
    public int getQuantityOfSeasons() {
        return quantityOfSeasons;
    }
    public void setQuantityOfSeasons(int quantityOfSeasons) {
        this.quantityOfSeasons = quantityOfSeasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }
    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public boolean getIsActive() {
        return isActive;
    }
    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }
    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    // OVERRIDE METHODS
    @Override
    public int getDurationInMinutes() {
        return quantityOfSeasons * episodesPerSeason * minutesPerEpisode;
    }
}
