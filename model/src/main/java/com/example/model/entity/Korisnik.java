package com.example.model.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

enum ULOGA {
    GLEDALAC,
    MENADZER,
    ADMINISTRATOR
}

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING)

public class Korisnik implements Serializable{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) //inkrementalno generisanje kljuceva prilikom cuvanja u bazi
    private Long id;

    @Column(nullable = false)
    private String korisnicko_ime;
    @Column(nullable = false)
    private String lozinka;
    @Column(nullable = false)
    private String ime;
    @Column(nullable = false)
    private String prezime;
    @Column
    private String kontakt_telefon;
    @Column
    private String e_mail;
    @Column
    private Date datum_rodjenja;
    @Column(nullable = false)
    private ULOGA uloga;
    @Column(nullable = false)
    private Boolean aktivan;

    public Korisnik() {
        this.id = Long.valueOf(0);
        this.korisnicko_ime = "";
        this.lozinka = "";
        this.ime = "";
        this.prezime = "";
        this.kontakt_telefon = "";
        this.e_mail = "";
        this.uloga = ULOGA.GLEDALAC;
        this.aktivan = true;
    }


    public Korisnik(Long id, String korisnicko_ime, String lozinka, String ime,
                    String prezime, String kontakt_telefon, String e_mail,
                    Date datum_rodjenja, ULOGA uloga, Boolean aktivan) {
        this.id = id;
        this.korisnicko_ime = korisnicko_ime;
        this.lozinka = lozinka;
        this.ime = ime;
        this.prezime = prezime;
        this.kontakt_telefon = kontakt_telefon;
        this.e_mail = e_mail;
        this.datum_rodjenja = datum_rodjenja;
        this.uloga = uloga;
        this.aktivan = aktivan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getKorisnicko_ime() {
        return korisnicko_ime;
    }

    public void setKorisnicko_ime(String korisnicko_ime) {
        this.korisnicko_ime = korisnicko_ime;
    }

    public String getLozinka() {
        return lozinka;
    }

    public void setLozinka(String lozinka) {
        this.lozinka = lozinka;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getKontakt_telefon() {
        return kontakt_telefon;
    }

    public void setKontakt_telefon(String kontakt_telefon) {
        this.kontakt_telefon = kontakt_telefon;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public Date getDatum_rodjenja() {
        return datum_rodjenja;
    }

    public void setDatum_rodjenja(Date datum_rodjenja) {
        this.datum_rodjenja = datum_rodjenja;
    }

    public ULOGA getUloga() {
        return uloga;
    }

    public void setUloga(ULOGA uloga) {
        this.uloga = uloga;
    }

    public Boolean getAktivan() {
        return aktivan;
    }

    public void setAktivan(Boolean aktivan) {
        this.aktivan = aktivan;
    }


}
