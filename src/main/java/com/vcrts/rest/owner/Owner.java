package com.vcrts.rest.owner;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table
public class Owner {
    @Id
    @SequenceGenerator(
           name ="owner_sequence",
            sequenceName = "owner_sequence",
            allocationSize = 1)

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "owner_sequence"
    )


    private Long id;
    private String name;
    private LocalDate dob;
    private String email;
    private String model;

 public Owner(){

 }
 public Owner(Long id,
              String name,
              LocalDate dob,
              String email,
              String model ){
     this.id = id;
     this.name = name;
     this.dob = dob;
     this.email = email;
     this.model =  model;


 }

    public Owner(String name, LocalDate dob, String email, String model ) {
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.model = model;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }






    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", email='" + email + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
