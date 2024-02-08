package com.waletech.shorturl.dto.response;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class UrlAPIResponse <T>{

    private boolean hasError;
    private int statusCode;
    private String message;
    private T data;

    public UrlAPIResponse(boolean hasError, int statusCode, String message, T data) {
        this.hasError = hasError;
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }

}

