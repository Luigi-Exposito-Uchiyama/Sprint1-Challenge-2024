package br.com.fiap.academia.resource;

import br.com.fiap.academia.dto.request.CadastroRequest;
import br.com.fiap.academia.dto.response.CadastroResponse;
import br.com.fiap.academia.service.CadastroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cadastro")
public class CadastroResource {

    @Autowired
    private CadastroService cadastroService;

    @PostMapping("/cadastrar")
    public ResponseEntity<CadastroResponse> cadastrar(@RequestBody @Valid CadastroRequest request) {
        CadastroResponse response = cadastroService.cadastrar(request);
        if (response != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<CadastroResponse> getPerfil(@PathVariable Long id) {
        CadastroResponse response = cadastroService.getPerfil(id);
        if (response != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
