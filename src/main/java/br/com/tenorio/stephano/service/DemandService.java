package br.com.tenorio.stephano.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tenorio.stephano.entity.Demand;
import br.com.tenorio.stephano.model.Card;
import br.com.tenorio.stephano.repository.DemandRepository;

@Service
public class DemandService implements Consumer<Demand> {

	@Autowired
	private DemandRepository demandRepository;

	@Autowired
	private ScuaService scuaService;

	@Autowired
	private TrelloRestService trelloRestService;

	public void save(Demand demand) {
		demandRepository.save(demand);
	}

	public void save(List<Demand> demands) {
		demandRepository.saveAll(demands);
	}

	public void save(Card card) {
		save(convertCardToDemand(card));
	}

	public List<Demand> findAllDemandNotClosed() {
		return demandRepository.findByClosed(false);
	}

	private Demand convertCardToDemand(Card card) {
		return new Demand(card.getIdDemand(), card.getId(), card.getName(), card.isClosed());
	}

	public boolean existsInDatabase(Card card) {
		return demandRepository.findById(card.getIdDemand()).isPresent();
	}

	public boolean notExistsInDatabase(Card card) {
		return !existsInDatabase(card);
	}

	private boolean hadUpdate(Demand demandOld, Demand demandNew) {
		return !demandNew.equals(demandOld);
	}

	@Override
	public void accept(Demand demand) {
		Optional<Demand> demandFound = demandRepository.findById(demand.getId());
		if (demandFound.isPresent()) {
			Demand demandScua = scuaService.getLastCommentScua(demandFound.get());
			if (hadUpdate(demandFound.get(), demandScua)) {
				save(demandScua);
				trelloRestService.addComment(demandScua);
			}
		}
	}
}
