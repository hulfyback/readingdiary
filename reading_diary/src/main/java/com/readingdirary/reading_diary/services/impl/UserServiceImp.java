package com.readingdirary.reading_diary.services.impl;

import java.util.ArrayList;

import com.readingdirary.reading_diary.models.dto.UserDto;
import com.readingdirary.reading_diary.models.entity.UserEntity;
import com.readingdirary.reading_diary.repositories.IUserRepository;
import com.readingdirary.reading_diary.services.IUserService;
import com.readingdirary.reading_diary.utility.Utils;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements IUserService {

  @Autowired
  IUserRepository userRepository;

  @Autowired
  Utils utils;

  @Autowired
  BCryptPasswordEncoder bCryptPasswordEncoder;

  @Override
  public UserDto createUser(UserDto user) {

    if (userRepository.findByEmail(user.getEmail()) != null)
      throw new RuntimeException("Record already exists");

    UserEntity userEntity = new UserEntity();
    BeanUtils.copyProperties(user, userEntity);

    String publicUserId = utils.generateId(30);
    userEntity.setEncryptedPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    userEntity.setUserId(publicUserId);

    UserEntity storedUserDetails = userRepository.save(userEntity);

    UserDto returnValue = new UserDto();
    BeanUtils.copyProperties(storedUserDetails, returnValue);

    return returnValue;
  }

  @Override
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    UserEntity userEntity = userRepository.findByEmail(email);
    if (userEntity == null) throw new UsernameNotFoundException(email);
    return new User(userEntity.getEmail(), userEntity.getEncryptedPassword(), new ArrayList<>());
  }
}