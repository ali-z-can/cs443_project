package com.cs443.project.linkstoreservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link,Long> {

    Link findByShortUrl(String shortUrl);
    Link findByLongUrl(String longUrl);
}
