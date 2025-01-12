package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.models.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{
  List<Project> findByName(String name);
  List<Project> findByNameContaining(String name);
  @Query("SELECT p FROM Project p JOIN p.list_of_users u WHERE u.id=:id_user")
  List<Project> findByUserId(int id_user);
}
