package com.polishagency.archive.transferobjects;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "author_generator")
    @SequenceGenerator(name = "author_generator", sequenceName = "aut_seq", allocationSize = 1)
    private long authorId;

    @Column
    private String name;

    @Override
    public String toString() {
        return
                "{id=" + authorId +
                        ", name='" + name + '\'' +
                        '}';
    }
}
