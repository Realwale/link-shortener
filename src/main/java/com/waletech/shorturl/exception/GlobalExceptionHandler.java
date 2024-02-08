package com.waletech.shorturl.exception;

import com.waletech.shorturl.dto.response.APIResponse;
import com.waletech.shorturl.utils.DateUtils;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity<ShortUrlExceptionResponse> handleCustomException(CustomException e,
                                                                                            HttpServletRequest request){
        ShortUrlExceptionResponse exceptionResponse = ShortUrlExceptionResponse.builder()
                .time(DateUtils.saveDate(LocalDateTime.now()))
                .message(e.getMessage())
                .statusCode(HttpStatus.BAD_REQUEST.value())
                .path(request.getRequestURI())
                .build();
        return new ResponseEntity<>(exceptionResponse,HttpStatus.BAD_REQUEST);
    }
}
