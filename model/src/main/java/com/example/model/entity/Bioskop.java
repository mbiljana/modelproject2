package com.example.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Bioskop implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String naziv;
    @Column
    private String adresa;
    @Column
    private String broj_telefona_centrale;
    private String e_mail;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Menadzer> menadzeri= new HashSet<Menadzer>();

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Sala> sale = new HashSet<Sala>();


    public Bioskop() {
        this.id = Long.valueOf(0);
        this.naziv = "";
        this.adresa = "";
        this.broj_telefona_centrale = "";
        this.e_mail="";
    }

    public Bioskop(Long id, String naziv, String adresa, String broj_telefona_centrale, String e_mail) {
        this.id = id;
        this.naziv = naziv;
        this.adresa = adresa;
        this.broj_telefona_centrale = broj_telefona_centrale;
        this.e_mail=e_mail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getBroj_telefona_centrale() {
        return broj_telefona_centrale;
    }

    public void setBroj_telefona_centrale(String broj_telefona_centrale) {
        this.broj_telefona_centrale = broj_telefona_centrale;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
}
