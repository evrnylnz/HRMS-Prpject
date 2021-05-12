package kodlama.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "job_posetions")
public class JobPosetions {
	
	@Id
	@GeneratedValue
	@Column(name = "posetion_id")
	private int posetionId;
	
	@Column(name = "posetion_name")
	private String posetionName;

}
