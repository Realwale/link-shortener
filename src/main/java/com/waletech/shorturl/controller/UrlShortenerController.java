package com.waletech.shorturl.controller;


import com.waletech.shorturl.dto.request.UrlRequest;
import com.waletech.shorturl.dto.response.APIResponse;
import com.waletech.shorturl.entity.Url;
import com.waletech.shorturl.exception.CustomException;
import com.waletech.shorturl.service.UrlService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/link")
public class UrlShortenerController {

    private final UrlService urlService;

    @PostMapping("/shorten")
    public ResponseEntity<APIResponse<String>> createShortLink(@RequestBody UrlRequest request) throws CustomException {
        request.validateShortLinkRequest();
        Url url = Url.builder()
                .originalUrl(request.getOriginalUrl())
                .build();

        String shortLink = urlService.createShortLink(url);
        APIResponse<String> response = new APIResponse<>(false, HttpStatus.CREATED.value(), "Short link created successfully", shortLink);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
