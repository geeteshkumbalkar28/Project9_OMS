package omsio.bootify.my_app.repositories;

import omsio.bootify.my_app.domain.Leaves;
import org.springframework.data.jpa.repository.JpaRepository;


public interface LeavesRepository extends JpaRepository<Leaves, Integer> {
}
