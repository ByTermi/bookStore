/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookStore.bookStore.controller;

import com.bookStore.bookStore.service.MyBookListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Jaime Novillo
 */
@Controller
public class MyBookListController {
    
    @Autowired
    private MyBookListService service;
    
    @GetMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable("id") Integer id){
        service.deleteById(id);
        return "redirect:/my_books";
    }
}
