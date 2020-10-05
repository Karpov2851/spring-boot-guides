package com.ws.model;

import javax.persistence.*;

/**
 * Created by vikas on 07-04-2019.
 */
@Entity
@Table
public class CountryMstr {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String population;
    @Column
    private String capital;
    @Column
    private String currency;

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

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "CountryMstr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", population='" + population + '\'' +
                ", capital='" + capital + '\'' +
                ", currency='" + currency + '\'' +
                '}';
    }
}
