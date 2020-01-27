package com.polishagency.archive.transferobjects;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Article {

    private long id;
    private Magazine magazine;
    private Client client;
    private Author author;
    private double size;
    private LocalDate localDate;

    @Override
    public String toString() {
        return "Article " +
                "id=" + id +
                ", magazine=" + magazine +
                ", client=" + client +
                ", author=" + author +
                ", size=" + size +
                ", localDate=" + localDate +
                '}';
    }
}
