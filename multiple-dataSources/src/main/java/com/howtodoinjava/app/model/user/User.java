package com.howtodoinjava.app.model.user;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "users_table")
public class User {

  @Id
  @Column(name = "id")
  private Integer id;

  @Column(name = "first_name")
  private String firstName;

  @Column(name = "last_name")
  private String lastName;

  @Column(name = "email")
  private String email;
  
  @Column(name = "status")
  private String status;
  
  @Column(name = "name")
  private String name;
}
