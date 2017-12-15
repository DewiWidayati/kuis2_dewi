/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1020.controller;

import com.tib.kuis_1020.entity.aksesoris_1020;
import com.tib.kuis_1020.service.aksesoris_1020_Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author PC-11-320
 */
@RestController
@RequestMapping("/aksesoris")
public class aksesoris_1020_Controller {

    @Autowired
    private aksesoris_1020_Service aksesoris_1020_Service;

    @RequestMapping(method = RequestMethod.POST)
    public aksesoris_1020 insert(@RequestBody aksesoris_1020 aksesoris) {
        return aksesoris_1020_Service.insert(aksesoris);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public aksesoris_1020 update(@RequestBody aksesoris_1020 aksesoris) {
        return aksesoris_1020_Service.update(aksesoris);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return aksesoris_1020_Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public aksesoris_1020 getById(@PathVariable("id") Long id){
        return aksesoris_1020_Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<aksesoris_1020> getAll(){
        return aksesoris_1020_Service.getAll();
    }
}
