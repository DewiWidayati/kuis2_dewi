/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1020.entity;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author PC-11-320
 */
@Entity
@Table(name = "mobil_1020")
public class mobil_1020 implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String nama;
    @Column(length = 255, nullable = true)
    private String merk;
    @Column(length = 255, nullable = true)
    private String harga;
    
    @OneToMany
    @JoinColumn(name="id")
    private Set<aksesoris_1020> aksesoris_1020;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the name to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the description
     */
    public String getMerk() {
        return merk;
    }

    /**
     * @param merk the description to set
     */
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getHarga() {
        return harga;
    }

    /**
     * @param harga the description to set
     */
    public void setHarga(String harga) {
        this.harga = harga;
    }
}
