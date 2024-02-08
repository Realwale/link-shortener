package com.waletech.shorturl.service.impl;

import com.waletech.shorturl.entity.Url;
import com.waletech.shorturl.repository.UrlRepository;
import com.waletech.shorturl.service.UrlService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;


@Service
@RequiredArgsConstructor
public class UrlServiceImpl implements UrlService {

    private final UrlRepository repository;

    @Override
    public String createShortLink(Url url) {

        String randomChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        StringBuilder shortLink = new StringBuilder(6);
        Random random = new Random();

        while (shortLink.length() < 6){
            int index = (int) (random.nextFloat() * randomChars.length());
            shortLink.append(randomChars.charAt(index));
        }
        url.setShortUrl(shortLink.toString());
        repository.save(url);
        return "Shortened URL: "+ "http://localhost:8080/s/"+ shortLink;
    }
}
