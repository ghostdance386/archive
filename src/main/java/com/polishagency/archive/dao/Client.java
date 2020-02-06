package com.polishagency.archive.dao;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table
@Getter
@Setter
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_generator")
    @SequenceGenerator(name = "client_generator", sequenceName = "cli_seq", allocationSize = 1)
    private long clientId;

    @Column(nullable = false)
    private String name;

    @Override
    public String toString() {
        return
                "{id=" + clientId +
                        ", name='" + name + '\'' +
                        '}';
    }
}
