package com.fs.farms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



import lombok.Data;

@Data
@Entity
@Table(name = "animals")
public class Animals {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "animal_name")
    private String animalName;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "kind_id")
    Kind kind;


    @Column(name = "feed")
    private String feed;

    @Column(name = "legs")
    private int legs;

    @Column(name = "desc")
    private String desc;







    //animal name

  
    
    public String getanimalName() {
        return animalName;
    }
    public void setanimalName(String animalName) {
        this.animalName = animalName;
    }

    public Kind getKind() {
        return kind;
    }
    public void setKind(Kind kind) {
        this.kind = kind;
    }

   
    
    //id
    
    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

//FEED
    public String getFeed() {
        return feed;
    }

     public void setFeed(String feed) {
        this.feed = feed;
    }
   

    //DESCRIPTION

    public void setDesc(String desc) {
        this.desc = desc;
    }
    public String getDesc() {
            return desc;
        }
   
    
    //LEGS

    public int getLegs() {
        return legs;
    }
    public void setLegs(int legs) {
        this.legs = legs;
    }


}

