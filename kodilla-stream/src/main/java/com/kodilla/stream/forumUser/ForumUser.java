package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public class ForumUser {
    private final int Id;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private int postCount;


    public ForumUser(int id, String userName, char sex, LocalDate birthDate, int postCount) {
        Id = id;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.postCount = postCount;

    }

    public int getId() {
        return Id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getPostCount() {
        return postCount;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumUser)) return false;

        ForumUser forumUser = (ForumUser) o;

        if (Id != forumUser.Id) return false;
        if (sex != forumUser.sex) return false;
        if (postCount != forumUser.postCount) return false;
        if (userName != null ? !userName.equals(forumUser.userName) : forumUser.userName != null) return false;
        return birthDate != null ? birthDate.equals(forumUser.birthDate) : forumUser.birthDate == null;
    }

    @Override
    public int hashCode() {
        int result = Id;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (int) sex;
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + postCount;
        return result;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "Id=" + Id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", postCount=" + postCount +
                '}';
    }
}
