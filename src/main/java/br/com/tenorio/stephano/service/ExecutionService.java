package br.com.tenorio.stephano.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tenorio.stephano.entity.Execution;
import br.com.tenorio.stephano.repository.ExecutionRepository;

@Service
public class ExecutionService {
	
	@Autowired
	private ExecutionRepository executionRepository;

	public Execution getExecution() {
		return executionRepository.findById(1).orElse(new Execution());
	}
	
	public void updateDateExecution() {
		Execution execution = getExecution();
		execution.setDateOfLastExecution(new Date());
		executionRepository.save(execution);
	}
}
