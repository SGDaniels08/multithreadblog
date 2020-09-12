package com.drshawniels.multithreadblog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Creator {
    // Instance Variables
    @Id
    @GeneratedValue
    private Long id;

    // Constructors
    protected Creator() {}

    // Getters and Setters
}
