package com.atguigu.controller;

import com.atguigu.pojo.Book;
import com.atguigu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("book/addBook")
    public String addBook(){
        bookService.addBook(new Book(null,"yy","yy",new BigDecimal("100.00"),1,1));
        return "redirect:/index.jsp";
    }

}
