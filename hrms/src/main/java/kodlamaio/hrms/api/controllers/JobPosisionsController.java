package kodlamaio.hrms.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import kodlamaio.hrms.business.abstracts.JobPosisionServisi;
import kodlamaio.hrms.entities.concretes.JobPosision;



@RestController
@RequestMapping("/api/jobposisions")
public class JobPosisionsController {
	
	private JobPosisionServisi jobPosisionServisi;
	
	@Autowired
	public JobPosisionsController(JobPosisionServisi jobPosisionServisi) {
		super();
		this.jobPosisionServisi = jobPosisionServisi;
	}

	@GetMapping("/getAll")
	public List<JobPosision> getAll(){
		return this.jobPosisionServisi.getAll();
		
	}
		
	
		
		
		
	}
	


