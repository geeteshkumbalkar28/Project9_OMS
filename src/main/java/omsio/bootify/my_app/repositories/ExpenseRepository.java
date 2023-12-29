package omsio.bootify.my_app.repositories;

import omsio.bootify.my_app.domain.Expense;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ExpenseRepository extends JpaRepository<Expense, Integer> {
}
