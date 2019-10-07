package com.readingdirary.reading_diary.services;

import java.util.List;

import com.readingdirary.reading_diary.models.Book;

public interface IBookService {

  public List<Book> findAllBooks();
}
