package kodlama.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.hrms.business.abstracts.JobPosetionService;
import kodlama.hrms.dataAccess.abstracts.JobPosetionDao;
import kodlama.hrms.entities.concretes.JobPosetions;

@Service
public class JobPosetionManager implements JobPosetionService{
	
	private JobPosetionDao jobPositionDao;
	
    @Autowired
	public JobPosetionManager(JobPosetionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public List<JobPosetions> getAll() {
		
		return this.jobPositionDao.findAll();
	}
	
	
	
	

}
