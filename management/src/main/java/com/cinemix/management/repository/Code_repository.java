package com.cinemix.management.repository;

import com.cinemix.management.model.Category_movies;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Code_repository extends JpaRepository<Category_movies, Long> {

}