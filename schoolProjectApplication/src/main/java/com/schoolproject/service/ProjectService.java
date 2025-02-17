package com.schoolproject.service;

import com.schoolproject.model.Project;
import com.schoolproject.repository.ProjectRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll(); // Fetch all projects from the database
    }

    public void addProject(Project project) {
        projectRepository.save(project); // Save a new project to the database
    }

    public Project getProjectById(Long id) {
        return projectRepository.findById(id).orElse(null); // Fetch a project by ID
    }

    public void deleteProject(Long id) {
        projectRepository.deleteById(id); // Delete a project by ID
    }
}