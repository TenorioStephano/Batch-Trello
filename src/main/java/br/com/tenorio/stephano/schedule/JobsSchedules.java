package br.com.tenorio.stephano.schedule;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.tenorio.stephano.model.Card;
import br.com.tenorio.stephano.service.DemandService;
import br.com.tenorio.stephano.service.ExecutionService;
import br.com.tenorio.stephano.service.TrelloRestService;

@Component
public class JobsSchedules {

	private static final Logger log = LoggerFactory.getLogger(JobsSchedules.class);

	@Autowired
	private TrelloRestService trelloRestService;

	@Autowired
	private DemandService demandService;
	
	@Autowired
	private ExecutionService executionService;
	
	@Scheduled(cron = "${scheduling.job.cron.getNewDemandsOnTrelloAndInsertInDatabase}")
	public void getNewDemandsOnTrelloAndInsertInDatabase() {

		log.info("Starting job of new demands...");

		trelloRestService.getCards()
			.parallelStream()
			.filter(Card::isDemandValid)
			.filter(demandService::notExistsInDatabase)
			.forEach(demandService::save);

		log.info("Finishing job of new demands...");

	}

	@Scheduled(cron = "${scheduling.job.cron.getDemandsAndUpdateNewsStatusOnTrelloAndDatabase}")
	public void getDemandsAndUpdateNewsStatusOnTrelloAndDatabase() {

		log.info("Starting job of update last comments...");
		demandService.findAllDemandNotClosed()
			.parallelStream()
			.forEach(demandService);

		executionService.updateDateExecution();
		
		log.info("Finishing job of update last comments...");

	}

}
