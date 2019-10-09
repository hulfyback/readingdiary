package com.readingdirary.reading_diary.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "users")
public class UserEntity implements Serializable {
  
  private static final long serialVersionUID = 536871008L;
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  @Column(nullable = false)
  private String userId;
  @Column(nullable = false, length = 120)
  private String userName;
  @Column(nullable = false, length = 150)
  private String email;
  @Column(nullable = false)
  private String encryptedPassword;
  private String emailVerificationToken;
  @Column(nullable = false)
  private Boolean emailVerificationStatus = false;  
}
