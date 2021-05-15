package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name =("job_posision"))
public class JobPosision {
	
	@Column(name=("id"))
	@GeneratedValue
	@Id
	private int id;
	
	@Column(name="employer_id")
	private String employerId;
	
	@Column(name="posision")
	private String posision;
	
	public JobPosision() {
		super();
	}

	public JobPosision(int id, String employerId, String posision) {
		super();
		this.id = id;
		this.employerId = employerId;
		this.posision = posision;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployerId() {
		return employerId;
	}

	public void setEmployerId(String employerId) {
		this.employerId = employerId;
	}

	public String getPosision() {
		return posision;
	}

	public void setPosision(String posision) {
		this.posision = posision;
	}
	
	

}
