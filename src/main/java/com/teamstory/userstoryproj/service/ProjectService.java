package com.teamstory.userstoryproj.service;

import com.teamstory.userstoryproj.entity.Project;

import java.util.List;

public interface ProjectService {
    List<Project> listAll();
    Project getById(Long id);
    Project save(Project project);
    void delete(Long id);
    Project update(Project project);

}
