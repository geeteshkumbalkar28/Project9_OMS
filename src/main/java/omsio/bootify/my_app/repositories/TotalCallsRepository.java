package omsio.bootify.my_app.repositories;

import omsio.bootify.my_app.domain.TotalCalls;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TotalCallsRepository extends JpaRepository<TotalCalls, Integer> {
}
