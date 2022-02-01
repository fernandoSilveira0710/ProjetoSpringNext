package br.projetoparticularnext.com.repository.cartao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.projetoparticularnext.com.model.cartao.Apolice;

@Repository
public interface ApoliceRepository extends JpaRepository<Apolice, Long> {

}
