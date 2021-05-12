package kodlama.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.hrms.entities.concretes.JobPosetions;

public interface JobPosetionDao extends JpaRepository<JobPosetions, Integer>{

}
