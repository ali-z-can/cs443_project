package com.cs443.project.linkretrievalservice;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LinkRepository extends JpaRepository<Link,Long> {

    Link findByShortUrl(String shortUrl);
    List<Link> findAllByUserId(Long id);
}