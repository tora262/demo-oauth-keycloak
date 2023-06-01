package tech.tora.keycloakoauth.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    //    http://localhost:9090/login/oauth2/code/employee-management-api
    @GetMapping("/login/oauth2/code/employee-management-api")
    public ResponseEntity<String> authenticate(@RequestParam("code") String code) {
        return ResponseEntity.ok(code);
    }
}

