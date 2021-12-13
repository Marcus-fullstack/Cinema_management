package com.cinemix.management.Service;

import com.cinemix.management.model.Category_movies;
import com.cinemix.management.model.Movies;

import java.util.List;

public interface CodeServices {
    List <Category_movies> findAll();
    Category_movies findById(Long Id);
    void save (Category_movies category_movies);

    List <Movies> findAll();
    Movies findById(Long Id);
    void save(Movies movies);
}
