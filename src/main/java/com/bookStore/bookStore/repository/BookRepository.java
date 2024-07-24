/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookStore.bookStore.repository;

import com.bookStore.bookStore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jaime Novillo
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
    
}
