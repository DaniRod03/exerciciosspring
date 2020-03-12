package br.com.rd.exerciciospring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_cupom_item")
public class CupomItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCupomItem;

    @NotNull
    @JoinColumn(name = "id")
    private Cupom idCupom;

    @NotNull
    @JoinColumn(name = "idProd")
    private Produto idProduto;

    @NotNull
    @Column(name = "qtd_produto")
    private Long qtdProduto;

    @NotNull
    @Column(name = "vl_produto")
    private BigDecimal vlProd;





}
