package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPosisionServisi;
import kodlamaio.hrms.dataAccess.abstracts.JobPosisionDao;
import kodlamaio.hrms.entities.concretes.JobPosision;

@Service
public class JobPosisionManager implements JobPosisionServisi {
	
	private JobPosisionDao jobPosisionDao;

	@Autowired
	public JobPosisionManager(JobPosisionDao jobPosisionDao) {
		super();
		this.jobPosisionDao = jobPosisionDao;
	}

	@Override
	public List<JobPosision> getAll() {
		
		return this.jobPosisionDao.findAll();
	}

}
