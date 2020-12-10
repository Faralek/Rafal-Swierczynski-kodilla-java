package com.kodilla.patterns2.observer.forum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ForumUserTestSuite {
    @Test
    public void testUpdate(){
        //Given
        JavaToolsForumTopic javaToolsForum = new JavaToolsForumTopic();
        JavaHelpForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(johnSmith);
        javaHelpForum.registerObserver(ivoneEscobar);
        javaToolsForum.registerObserver(ivoneEscobar);
        //When
        javaHelpForum.addPost("Table of Contents");
        javaHelpForum.addPost("Full-Text Search");
        javaToolsForum.addPost("JUnit");
        javaToolsForum.addPost("Apache Spark");
        javaToolsForum.addPost("IntelliJ IDEA");
        //Then
        assertEquals(5,ivoneEscobar.getUpdateCount());
        assertEquals(3,johnSmith.getUpdateCount());
        assertEquals(2,jessiePinkman.getUpdateCount());
    }
}
