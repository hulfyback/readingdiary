package com.readingdirary.reading_diary.services;

import java.util.List;

import com.readingdirary.reading_diary.models.Book;

public interface IBookService {

  public void saveBook(String title);
  public List<Book> findAllBooks();
}
