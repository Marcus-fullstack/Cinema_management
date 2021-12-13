package com.cinemix.management.Service.ImplementationService;

import com.cinemix.management.Service.CodeServices;
import com.cinemix.management.model.Category_movies;
import com.cinemix.management.model.Movies;
import com.cinemix.management.repository.Code_repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ImplementationServices implements CodeServices {
    @Autowired
    Code_repository code_repository;

    @Override
    public List<Category_movies> findAll() {
        return Code_repository.findAll();
    }
    @Override
    public List <Movies> findAll() {
        return Code_repository.findAll();
    }

    @Override
    public Category_movies findById(Long Id){
        return Code_repository.findById(Id).get();
    }
    @Override
    public Movies findById(Long Id) {
        return Code_repository.findById(Id).get();
    }

    @Override
    public void save(Movies movies) {
        return Code_repository.save(movies);
    }

    @Override
    public void save(Category_movies category_movies) {
        return Code_repository.save(category_movies);
    }
}
