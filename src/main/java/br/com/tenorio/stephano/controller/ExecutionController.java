package br.com.tenorio.stephano.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tenorio.stephano.entity.Execution;
import br.com.tenorio.stephano.schedule.JobsSchedules;
import br.com.tenorio.stephano.service.ExecutionService;

@RestController
@RequestMapping("/execution")
public class ExecutionController {
	
	@Autowired
	private ExecutionService executionService;
	
	@Autowired
	private JobsSchedules jobsSchedules;
	
	@GetMapping("/last")
	public Execution lastExecution() {
		return executionService.getExecution();
	}
	
	@PostMapping("/executeNow")
	public void executeNow() {
		jobsSchedules.getDemandsAndUpdateNewsStatusOnTrelloAndDatabase();
	}
}
