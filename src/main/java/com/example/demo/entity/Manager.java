package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "id"
)
public class Manager {

    @Id
    @Column
    @GeneratedValue
    private int id;

    @Column
    private String name;

    @ManyToOne
    @JoinColumn(name = "parent_id")
    @JsonManagedReference
    private Manager parentManager;

    @OneToMany(mappedBy = "parentManager")
    @JsonBackReference
    private List<Manager> parents=new ArrayList<>();

}
