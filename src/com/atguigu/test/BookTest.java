package com.atguigu.test;
import com.atguigu.mapper.BookMapper;
import com.atguigu.pojo.Book;
import com.atguigu.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class BookTest {

    @Autowired
    private BookMapper bookMapper;

    @Test
    public void testAdd(){
        bookMapper.addBook(new Book(null,"xx","xx",new BigDecimal("100.00"),1,1));
    }

    @Autowired
    private BookService bookService;

    @Test
    public void testbookAdd(){
        bookService.addBook(new Book(null,"xx","xx",new BigDecimal("100.00"),1,1));
    }

}
