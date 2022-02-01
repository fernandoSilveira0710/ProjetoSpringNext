package br.projetoparticularnext.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.projetoparticularnext.com.model.conta.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{

}
