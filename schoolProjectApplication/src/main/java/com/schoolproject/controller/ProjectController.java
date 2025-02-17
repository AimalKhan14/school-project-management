package com.schoolproject.controller;

import com.schoolproject.model.Project;
import com.schoolproject.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/projects")
public class ProjectController {
    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public String viewProjects(Model model) {
        model.addAttribute("projects", projectService.getAllProjects()); // Fetch all projects
        return "view-projects"; // Render view-projects.html
    }

    @GetMapping("/add")
    public String showAddProjectForm(Model model) {
        model.addAttribute("project", new Project()); // Add empty project object to the form
        return "add-project"; // Render add-project.html
    }

    @PostMapping("/add")
    public String addProject(@ModelAttribute Project project) {
        projectService.addProject(project); // Save the new project
        return "redirect:/projects"; // Redirect to the projects list
    }

    @GetMapping("/delete/{id}")
    public String deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id); // Delete the project by ID
        return "redirect:/projects"; // Redirect to the projects list
    }
}