package horizonleap.sistema_estacionamento.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import horizonleap.sistema_estacionamento.enums.MetodoPagamento;
import horizonleap.sistema_estacionamento.model.Condutor;
import horizonleap.sistema_estacionamento.service.CondutorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/cadastrarCondutor")
public class CadastrarCondutor {
   @Autowired
   CondutorService service;

   @Operation(summary = "Cadastrar Condutor", tags = { "Cadastro", "Condutor" })
   @PostMapping
   public ResponseEntity<Condutor> cadastrarCondutor(@RequestBody String nome, @RequestBody String endereco, @RequestBody String infoContato,
         String metodoPagamento) {

      return ResponseEntity.ok(service.save(nome, endereco, infoContato, MetodoPagamento.valueOf(metodoPagamento)));
   }

}
