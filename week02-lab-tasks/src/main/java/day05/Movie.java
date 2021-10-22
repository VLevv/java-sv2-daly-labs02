package day05;

import java.time.LocalDate;

public class Movie {
    private String name;
    private LocalDate date;
    private double averageRating;
    private double numberOfRates;
    private double sumOfRates;

    public Movie(String name, LocalDate date) {
        this.name = name;
        this.date = date;
        this.averageRating=0;
        this.numberOfRates=0;
        this.sumOfRates=0;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getAverageRating() {
        return averageRating;
    }

    public double getNumberOfRates() {
        return numberOfRates;
    }

    public double getSumOfRates() {
        return sumOfRates;
    }

    public double rate(int rating) {
        if (rating >= 1 && rating <= 5) {
            numberOfRates++;
            sumOfRates += rating;
            averageRating = sumOfRates / numberOfRates;
            return averageRating;
        }
        else {
            return -1;
        }
    }
}
