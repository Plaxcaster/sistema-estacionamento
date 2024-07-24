package horizonleap.sistema_estacionamento.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import horizonleap.sistema_estacionamento.model.Cliente;
import horizonleap.sistema_estacionamento.service.clienteService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/cliente")
public class clienteController {
    @Autowired
    private clienteService service;

    @GetMapping
    public ResponseEntity<String> echo() {
        return ResponseEntity.ok("Echo");
    }

    @PostMapping
    public ResponseEntity<Cliente> postMethodName(@RequestBody String nome) {
        return ResponseEntity.ok(service.salvar(nome));
    }
}
