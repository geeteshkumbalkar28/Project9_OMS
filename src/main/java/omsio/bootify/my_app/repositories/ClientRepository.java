package omsio.bootify.my_app.repositories;

import omsio.bootify.my_app.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientRepository extends JpaRepository<Client, Integer> {
}
