package com.teamstory.userstoryproj.service;

import com.teamstory.userstoryproj.entity.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectService {
    List<Project> listAll();
    Optional<Project> getById(Long id);
    Project save(Project project);
    void delete(Long id);
    Project update(Project project);

}
