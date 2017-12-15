/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1020.service;

import com.tib.kuis_1020.entity.aksesoris_1020;
import com.tib.kuis_1020.repo.aksesoris_1020_Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC-11-320
 */
@Service("aksesoris_1020_Service")
@Transactional
public class aksesoris_1020_Service {

 @Autowired
    private aksesoris_1020_Repo repo;

    public aksesoris_1020 insert(aksesoris_1020 aksesoris) {
        return repo.save(aksesoris);
    }
    
    public aksesoris_1020 update(aksesoris_1020 aksesoris) {
        return repo.save(aksesoris);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public aksesoris_1020 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<aksesoris_1020> getAll(){
        return repo.findAllCategory();
    }
}