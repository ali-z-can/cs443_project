package com.cs443.project.userpastlinkanalyticsretrievalservice;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface UserRepository extends JpaRepository<User,Long> {

    Collection<StatsOnly> findByUserId(Long UserId);
}
