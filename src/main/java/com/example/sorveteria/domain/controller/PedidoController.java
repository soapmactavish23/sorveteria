package com.example.sorveteria.domain.controller;

import com.example.sorveteria.domain.service.PedidoService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/pedidos")
public class PedidoController {

    private final PedidoService service;

    @PostMapping("/criar")
    public ResponseEntity<String> createDelivery(@RequestParam String sabor,
                                              @RequestParam String cobertura,
                                              @RequestParam String tipo) {
        String message = service.createDelivery(sabor, cobertura, tipo);
        return ResponseEntity.ok(message);
    }
}
