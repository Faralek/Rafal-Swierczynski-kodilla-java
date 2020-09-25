package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.SocialPublisher;

public class User {
    final private String name;
    protected SocialPublisher socialPublisher;

    public void setPublisher(SocialPublisher socialPublisher){
        this.socialPublisher = socialPublisher;
    }

    public String sharePost(){
        return name + socialPublisher.share();
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}