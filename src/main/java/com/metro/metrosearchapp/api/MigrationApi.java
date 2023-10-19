package com.metro.metrosearchapp.api;

import com.metro.metrosearchapp.dto.LoginRequest;
import com.metro.metrosearchapp.service.MigrationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/migration")
@RequiredArgsConstructor
public class MigrationApi {

    private final MigrationService migrationService;

    @PostMapping
    public void migrate(@RequestBody LoginRequest loginRequest) {
        if (loginRequest.isValid()) {
            migrationService.migrate();
        } else {
            System.out.println("Invalid credentials");
        }
    }
}
