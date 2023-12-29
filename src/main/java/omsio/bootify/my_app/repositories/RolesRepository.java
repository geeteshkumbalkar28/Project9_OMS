package omsio.bootify.my_app.repositories;

import omsio.bootify.my_app.domain.Roles;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RolesRepository extends JpaRepository<Roles, Integer> {
}
