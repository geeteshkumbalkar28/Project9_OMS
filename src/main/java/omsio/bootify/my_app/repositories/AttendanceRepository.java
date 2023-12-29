package omsio.bootify.my_app.repositories;

import omsio.bootify.my_app.domain.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
}
