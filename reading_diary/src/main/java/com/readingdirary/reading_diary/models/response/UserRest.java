package com.readingdirary.reading_diary.models.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserRest {

  private String userId;
  private String userName;
  private String email;
}