package com.readingdirary.reading_diary.services;

import com.readingdirary.reading_diary.models.dto.UserDto;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends UserDetailsService {

  UserDto createUser(UserDto userDto);  
}
