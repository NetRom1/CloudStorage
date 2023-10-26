package ru.nrv.cloudstorage.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nrv.cloudstorage.dto.FileDescriptionInResponse;
import ru.nrv.cloudstorage.service.AuthorizationService;
import ru.nrv.cloudstorage.service.FileService;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@RestController
@RequestMapping("/list")
@Validated
public class FileListController {
    private final FileService fileService;
    private final AuthorizationService authorizationService;

    public FileListController(FileService fileService, AuthorizationService authorizationService) {
        this.fileService = fileService;
        this.authorizationService = authorizationService;
    }

    @GetMapping
    public List<FileDescriptionInResponse> getFileList(@RequestHeader("auth-token")
                                                           @NotBlank String authToken, @Min(1) int limit) {
        authorizationService.checkToken(authToken);
        return fileService.getFileList(limit);
    }
}