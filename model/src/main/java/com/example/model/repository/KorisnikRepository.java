package com.example.model.repository;

import com.example.model.entity.Korisnik;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface KorisnikRepository extends JpaRepository<Korisnik, Long> {

    List<Korisnik>findByIme(String ime);


}
