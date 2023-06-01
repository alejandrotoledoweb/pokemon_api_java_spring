package com.pokemonreview.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pokemon {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String type;

  @OneToMany(mappedBy = "pokemon", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Review> reviews = new ArrayList<Review>();


//  @Data does all this code below for us
//  public Pokemon(int id, String name, String title) {
//    this.id = id;
//    this.name = name;
//    this.type = type;
//  }
//
//  public int getId() {
//    return id;
//  }
//
//  public void setId(int id) {
//    this.id = id;
//  }
//
//  public String getName() {
//    return name;
//  }
//
//  public void setName(String name) {
//    this.name = name;
//  }
//
//  public String getType() {
//    return title;
//  }
//
//  public void setType(String title) {
//    this.title = title;
//  }
}
