package io.github.igorrllima.vendas.model;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Client {

    private String nome;
    @Setter(AccessLevel.MODULE.NONE)//Não permite ao lombok criar os setter
    private double Saldo;
}
