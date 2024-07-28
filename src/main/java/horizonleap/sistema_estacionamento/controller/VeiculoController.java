package horizonleap.sistema_estacionamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import horizonleap.sistema_estacionamento.model.Veiculo;
import horizonleap.sistema_estacionamento.service.VeiculoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/Veiculo")
public class VeiculoController {
    @Autowired
    private VeiculoService service;

    @GetMapping
    public ResponseEntity<String> echo() {
        return ResponseEntity.ok("Echo");
    }

    @PostMapping
    public ResponseEntity<Veiculo> postMethodName(@RequestBody String nomeModelo , String placa , int id_condutor) {
        return ResponseEntity.ok(service.salvar(nomeModelo, placa, id_condutor));
    }
}