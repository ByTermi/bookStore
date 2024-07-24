/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bookStore.bookStore.controller;



import com.bookStore.bookStore.entity.Book;
import com.bookStore.bookStore.entity.MyBookList;
import com.bookStore.bookStore.service.BookService;
import com.bookStore.bookStore.service.MyBookListService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;



/**
 *
 * @author Vaquin
 */
@Controller
public class BookController {
    
    @Autowired
    private BookService service;
    
    @Autowired
    private MyBookListService myBookService;
    
    @GetMapping("/")
    public String home(){
        return "home";
    }
    
    @GetMapping("/book_register")
    public String bookRegister(){
        return "bookRegister";
    }
    
    @GetMapping("/available_books")
    public ModelAndView getAllBooks(){
        List<Book> list = service.getAllBooks();
        return new ModelAndView("bookList", "book", list);
    }
    

    
    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b){
        service.save(b);
        return "redirect:/available_books";
    }
    
    @GetMapping("/my_books")
    public String getMyBooks(Model model){
        List<MyBookList> list = myBookService.getAllMyBooks();
        model.addAttribute("book", list);
        return "myBooks";
    }
    
    @GetMapping("/myList/{id}")
    public String getMyList(@PathVariable("id") Integer id){
        Book b = service.getBookById(id);
        MyBookList mb = new MyBookList(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
        myBookService.saveMyBooks(mb);
        return "redirect:/my_books";
    }
    
    @GetMapping("/editBook/{id}")
    public String editBook(@PathVariable("id") Integer id, Model model){
        Book b=service.getBookById(id);
        model.addAttribute("book", b);
        return "editBook";
    }
    
    @GetMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id") Integer id){
        service.deleteById(id);
        return "redirect:/available_books";
    }
    
}
