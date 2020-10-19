package com.dimanexplore.springbootgradledemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dimanexplore.springbootgradledemo.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
