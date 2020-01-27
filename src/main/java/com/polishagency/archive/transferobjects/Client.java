package com.polishagency.archive.transferobjects;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {

    private long id;
    private String name;

    @Override
    public String toString() {
        return
                "{id=" + id +
                        ", name='" + name + '\'' +
                        '}';
    }
}
