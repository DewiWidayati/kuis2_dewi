/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1020.service;

import com.tib.kuis_1020.entity.mobil_1020;
import com.tib.kuis_1020.repo.mobil_1020_Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC-11-320
 */
@Service("mobil_1020_Service")
@Transactional
public class mobil_1020_Service {

    @Autowired
    private mobil_1020_Repo repo;

    public mobil_1020 insert(mobil_1020 mobil) {
        return repo.save(mobil);
    }
    
    public mobil_1020 update(mobil_1020 mobil) {
        return repo.save(mobil);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public mobil_1020 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<mobil_1020> getAll(){
        return repo.findAllCategory();
    }
}

