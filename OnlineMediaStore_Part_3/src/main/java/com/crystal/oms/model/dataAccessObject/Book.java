package com.crystal.oms.model.dataAccessObject;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Book extends Media {
    private List<Author> authors = new ArrayList<>();

    public Book(String title, String category, double cost, ArrayList<Author> authors) {
        super(title, category, cost);
        this.authors = authors;
    }


    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Book{" +
                "authors=" + authors +
                ", title='" + title + '\'' +
                ", category='" + category + '\'' +
                ", cost=" + cost +
                '}';
    }
}
