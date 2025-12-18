package com.teamstory.userstoryproj.controller;

import java.util.List;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.teamstory.userstoryproj.entity.Project;
import com.teamstory.userstoryproj.service.ProjectService;

@Controller
public class HomeController {
    
    private final ProjectService projectService;

    public HomeController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/")
    public String home(Model model) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        boolean isAuthenticated = auth != null && auth.isAuthenticated() && !auth.getName().equals("anonymousUser");
        model.addAttribute("isAuthenticated", isAuthenticated);
        return "index"; // Render index.html
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // Render login.html
    }

    @GetMapping("/userpage")
    @PreAuthorize("hasRole('USER')")
    public String getAllProjects(Model model) {
        model.addAttribute("message", "Hello this is message for userpage page!");
        return "userpage";
    }

    @GetMapping("/adminpage")
    @PreAuthorize("hasRole('ADMIN')") // Only admins can open this page
    public String adminPage(Model model) {
        List<Project> projects = projectService.listAll();
        model.addAttribute("projects", projects);
        return "adminpage";
    }
}
