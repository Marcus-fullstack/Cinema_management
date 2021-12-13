package com.cinemix.management.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;

@Entity
/*@Table(name="movies")*/

public class Movies extends Category_movies {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @javax.persistence.Id
    public Integer Id_category;

    @NotNull
    public String Title;

    @NotNull
    public String Director;

    @NotNull
    @Lob
    public Long Description;

    @NotNull
    public Integer Age_group;

    @NotNull
    public Time Duration_movie;

    @NotNull
    public Integer Session_days;

    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-yyyy")
    public LocalDate Start_days;

    /*
    preciso ver se esses overriders devem ser "puchado" do Id_category ou se o
    id do movie ser "empurrado" para a category_movies ?
    */
    @Override
    public Long getId() {
        return Id;
    }

    @Override
    public void setId(Long id) {
        Id = id;
    }
    /*ate aqui*/

    public Integer getId_category() {
        return Id_category;
    }

    public void setId_category(Integer id_cat) {
        Id_category = id_cat;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String director) {
        this.Director = director;
    }

    public Long getDescription() {
        return Description;
    }

    public void setDescription(Long description) {
        this.Description = description;
    }

    public Integer getAge_group() {
        return Age_group;
    }

    public void setAge_group(Integer age_group) {
        this.Age_group = age_group;
    }

    public Time getDuration_movie() {
        return Duration_movie;
    }

    public void setDuration_movie(Time duration_movie) {
        this.Duration_movie = duration_movie;
    }

    public Integer getSession_days() {
        return Session_days;
    }

    public void setSession_days(Integer session_days) {
        this.Session_days = session_days;
    }

    public LocalDate getStart_days() {
        return Start_days;
    }

    public void setStart_days(LocalDate start_days) {
        this.Start_days = start_days;
    }
}