package com.atguigu.service;

import com.atguigu.mapper.BookMapper;
import com.atguigu.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    public void addBook(Book book){
        bookMapper.addBook(book);
        //int i = 10 / 0;
        //bookMapper.addBook(book);
    }
}
