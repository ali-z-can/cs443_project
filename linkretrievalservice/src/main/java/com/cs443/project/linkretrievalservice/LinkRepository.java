package com.cs443.project.linkretrievalservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.List;

public interface LinkRepository extends JpaRepository<Link,Long> {

    Link findByShortUrl(String shortUrl);
    List<Link> findAllByUserId(Long id);

    int countByIdGreaterThan(long id);

    @Query(value = "select sum(number_of_clicks) from link ",nativeQuery = true)
    int clicks();
}
