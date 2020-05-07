package com.example.model;

import com.example.model.entity.Korisnik;
import com.example.model.repository.KorisnikRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ModelApplication implements CommandLineRunner {

	@Autowired
	private KorisnikRepository korisnikRepository;


	public static void main(String[] args) {
		SpringApplication.run(ModelApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Korisnik korisnik = new Korisnik();
		korisnik.setIme("Biljana");
		korisnik.setPrezime("Marinkov");
		korisnik.setAktivan(true);
		korisnik.setE_mail("mbiljana99@gmail.com");
		korisnik.setDatum_rodjenja("2.5.1999.");
		korisnik.setKontakt_telefon("063399294");
		korisnik.setKorisnicko_ime("mbiljana");
		korisnik.setLozinka("123biljana");

		this.korisnikRepository.save(korisnik);

		List<Korisnik>korisnici=this.korisnikRepository.findAll();

		for(Korisnik k : korisnici){
			System.out.println(k);
		}

	}
}
