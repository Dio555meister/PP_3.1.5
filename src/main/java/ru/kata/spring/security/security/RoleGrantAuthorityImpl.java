package ru.kata.spring.security.security;

import org.springframework.security.core.GrantedAuthority;
import ru.kata.spring.security.models.Role;
// класс используется в контексте аутентификации и авторизации в SS для предоставления авторитетов (прав) ролей пользователей.
// Когда пользователь проходит аутентификацию, его роли преобразуются в объекты GrantedAuthority,
// которые затем используются для проверки прав доступа при выполнении операций в системе.

public class RoleGrantAuthorityImpl implements GrantedAuthority {

    private final Role role;

    public RoleGrantAuthorityImpl(Role role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role.getName();
    }
}
