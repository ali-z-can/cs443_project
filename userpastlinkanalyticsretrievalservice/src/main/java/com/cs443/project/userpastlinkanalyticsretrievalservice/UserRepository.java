package com.cs443.project.userpastlinkanalyticsretrievalservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    Collection<StatsOnly> findByUserId(Long UserId);
    List<User> findAll();

    @Query(value = "select sum(number_of_clicks) from user",nativeQuery = true)
    public BigDecimal clicks();

    @Query(value = "select sum(number_of_distinct_links) from user",nativeQuery = true)
    public BigDecimal links();

    int countByUserIdGreaterThan(long id);

}
