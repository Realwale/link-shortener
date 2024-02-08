package com.waletech.shorturl.dto.response;

import com.waletech.shorturl.utils.DateUtils;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class APIResponse<T>{

    private boolean hasError;
    private int statusCode;
    private String message;
    private String time;
    private T data;

    public APIResponse(boolean hasError, int statusCode, String message, T data) {
        this.hasError = hasError;
        this.statusCode = statusCode;
        this.message = message;
        this.time = DateUtils.saveDate(LocalDateTime.now());
        this.data = data;
    }

}

