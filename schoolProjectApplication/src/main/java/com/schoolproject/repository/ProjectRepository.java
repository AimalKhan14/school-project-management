package com.schoolproject.repository;

import com.schoolproject.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    // No need to define methods; JpaRepository provides CRUD operations
}