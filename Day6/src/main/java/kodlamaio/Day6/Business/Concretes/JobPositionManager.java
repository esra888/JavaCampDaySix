package kodlamaio.Day6.Business.Concretes;

import kodlamaio.Day6.Business.Abstracts.JobPositionsService;
import kodlamaio.Day6.DataAccess.Abstracts.JobPositionsDao;
import kodlamaio.Day6.Entities.Concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobPositionManager implements JobPositionsService {

    private JobPositionsDao jobPositionsDao;

    @Autowired
    public JobPositionManager(JobPositionsDao jobPositionsDao) {
        this.jobPositionsDao = jobPositionsDao;
    }

    @Override
    public List<JobPosition> getAll() {
        return this.jobPositionsDao.findAll();
    }
}
