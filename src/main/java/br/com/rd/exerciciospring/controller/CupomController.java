package br.com.rd.exerciciospring.controller;

import br.com.rd.exerciciospring.service.CupomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class CupomController {
    @Autowired
    private CupomService service;

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("cupom/id-cliente{idCliente}")
    public ResponseEntity findByIdCliente(@PathVariable ("idCliente") Long idCliente ){
        return service.buscarPorIdCliente(idCliente);
    }
    @GetMapping("cupom/dt-venda{dtVenda}")
    public ResponseEntity findByDtVenda(@PathVariable ("dtVenda") Date dtVenda){
        return service.buscarPorDtVenda(dtVenda);
    }

}
