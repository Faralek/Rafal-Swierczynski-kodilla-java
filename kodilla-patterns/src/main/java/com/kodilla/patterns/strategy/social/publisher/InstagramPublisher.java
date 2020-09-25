package com.kodilla.patterns.strategy.social.publisher;

public class InstagramPublisher implements SocialPublisher {

    @Override
    public String share() {
        System.out.println("Sharing a photo on instagram");
        return " Instagram";
    }
}
