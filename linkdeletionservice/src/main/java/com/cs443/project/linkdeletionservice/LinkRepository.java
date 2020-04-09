package com.cs443.project.linkdeletionservice;

import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.util.List;

public interface LinkRepository extends JpaRepository<Link,Long> {

    Link findByShortUrl(String shortUrl);
    Link findByLongUrl(String longUrl);
    List<Link> findAllByExpirationIsBefore(Date date);
}
