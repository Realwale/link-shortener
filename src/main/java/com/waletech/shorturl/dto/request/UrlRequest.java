package com.waletech.shorturl.dto.request;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UrlRequest {

    @NotEmpty(message = "Invalid url")
    private String originalUrl;
}
