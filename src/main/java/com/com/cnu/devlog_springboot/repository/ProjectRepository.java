package com.com.cnu.devlog_springboot.repository;

import com.com.cnu.devlog_springboot.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Integer> {
//    Project save(Project Project);
//    List<Project> findAll();
//    Optional<Project> findById(Integer ProjectId);
//    void delete(Project Project);
}
