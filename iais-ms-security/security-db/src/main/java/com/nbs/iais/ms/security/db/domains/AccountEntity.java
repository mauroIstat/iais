package com.nbs.iais.ms.security.db.domains;

import com.nbs.iais.ms.common.db.domains.abstracts.AbstractDomainObject;
import com.nbs.iais.ms.common.db.domains.interfaces.security.Account;
import com.nbs.iais.ms.common.enums.AccountRole;
import com.nbs.iais.ms.common.enums.AccountStatus;

import javax.persistence.*;

@Entity(name = "account")
@Table(name = "account")
public class AccountEntity extends AbstractDomainObject implements Account {

    @Column(unique = true, name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "account_status")
    private AccountStatus status;

    @Enumerated(EnumType.STRING)
    @Column(name = "account_role")
    private AccountRole role;

    @Column(name = "signin_fails")
    private int signinFails;

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername(final String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(final String password) {
        this.password = password;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public AccountStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(final AccountStatus status) {
        this.status = status;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(final String email) {
        this.email = email;
    }

    @Override
    public AccountRole getRole() {
        return role;
    }

    @Override
    public void setRole(final AccountRole role) {
        this.role = role;
    }

    @Override
    public int getSigninFails() {
        return signinFails;
    }

    @Override
    public void setSigninFails(final int signinFails) {
        this.signinFails = signinFails;
    }
}
