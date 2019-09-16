package com.readingdirary.reading_diary.repositories;

import com.readingdirary.reading_diary.models.Book;

import org.springframework.data.repository.CrudRepository;

public interface IBookRepository extends CrudRepository<Book, Long> {
  
}
