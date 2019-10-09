package com.readingdirary.reading_diary.services;

import java.util.ArrayList;
import java.util.List;

import com.readingdirary.reading_diary.models.Book;
import com.readingdirary.reading_diary.repositories.IBookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {
  @Autowired
  private IBookRepository bookRepository;

  @Override
  public List<Book> findAllBooks() {
    List<Book> books = new ArrayList<>();
    bookRepository.findAll().forEach(books::add);
    return books;
  }
}
