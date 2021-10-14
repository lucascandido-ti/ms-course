package com.lucascandidocourse.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucascandidocourse.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{

}
