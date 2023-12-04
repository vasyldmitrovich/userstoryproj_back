package com.teamstory.userstoryproj.repository;

import com.teamstory.userstoryproj.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project,Long> {
}
