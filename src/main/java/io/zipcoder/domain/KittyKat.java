package io.zipcoder.domain;

import javax.persistence.*;

@Entity
public class KittyKat {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="KITTY_KAT_ID")
    private Long id;

    @Column(name="NAME")
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
