package com.kodilla.patterns.strategy.social.publisher;

public class TwitterPublisher implements SocialPublisher {

    @Override
    public String share() {
        System.out.println("Sharing a post on Twitter");
        return " Twitter";
    }
}
