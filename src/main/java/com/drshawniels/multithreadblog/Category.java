package com.drshawniels.multithreadblog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Category {
    // Instance Variables
    @Id
    @GeneratedValue
    private Long id;
    private String categoryName;
    @OneToMany(mappedBy = "category")
    private Collection<Post> posts;

    // Constructors
    protected Category() {}

    // Getters and Setters
}
