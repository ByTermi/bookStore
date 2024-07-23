/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookStore.bookStore.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



/**
 *
 * @author Vaquin
 */
@Controller
public class BookController {
    
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
}
