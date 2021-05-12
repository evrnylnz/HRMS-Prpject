package kodlama.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.hrms.business.abstracts.JobPosetionService;
import kodlama.hrms.entities.concretes.JobPosetions;

@RestController
@RequestMapping("/api/position")
public class JobPosetionController {
	
	private JobPosetionService jobPositionService;
    
	@Autowired
	public JobPosetionController(JobPosetionService jobPositionService) {
		super();
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getall")
	public List<JobPosetions> getAll(){
		return this.jobPositionService.getAll();
	}
	
	

}
