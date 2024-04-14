package br.com.fiap.academia.resource;

import br.com.fiap.academia.dto.request.LoginRequest;
import br.com.fiap.academia.dto.response.LoginResponse;
import br.com.fiap.academia.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/login")
public class LoginResource {

    @Autowired
    private LoginService loginService;

    @PostMapping("/autenticar")
    public ResponseEntity<LoginResponse> autenticar(@RequestBody LoginRequest request) {
        LoginResponse response = loginService.autenticar(request);
        if (response != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/perfil/{email}/{senha}")
    public ResponseEntity<LoginResponse> getPerfil(@PathVariable String email, @PathVariable String senha) {
        LoginResponse response = loginService.getPerfil(email, senha);
        if (response != null) {
            return ResponseEntity.ok(response);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
