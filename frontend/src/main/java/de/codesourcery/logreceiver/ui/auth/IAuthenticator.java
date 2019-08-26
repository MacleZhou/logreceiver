package de.codesourcery.logreceiver.ui.auth;

import de.codesourcery.logreceiver.ui.dao.User;

import java.util.Optional;

public interface IAuthenticator
{
    Optional<User> authenticate(String login, String password, String httpSessionId);
}
