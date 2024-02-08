package com.waletech.shorturl.exception;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ShortUrlExceptionResponse {
    private String time;
    private String message;
    private String path;
    private Integer statusCode;
}
