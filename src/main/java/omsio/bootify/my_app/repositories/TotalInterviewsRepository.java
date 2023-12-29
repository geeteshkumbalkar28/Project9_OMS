package omsio.bootify.my_app.repositories;

import omsio.bootify.my_app.domain.TotalInterviews;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TotalInterviewsRepository extends JpaRepository<TotalInterviews, Integer> {
}
