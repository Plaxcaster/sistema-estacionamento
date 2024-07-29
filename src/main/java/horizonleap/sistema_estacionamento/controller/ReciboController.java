package horizonleap.sistema_estacionamento.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import horizonleap.sistema_estacionamento.model.ReciboDTO;
import horizonleap.sistema_estacionamento.service.ReciboService;

@RestController
@RequestMapping("/Recibo")
public class ReciboController {
    @Autowired
    private ReciboService service;

    
    @GetMapping("/{id_bilhete}")
    public ResponseEntity<ReciboDTO> consultarRecibo(@PathVariable String id_bilhete){
        try {
            ReciboDTO recibo = service.emitirRecibo(Integer.parseInt(id_bilhete));
            return ResponseEntity.ok(recibo);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(null);
        }
    }
    
}
