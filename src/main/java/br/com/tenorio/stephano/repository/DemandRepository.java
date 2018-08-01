package br.com.tenorio.stephano.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tenorio.stephano.entity.Demand;

@Repository
public interface DemandRepository extends JpaRepository<Demand, String> {
	public List<Demand> findByClosed(boolean closed);
}
