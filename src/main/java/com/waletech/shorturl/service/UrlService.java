package com.waletech.shorturl.service;

import com.waletech.shorturl.entity.Url;

public interface UrlService {

    String createShortLink(Url url);
}
