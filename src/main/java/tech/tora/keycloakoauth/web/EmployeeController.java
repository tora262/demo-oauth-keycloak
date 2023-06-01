package tech.tora.keycloakoauth.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    @GetMapping()
    public ResponseEntity<List<String>> getUsers() {
        return ResponseEntity.ok(List.of("Hieu", "Tora"));
    }
}
