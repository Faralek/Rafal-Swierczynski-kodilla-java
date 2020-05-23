package com.kodilla.stream.forum;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ForumUser {
    private final String userName;
    private final String realName;
    private final String location;
    private final Set<ForumUser> friends = new HashSet<>();

    public ForumUser(String userName, String realName, String location) {
        this.userName = userName;
        this.realName = realName;
        this.location = location;
    }
    public Set<String> getLocationsOfFriendsOfFriends() {
        return friends.stream()
                .flatMap(user -> user.getFriends().stream())
                .filter(user -> user != this)
                .map(ForumUser::getLocation)
                .collect(Collectors.toSet());
    }
    public Set<String> getLocationsOfFriends() {
        return friends.stream()
                .map(friend -> friend.getLocation())
                .collect(Collectors.toSet());
    }

    public void addFriend(ForumUser user) {
        friends.add(user);
    }

    public void removeFriend(ForumUser user) {
        friends.remove(user);
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }

    public String getLocation() {
        return location;
    }

    public Set<ForumUser> getFriends() {
        return friends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;

        ForumUser forumUser = (ForumUser) o;

        if (userName != null ? !userName.equals(forumUser.userName) : forumUser.userName != null) return false;
        if (realName != null ? !realName.equals(forumUser.realName) : forumUser.realName != null) return false;
        if (location != null ? !location.equals(forumUser.location) : forumUser.location != null) return false;
        return friends != null ? friends.equals(forumUser.friends) : forumUser.friends == null;
    }

    @Override
    public int hashCode() {
        int result = userName != null ? userName.hashCode() : 0;
        result = 31 * result + (realName != null ? realName.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", location='" + location + '\'' +
                ", friends=" + friends +
                '}';
    }
}
