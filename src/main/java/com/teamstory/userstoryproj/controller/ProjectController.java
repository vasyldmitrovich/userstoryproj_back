package com.teamstory.userstoryproj.controller;

import com.teamstory.userstoryproj.entity.Project;
import com.teamstory.userstoryproj.service.ProjectService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/projects")
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    List<Project> getAll() {
        return projectService.listAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Project create(@Valid @RequestBody Project project) {
        return projectService.save(project);
    }

    @GetMapping("/{id:[\\d]+}")
    Optional<Project> getProject(@PathVariable Long id) {
        return projectService.getById(id);
    }

    @PatchMapping("/{id:[\\d]+}")
    Project update(@Valid @RequestBody Project project) {
        return projectService.update(project);
    }

    @DeleteMapping("/{id:[\\d]+}")
    void delete(@PathVariable Long id) {
        projectService.delete(id);
    }
}
