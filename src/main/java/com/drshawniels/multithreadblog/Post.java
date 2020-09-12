package com.drshawniels.multithreadblog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {
    // Instance Variables
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    private Category category;

    // Constructors
    protected Post() {}

    // Getters and Setters
}
