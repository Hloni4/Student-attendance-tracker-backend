package Repository;

import Model.Educator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducatorRepository extends JpaRepository<Educator, Long> {
}
