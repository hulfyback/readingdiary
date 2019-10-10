package com.readingdirary.reading_diary.controllers;

import com.readingdirary.reading_diary.models.dto.UserDto;
import com.readingdirary.reading_diary.models.request.UserDetailsRequestModel;
import com.readingdirary.reading_diary.models.response.UserRest;
import com.readingdirary.reading_diary.services.IUserService;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("users")
public class UserController {

  @Autowired
  IUserService userService;

  @PostMapping
  public UserRest createUser(@RequestBody UserDetailsRequestModel userDetails) {

    UserRest returnValue = new UserRest();
    UserDto userDto = new UserDto();
    BeanUtils.copyProperties(userDetails, userDto);
    UserDto createdUser = userService.createUser(userDto);
    BeanUtils.copyProperties(createdUser, returnValue);
    return returnValue;
  }  
}
