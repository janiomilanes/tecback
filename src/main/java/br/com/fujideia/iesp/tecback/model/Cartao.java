package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cartao {

    @Id
    @GeneratedValue
    private int id;

    private String numeroCartao;

    private String validadeCartao;

    private String codigoSeguranca;

    private String nomeTitularCartao;


}
