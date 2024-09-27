package com.sm.kcrs.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class UserRegistrationService {
	
	@Value("${keycloak.server.uri}")
	private String keycloakServerURL;
	
	@Value("${keycloak.realm.name}")
	private String keycloakRealmName;
	
	@Value("${keycloak.client.id}")
	private String keycloakClientId;
	
	
	@Value("${keycloak.redirect.uri}")
	private String keycloakRedirectURL;
	
	public String generateActivationLink(String email) {
        String keycloakServerUrl = keycloakServerURL;
        String realm = keycloakRealmName;
        String clientId = keycloakClientId;
        String redirectUri = keycloakRedirectURL;
        
        return String.format(
            "%s/realms/%s/protocol/openid-connect/registrations?client_id=%s&response_type=code&scope=openid&redirect_uri=%s&login_hint=%s",
            keycloakServerUrl,
            realm,
            clientId,
            redirectUri,
            email
        );
    }

}
