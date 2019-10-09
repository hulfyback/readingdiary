package com.readingdirary.reading_diary.controllers;

import com.readingdirary.reading_diary.services.IBookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {
  @Autowired
  private IBookService bookService;

  @GetMapping("books")
  public String getBooks(Model model){
    model.addAttribute("books", bookService.findAllBooks());
    return "books";
  }
}
