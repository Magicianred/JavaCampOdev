package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobService;
import kodlamaio.hrms.entities.concretes.Job;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {
	private JobService jobService;

	public JobsController(JobService jobService) {
		super();
		this.jobService = jobService;
	}

	@GetMapping("/getall")
	public List<Job> getAll() {

		return this.jobService.getJobAll();

	}

}
