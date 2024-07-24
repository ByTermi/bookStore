/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookStore.bookStore.repository;

import com.bookStore.bookStore.entity.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Vaquin
 */
@Repository
public interface MyBookRepository extends JpaRepository<MyBookList, Integer>{
    
}
