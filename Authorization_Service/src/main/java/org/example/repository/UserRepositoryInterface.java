package org.example.repository;

import org.example.model.Authorities;

import java.util.List;

public interface UserRepositoryInterface {
    public List<Authorities> getUserAuthorities(String user, String password);
}