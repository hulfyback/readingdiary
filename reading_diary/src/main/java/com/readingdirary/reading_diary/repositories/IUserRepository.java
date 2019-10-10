package com.readingdirary.reading_diary.repositories;

import com.readingdirary.reading_diary.models.entity.UserEntity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends CrudRepository<UserEntity, Long> {  
  UserEntity findByEmail(String email);
}
