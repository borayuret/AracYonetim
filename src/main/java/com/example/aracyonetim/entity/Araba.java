package com.example.aracyonetim.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Araba {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long no;
    private String marka;
    private String model;
    private String renk;
    private String kayitNo;

    private int yil;
    private double fiyat;

    public Araba(String marka, String model, String renk, String kayitNo, int yil, double fiyat) {
        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.kayitNo = kayitNo;
        this.yil = yil;
        this.fiyat = fiyat;
    }
}
