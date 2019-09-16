package com.readingdirary.reading_diary.controllers;

import com.readingdirary.reading_diary.services.IBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {
  @Autowired
  private IBookService bookService;

  @GetMapping("/add_new_book")
  public String addBook(){
    return "add_new_book";
  }

  @PostMapping("/add_new_book")
  public String postBook(String title){
    bookService.saveBook(title);
    return "redirect:/books";
  }

  @GetMapping("books")
  public String getBooks(Model model){
    model.addAttribute("books", bookService.findAllBooks());
    return "books";
  }
}
