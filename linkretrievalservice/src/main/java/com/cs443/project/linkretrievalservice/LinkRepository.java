package com.cs443.project.linkretrievalservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link,Long> {

    Link findByShortUrl(String shortUrl);
}
