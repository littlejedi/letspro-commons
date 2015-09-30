package com.letspro.commons.domain;

import java.util.Date;
import com.google.common.base.Objects;

public class User {
    
    private Integer id;
    
    private String email;
    
    private String password;
    
    private String developerToken;
    
    private Date created;
    
    private Date updated;
    
    private Date lastLogin;
    
    private Date lastLogout;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDeveloperToken() {
        return developerToken;
    }

    public void setDeveloperToken(String developerToken) {
        this.developerToken = developerToken;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Date getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Date lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Date getLastLogout() {
        return lastLogout;
    }

    public void setLastLogout(Date lastLogout) {
        this.lastLogout = lastLogout;
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("id", id).add("email", email)
                .add("password", password)
                .add("developerToken", developerToken).add("created", created)
                .add("updated", updated).add("lastLogin", lastLogin)
                .add("lastLogout", lastLogout).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, email, password, developerToken, created,
                updated, lastLogin, lastLogout);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof User) {
            User that = (User) object;
            return Objects.equal(this.id, that.id)
                    && Objects.equal(this.email, that.email)
                    && Objects.equal(this.password, that.password)
                    && Objects.equal(this.developerToken, that.developerToken)
                    && Objects.equal(this.created, that.created)
                    && Objects.equal(this.updated, that.updated)
                    && Objects.equal(this.lastLogin, that.lastLogin)
                    && Objects.equal(this.lastLogout, that.lastLogout);
        }
        return false;
    }
}
