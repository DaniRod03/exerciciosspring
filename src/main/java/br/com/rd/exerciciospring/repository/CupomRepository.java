package br.com.rd.exerciciospring.repository;

import br.com.rd.exerciciospring.model.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CupomRepository extends JpaRepository<Cupom, Long> {
    Cupom findByIdCliente(Long codigo);
    List<Cupom> findByDtVenda(Date dataVenda);
}