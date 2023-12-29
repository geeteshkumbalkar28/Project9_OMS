package omsio.bootify.my_app.repositories;

import omsio.bootify.my_app.domain.Task;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TaskRepository extends JpaRepository<Task, Integer> {
}
