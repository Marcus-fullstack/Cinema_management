package com.cinemix.management.model;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name="category_movies")

public class Category_movies {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Long Id;

    @NotNull
    public String category;

    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        Id = Id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @ManyToOne
    @JoinColumn(name = "movies_id")
    private Movies movies;

    public Movies getMovies() {
        return movies;
    }

    public void setMovies(Movies movies) {
        this.movies = movies;
    }
}
