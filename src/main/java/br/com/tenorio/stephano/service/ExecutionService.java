package br.com.tenorio.stephano.service;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

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
		TimeZone tz = TimeZone.getTimeZone("America/Sao_Paulo");
		TimeZone.setDefault(tz);
		Calendar ca = GregorianCalendar.getInstance(tz);
		execution.setDateOfLastExecution(ca.getTime());
		executionRepository.save(execution);
	}
}
