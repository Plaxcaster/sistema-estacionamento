package horizonleap.sistema_estacionamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import horizonleap.sistema_estacionamento.model.Bilhete;
import horizonleap.sistema_estacionamento.service.BilheteService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/iniciarBilheteFixo")
public class FecharBilhete {

   @Autowired
   BilheteService service;

   @Operation(summary = "Atualizar o campo bilheteAtivo para falso, usado quando o condutor encerra o estacionamento" ,  tags = "Fechar Bilhete")
   @PutMapping("/{id_bilhete}")
    public ResponseEntity<Bilhete> alteraFormaPagamento(@PathVariable String idBilhete) {
        
            Integer idBilheteNumerico = Integer.valueOf(idBilhete);
            Bilhete condutor = service.fecharBilhete(idBilheteNumerico);
            return ResponseEntity.ok(condutor);
        
    }
}
