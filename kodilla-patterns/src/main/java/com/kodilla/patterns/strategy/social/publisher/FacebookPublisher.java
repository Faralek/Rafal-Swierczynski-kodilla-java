package com.kodilla.patterns.strategy.social.publisher;

public class FacebookPublisher implements SocialPublisher {

    @Override
    public String share() {
        System.out.println("Sharing a post on Facebook");
        return " Facebook";
    }
}
