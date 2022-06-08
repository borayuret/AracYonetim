package com.example.aracyonetim.repository;

import com.example.aracyonetim.entity.Araba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "araba", path="araba")
public interface ArabaRepository extends JpaRepository<Araba, Long> {

    List<Araba> findByMarka(String marka);
}
