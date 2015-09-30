package com.letspro.commons.domain;

import com.google.common.base.Objects;

public class UserCredz {
    
    private String email;
    
    private String password;
    
    public UserCredz() {}
    
    public UserCredz(String email, String password) {
        this.email = email;
        this.password = password;
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

    @Override
    public String toString() {
        return Objects.toStringHelper(this).add("email", email)
                .add("password", password).toString();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email, password);
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof UserCredz) {
            UserCredz that = (UserCredz) object;
            return Objects.equal(this.email, that.email)
                    && Objects.equal(this.password, that.password);
        }
        return false;
    }
}
