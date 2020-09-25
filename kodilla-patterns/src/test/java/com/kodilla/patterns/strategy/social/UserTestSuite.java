package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        System.out.println("First test");

        User john = new Millenials("John Mckenzie");
        User jack = new YGeneration("Jack Sparrow");
        User patrick = new ZGeneration("Patrick Smith");
        //When

        String johnSharePost = john.sharePost();
        String jackSharePost = jack.sharePost();
        String patrickSharePost = patrick.sharePost();
        //Then

        Assert.assertEquals("John Mckenzie" + " Instagram", johnSharePost);
        Assert.assertEquals("Jack Sparrow" + " Facebook", jackSharePost);
        Assert.assertEquals("Patrick Smith" + " Twitter", patrickSharePost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        System.out.println("Second test");

        User john = new Millenials("John Mckenzie");
        User jack = new YGeneration("Jack Sparrow");
        User patrick = new ZGeneration("Patrick Smith");
        //When

        john.setPublisher(new FacebookPublisher());

        String johnSharePost = john.sharePost();
        String jackSharePost = jack.sharePost();
        String patrickSharePost = patrick.sharePost();
        //Then

        Assert.assertEquals("John Mckenzie" + " Facebook", johnSharePost);
        Assert.assertEquals("Jack Sparrow" + " Facebook", jackSharePost);
        Assert.assertEquals("Patrick Smith" + " Twitter", patrickSharePost);
    }
}
