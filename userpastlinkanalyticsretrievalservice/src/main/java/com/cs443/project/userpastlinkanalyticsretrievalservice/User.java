package com.cs443.project.userpastlinkanalyticsretrievalservice;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Long userId;
    private String username;
    private String password;
    private BigDecimal numberOfClicks;
    private BigDecimal numberOfDistinctLinks;
    private String role;
    public User() {
    }

    public User(String username, String password, BigDecimal numberOfClicks, BigDecimal numberOfDistinctLinks,String role) {
        this.username = username;
        this.password = password;
        this.numberOfClicks = numberOfClicks;
        this.numberOfDistinctLinks = numberOfDistinctLinks;
        this.role = role;
    }

    public void setRole(String role){
        this.role = role;
    }

    public String getRole(){
        return role;
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

    public void setUsername(String username) {
        this.username = username;
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
