package com.readingdirary.reading_diary.models.dto;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDto implements Serializable{
  
  private static final long serialVersionUID = 1L;
  private long id;
  private String userId;
  private String userName;
  private String email;
  private String password;
  private String encryptedPassword;
  private String emailVerificationToken;
  private Boolean emailVerificationStatus = false;

  
}