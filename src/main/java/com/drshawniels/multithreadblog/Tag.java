package com.drshawniels.multithreadblog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Tag {
    // Instance Variables
    @Id
    @GeneratedValue
    private Long id;

    // Constructors
    protected Tag() {}

    // Getters and Setters

}
