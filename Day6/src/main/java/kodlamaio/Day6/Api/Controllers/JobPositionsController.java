package kodlamaio.Day6.Api.Controllers;

import kodlamaio.Day6.Business.Abstracts.JobPositionsService;
import kodlamaio.Day6.Entities.Concretes.JobPosition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/jobPositions")
public class JobPositionsController {

    private JobPositionsService jobPositionsService;

    @Autowired
    public JobPositionsController(JobPositionsService jobPositionsService) {
        this.jobPositionsService = jobPositionsService;
    }

    @GetMapping("/getall")
    public List<JobPosition> getAll() {
        return this.jobPositionsService.getAll();
    }
}
