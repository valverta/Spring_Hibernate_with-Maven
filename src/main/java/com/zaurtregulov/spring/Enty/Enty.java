package com.zaurtregulov.spring.Enty;

import javax.persistence.*;

@Entity
@Table(name = "Enty")
public class Enty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;

    public Enty() {

    }
    public Enty(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Enty{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
