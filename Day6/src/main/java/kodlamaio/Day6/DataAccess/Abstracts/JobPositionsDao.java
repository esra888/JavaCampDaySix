package kodlamaio.Day6.DataAccess.Abstracts;

import kodlamaio.Day6.Entities.Concretes.JobPosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPositionsDao extends JpaRepository<JobPosition,Integer> {
}
