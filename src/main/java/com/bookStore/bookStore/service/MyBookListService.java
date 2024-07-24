/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookStore.bookStore.service;

import com.bookStore.bookStore.entity.MyBookList;
import com.bookStore.bookStore.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Vaquin
 */
@Service
public class MyBookListService {
    
    @Autowired
    private MyBookRepository mybook;
    
    public void saveMyBooks(MyBookList book){
        mybook.save(book);
    }
}
