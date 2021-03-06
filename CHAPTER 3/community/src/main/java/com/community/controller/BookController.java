package com.community.controller;

import com.community.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String getBookList(Model model) {
        //bookList는 property 이다.
        //bookList는 book이라는 객체를 포함하고있다.
        model.addAttribute("bookList", bookService.getBookList());
        model.addAttribute("bookList2", bookService.getBookList());

        //book은 view 이름
        return "book";
    }
    @GetMapping("/books2")
    public String getInteger(Model model){
        model.addAttribute("bookList3", bookService.getInteger());
        return "book";
    }
}
