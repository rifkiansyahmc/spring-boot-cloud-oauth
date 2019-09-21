package com.rifkiansyah.authservice.Service;

import com.rifkiansyah.authservice.Repository.AuthClientRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;

public class AuthClientDetailsService implements ClientDetailsService {

    private final AuthClientRepository authClientRepository;

    public AuthClientDetailsService(AuthClientRepository authClientRepository) {
        this.authClientRepository = authClientRepository;
    }

    @Override
    public ClientDetails loadClientByClientId(String clientId) {
        return authClientRepository.findByClientId(clientId).orElseThrow(IllegalArgumentException::new);
    }
}
