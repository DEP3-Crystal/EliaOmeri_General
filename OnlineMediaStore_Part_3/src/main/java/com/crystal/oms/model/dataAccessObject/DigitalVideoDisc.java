package com.crystal.oms.model.dataAccessObject;

public class DigitalVideoDisc extends Media {

    private String director;
    private int length;


    public DigitalVideoDisc(String title, String category, double cost, String director, int length) {
        super(title, category, cost);
        this.director = director;
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "{title: '" + title + '\'' +
                ", category: '" + category + '\'' +
                ", cost: " + cost +
                ", director: '" + director + '\'' +
                ", length: " + length +
                "}\n";
    }
}
