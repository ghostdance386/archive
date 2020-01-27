package com.polishagency.archive.transferobjects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Author {

    private long id;
    private String name;

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
