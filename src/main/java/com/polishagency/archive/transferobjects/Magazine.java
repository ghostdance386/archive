package com.polishagency.archive.transferobjects;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Magazine {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "magazine_generator")
    @SequenceGenerator(name = "magazine_generator", sequenceName = "mag_seq", allocationSize = 1)
    private long magazineId;

    @Column(nullable = false)
    private String name;

    @Override
    public String toString() {
        return
                "{id=" + magazineId +
                        ", name='" + name + '\'' +
                        '}';
    }
}
