package omsio.bootify.my_app.repositories;

import omsio.bootify.my_app.domain.Interview;
import org.springframework.data.jpa.repository.JpaRepository;


public interface InterviewRepository extends JpaRepository<Interview, Integer> {
}
