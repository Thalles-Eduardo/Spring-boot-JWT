package br.com.jwt.DTO;

import br.com.jwt.model.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
    
}
