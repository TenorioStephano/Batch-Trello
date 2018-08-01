package br.com.tenorio.stephano.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.tenorio.stephano.entity.Execution;

@Repository
public interface ExecutionRepository extends JpaRepository<Execution, Integer> {

}
