/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookStore.bookStore.controller;



import com.bookStore.bookStore.entity.Book;
import com.bookStore.bookStore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



/**
 *
 * @author Vaquin
 */
@Controller
public class BookController {
    
    @Autowired
    private BookService service;
    
    @GetMapping("/")
    public String home(){
        return "home";
    }
    
    @GetMapping("/book_register")
    public String bookRegister(){
        return "bookRegister";
    }
    
    @GetMapping("/available_books")
    public String getAllBooks(){
        return "bookList";
    }
    
    @GetMapping("/my_books")
    public String getSavedBooks(){
        return "myBooks";
    }
    
    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b){
        service.save(b);
        return "redirect:/available_books";
    }
}
