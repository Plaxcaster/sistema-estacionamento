package horizonleap.sistema_estacionamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import horizonleap.sistema_estacionamento.model.Condutor;
import horizonleap.sistema_estacionamento.model.dadosCondutorDTO;
import horizonleap.sistema_estacionamento.service.CondutorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/condutor")
public class CondutorController {

    @Autowired
    private CondutorService service;

    @Operation(summary = "Consultar dados do Condutor", tags = { "Consulta", "Condutor" })
    @GetMapping("/{id_condutor}")
    public ResponseEntity<Condutor> busca(@PathVariable Integer id_condutor) {

        return ResponseEntity.ok(service.busca(id_condutor));

    }

    @Operation(summary = "Consultar dados do Condutor e seus carros", tags = { "Consulta", "Condutor" })
    @GetMapping("/dadosCondutor/{id_condutor}")
    public ResponseEntity<dadosCondutorDTO> consultarDadosCondutor(@PathVariable Integer id_condutor) {

        return ResponseEntity.ok(service.consultarDadosCondutor(id_condutor));
    }

    @Operation(summary = "Altera a forma de pagamento preferida do condutor", tags = { "Alteração", "Condutor" })
    @PutMapping("/{id_condutor}")
    public ResponseEntity<Condutor> putMethodName(@PathVariable String id_condutor, @RequestBody String formaPagamento) {

        try {
            Integer idCondutor = Integer.valueOf(id_condutor);

            Condutor condutor = service.updateFormaPagamento(idCondutor, formaPagamento);
            return ResponseEntity.ok(condutor);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new Condutor());
        }
    }
}