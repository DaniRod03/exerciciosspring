package br.com.rd.exerciciospring.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_cupom")
public class Cupom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "id_cliente")
    private Long idCliente;

    @NotNull
    @Column(name = "dt_venda")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtVenda;

    @NotNull
    @Column(name = "vl_venda")
    private BigDecimal vlVenda;


}
