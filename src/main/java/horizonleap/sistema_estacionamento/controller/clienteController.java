package horizonleap.sistema_estacionamento.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cliente")
public class clienteController {

    @GetMapping
    public ResponseEntity<String> echo() {
        return ResponseEntity.ok("Echo");
    }
}
