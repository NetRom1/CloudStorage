package ru.nrv.cloudstorage.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nrv.cloudstorage.dto.LoginInRequest;
import ru.nrv.cloudstorage.dto.LoginInResponse;
import ru.nrv.cloudstorage.service.AuthorizationService;

import javax.validation.Valid;

@RestController
@RequestMapping("/login")
public class LoginController {
    private final AuthorizationService authorizationService;

    public LoginController(AuthorizationService authorizationService) {
        this.authorizationService = authorizationService;
    }

    @PostMapping
    public LoginInResponse login(@Valid @RequestBody LoginInRequest loginInRequest) {
        return authorizationService.login(loginInRequest);
    }
}