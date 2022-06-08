package com.example.aracyonetim;

import com.example.aracyonetim.entity.Araba;
import com.example.aracyonetim.repository.ArabaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AracYonetimApplication implements CommandLineRunner {

    @Autowired
    private ArabaRepository arabaRepository;

    public static void main(String[] args) {
        SpringApplication.run(AracYonetimApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        arabaRepository.save(
                new Araba("Ford", "Taunus",
                        "Siyah", "TA-254",
                        1995, 105000));
        arabaRepository.save(
                new Araba("Toyota", "Corolla",
                        "Gri", "TYT-15",
                        2005, 200000));
        arabaRepository.save(
                new Araba("Volkswagen", "Passat",
                        "Lacivert", "LC-23",
                        2019, 400000.50));
        arabaRepository.save(
                new Araba("Skoda", "Superb",
                        "Füme", "SS-2021",
                        2021, 600000));


    }
}
