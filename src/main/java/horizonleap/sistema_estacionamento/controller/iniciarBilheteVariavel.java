package horizonleap.sistema_estacionamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import horizonleap.sistema_estacionamento.model.Bilhete;
import horizonleap.sistema_estacionamento.service.BilheteService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/iniciarBilheteVariavel")
public class IniciarBilheteVariavel {
   @Autowired
   BilheteService service;

   @Operation(summary = "Gerar um Bilhete de tempo variavel para o veículo", tags = "Gerar Bilhete")
   @PostMapping
   public ResponseEntity<Bilhete> iniciarBilheteVariavel(@RequestBody int veiculoId) {

      return ResponseEntity.ok(service.salvarBilheteVariavel(veiculoId));
   }
}