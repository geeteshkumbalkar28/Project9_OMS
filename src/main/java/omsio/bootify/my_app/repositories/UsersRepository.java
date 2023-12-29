package omsio.bootify.my_app.repositories;

import omsio.bootify.my_app.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsersRepository extends JpaRepository<Users, Integer> {
}
