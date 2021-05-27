package kodlamaio.Day6.Business.Abstracts;

import kodlamaio.Day6.Entities.Concretes.JobPosition;

import java.util.List;

public interface JobPositionsService {
    List<JobPosition> getAll();
}
