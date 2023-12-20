package org.project.domain;
import java.util.EnumSet;
import java.util.List;

public class User {
    private String username;
    private EnumSet<Role> roles;

    public User(String username) {
        this.username = username;
        this.roles = EnumSet.of(Role.REGULAR_USER); // Initialize as Regular_User as default
    }

    // Getters and Setters
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    public EnumSet<Role> getRoles() {
        return roles;
    }

    // Operations
    public void addRole(Role role) {
        roles.add(role);
    }
    public void removeRole(Role role) {
        roles.remove(role);
    }
}
