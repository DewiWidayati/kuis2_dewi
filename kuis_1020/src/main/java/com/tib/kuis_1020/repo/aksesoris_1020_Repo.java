/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tib.kuis_1020.repo;

import com.tib.kuis_1020.entity.aksesoris_1020;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author PC-11-320
 */
public interface aksesoris_1020_Repo extends CrudRepository<aksesoris_1020, Long> {

    @Query("select c from aksesoris_1020 c")
    public List<aksesoris_1020> findAllCategory();
}
