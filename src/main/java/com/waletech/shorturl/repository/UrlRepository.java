package com.waletech.shorturl.repository;

import com.waletech.shorturl.entity.Url;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UrlRepository extends JpaRepository<Url, Long> {
}
