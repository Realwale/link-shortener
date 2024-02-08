package com.waletech.shorturl.dto.request;

import com.waletech.shorturl.exception.CustomException;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UrlRequest {

    private String originalUrl;


    public void validateShortLinkRequest() throws CustomException {
        List<String> errors = new ArrayList<>();

        validateOriginalUrl(originalUrl, errors);

        if (!errors.isEmpty()) {
            throw new CustomException(String.join(", ", errors));
        }
    }

    private static void validateOriginalUrl(String originalUrl, List<String> errors){
        if ( originalUrl==null || originalUrl.trim().isEmpty()){
            errors.add("URL cannot be empty.");
        }
    }
}
