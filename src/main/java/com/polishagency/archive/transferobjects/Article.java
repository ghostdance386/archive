package com.polishagency.archive.transferobjects;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Setter
@Entity
@Table
public class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "article_generator")
    @SequenceGenerator(name = "article_generator", sequenceName = "art_seq", allocationSize = 1)
    private long articleId;

    @OneToOne
    @JoinColumn(name = "magazine_id", nullable = false)
    private Magazine magazine;

    @OneToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @OneToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @Column(nullable = false)
    private double size;

    @Column(nullable = false)
    private LocalDate localDate;

    @Override
    public String toString() {
        return "Article " +
                "id=" + articleId +
                ", magazine=" + magazine +
                ", client=" + client +
                ", author=" + author +
                ", size=" + size +
                ", localDate=" + localDate +
                '}';
    }
}
