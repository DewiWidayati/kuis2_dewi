/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1020.controller;

import com.tib.kuis_1020.entity.mobil_1020;
import com.tib.kuis_1020.service.mobil_1020_Service;
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
@RequestMapping("/category")
public class mobil_1020_Controller {

    @Autowired
    private mobil_1020_Service mobil_1020_Service;

    @RequestMapping(method = RequestMethod.POST)
    public mobil_1020 insert(@RequestBody mobil_1020 mobil) {
        return mobil_1020_Service.insert(mobil);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public mobil_1020 update(@RequestBody mobil_1020 mobil) {
        return mobil_1020_Service.update(mobil);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return mobil_1020_Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public mobil_1020 getById(@PathVariable("id") Long id){
        return mobil_1020_Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<mobil_1020> getAll(){
        return mobil_1020_Service.getAll();
    }
}

