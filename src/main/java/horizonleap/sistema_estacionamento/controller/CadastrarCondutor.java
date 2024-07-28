package horizonleap.sistema_estacionamento.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import horizonleap.sistema_estacionamento.enums.MetodoPagamento;
import horizonleap.sistema_estacionamento.model.Condutor;
import horizonleap.sistema_estacionamento.service.CondutorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/cadastrarCondutor")
public class CadastrarCondutor {
   @Autowired
   CondutorService service;

   @PostMapping
   public ResponseEntity<Condutor> cadastrarCondutor(@RequestBody String nome, String endereco, String infoContato,
         String metodoPagamento) {

      return ResponseEntity.ok(service.save(nome, endereco, infoContato, MetodoPagamento.valueOf(metodoPagamento)));
   }

}
