package br.com.rd.exerciciospring.service;

import br.com.rd.exerciciospring.repository.CupomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service("CupomService")
public class CupomService {

    @Autowired
    private CupomRepository repository;

    public ResponseEntity buscarPorIdCliente(Long idCliente){
        return ResponseEntity.ok().body(repository.findByIdCliente(idCliente));
    }
    public ResponseEntity buscarPorDtVenda(Date dtVenda){
        return ResponseEntity.ok().body(repository.findByDtVenda(dtVenda));
    }
}
