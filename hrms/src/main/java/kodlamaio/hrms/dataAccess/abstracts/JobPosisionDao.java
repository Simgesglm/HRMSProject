package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.JobPosision;

public interface JobPosisionDao extends JpaRepository<JobPosision, Integer>{

}
