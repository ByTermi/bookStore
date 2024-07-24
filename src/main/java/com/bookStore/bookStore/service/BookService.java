/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookStore.bookStore.service;

import com.bookStore.bookStore.entity.Book;
import com.bookStore.bookStore.repository.BookRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Vaquin
 */

@Service
public class BookService {
    
    @Autowired
    private BookRepository bRepo;
    
    public void save (Book b){
        bRepo.save(b);
    }
    
    public List<Book> getAllBooks(){
        return bRepo.findAll();
    }
    
    public Book getBookById(Integer id){
        return bRepo.findById(id).get();
    }
    
    public void deleteById(Integer id){
        bRepo.deleteById(id);
    }
}
