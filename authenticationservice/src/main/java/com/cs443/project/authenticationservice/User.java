package com.cs443.project.authenticationservice;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Collection;

@Entity
public class User implements UserDetails {

    @Id
    @GeneratedValue
    private Long userId;
    private String username;
    private String password;
    private BigDecimal numberOfClicks;
    private BigDecimal numberOfDistinctLinks;

    public User() {
    }

    public User(String username, String password, BigDecimal numberOfClicks, BigDecimal numberOfDistinctLinks) {
        this.username = username;
        this.password = password;
        this.numberOfClicks = numberOfClicks;
        this.numberOfDistinctLinks = numberOfDistinctLinks;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public BigDecimal getNumberOfClicks() {
        return numberOfClicks;
    }

    public void setNumberOfClicks(BigDecimal numberOfClicks) {
        this.numberOfClicks = numberOfClicks;
    }

    public BigDecimal getNumberOfDistinctLinks() {
        return numberOfDistinctLinks;
    }

    public void setNumberOfDistinctLinks(BigDecimal numberOfDistinctLinks) {
        this.numberOfDistinctLinks = numberOfDistinctLinks;
    }
}
