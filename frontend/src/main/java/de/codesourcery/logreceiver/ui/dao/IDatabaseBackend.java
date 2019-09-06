package de.codesourcery.logreceiver.ui.dao;

import de.codesourcery.logreceiver.entity.Host;

import java.util.List;
import java.util.Optional;

public interface IDatabaseBackend
{
    // users
    List<User> getAllUsers();
    Optional<User> getUserByLogin(String login);
    Optional<User> getUserById(long id);
    void saveUser(User user);
    void deleteUser(User user);
    // host group <-> user
    List<HostGroup> getHostGroups(User user);

    // host groups
    List<HostGroup> getAllHostGroups();
    Optional<HostGroup> getHostGroup(long id);
    void saveHostGroup(HostGroup group);
    void deleteHostGroup(HostGroup group);
    int getHostGroupCount();

    // subscriptions
    List<Subscription> getAllSubscriptions(boolean includeDisabled);
    List<Subscription> getSubscriptions(User user);
    void deleteSubscription(Subscription sub);
    void saveSubscription(Subscription sub);

    // not part of public API
    void createTables();
}