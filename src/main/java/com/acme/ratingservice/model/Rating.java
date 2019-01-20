package com.acme.ratingservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Rating {

  @Id
  private String id;
  private Float mark;
  private String name;
  private String comment;
}
