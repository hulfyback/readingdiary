package com.readingdirary.reading_diary.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import com.readingdirary.reading_diary.models.dto.UserDto;

public interface IUserService extends UserDetailsService {

	UserDto createUser(UserDto userDto);
}
