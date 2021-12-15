package com.fs.farms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name = "kinds")
@Entity
public class Kind {
    @Id
    @Column(name = "kind_id")
    Long id;

    String name;


   public Long getId() {
       return id;
   }
   public void setid(Long id) {
       this.id = id;
   }
   public String getName() {
       return name;
   }
   public void setName(String name) {
       this.name = name;
   }
}
