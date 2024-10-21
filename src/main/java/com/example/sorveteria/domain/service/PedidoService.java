package com.example.sorveteria.domain.service;

import com.example.sorveteria.core.*;
import com.example.sorveteria.domain.models.Tipo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class PedidoService {

    public String createDelivery(String sabor, String cobertura, String tipo) {

        Sorvete sorveteBase = new SorveteConcreto(sabor, 1.50);
        if (sabor.equals("Chocolate Diet")) {
            sorveteBase = new SorveteConcreto(sabor, 2.00);
        }

        Sorvete sorvete = sorveteBase;

        if (tipo.equals(Tipo.COPO)) {
            sorvete = new Copo();
        } else if (tipo.equals(Tipo.TACA)) {
            sorvete = new Taca();
        } else if (tipo.equals(Tipo.CASQUINHA)) {
            sorvete = new Casquinha();
        }

        if (cobertura.equals(Cobertura.CHOCOLATE)) {
            sorvete = new CoberturaChocolate(sorvete);
        } else if (cobertura.equals(Cobertura.MORANGO)) {
            sorvete = new CoberturaMorango(sorvete);
        } else if (cobertura.equals(Cobertura.CARAMELO)) {
            sorvete = new CoberturaCaramelo(sorvete);
        }

        double precoTotal = calcularPrecoTotal(sorvete);
        String descricao = obterDescricaoPedido(sorvete);

        return "Pedido: " + descricao + " | Preço total: R$ " + precoTotal;
    }

    private double calcularPrecoTotal(Sorvete sorvete) {
        return sorvete.getPreco();
    }

    private String obterDescricaoPedido(Sorvete sorvete) {
        return sorvete.getDescricao();
    }

}
