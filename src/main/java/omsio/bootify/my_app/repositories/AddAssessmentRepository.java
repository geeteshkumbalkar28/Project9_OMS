package omsio.bootify.my_app.repositories;

import omsio.bootify.my_app.domain.AddAssessment;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AddAssessmentRepository extends JpaRepository<AddAssessment, Integer> {
}
