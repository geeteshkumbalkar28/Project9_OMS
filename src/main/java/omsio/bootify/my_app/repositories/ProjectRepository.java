package omsio.bootify.my_app.repositories;

import omsio.bootify.my_app.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProjectRepository extends JpaRepository<Project, Integer> {
}
