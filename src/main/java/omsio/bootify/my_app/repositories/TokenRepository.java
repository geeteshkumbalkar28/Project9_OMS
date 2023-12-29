package omsio.bootify.my_app.repositories;

import omsio.bootify.my_app.domain.Token;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TokenRepository extends JpaRepository<Token, Integer> {
}
