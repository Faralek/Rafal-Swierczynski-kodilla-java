package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testCalculateAdvStatistics1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<>();
        int postCount = 0;
        int commentCount = 1000;
        userNames.add("Janek");
        userNames.add("Zenek");
        userNames.add("Wiesio");
        userNames.add("Andrzej");
        userNames.add("Yasiek");
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        int postCount1 = forumStatistics.statistics.postsCount();
        int commentCount1 = forumStatistics.statistics.commentsCount();
        int userCount1 = userNames.size();
        double averageCommentPerPost = forumStatistics.calculateAdvStatistics(statisticsMock).getAverageCommentPerPost();
        double averagePostCount = forumStatistics.calculateAdvStatistics(statisticsMock).getAveragePost();
        double averageCommentCount = forumStatistics.calculateAdvStatistics(statisticsMock).getAverageComment();
        //Then
        Assert.assertEquals(0, postCount1);
        Assert.assertEquals(1000, commentCount1);
        Assert.assertEquals(5, userCount1);
        Assert.assertEquals(1000, averageCommentPerPost, 1);
        Assert.assertEquals(200, averageCommentCount, 1);
        Assert.assertEquals(0, averagePostCount, 1);

    }

    @Test
    public void testCalculateAdvStatistics2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<>();
        int postCount = 100;
        int commentCount = 1000;
        userNames.add("Janek");
        userNames.add("Zenek");
        userNames.add("Wiesio");
        userNames.add("Andrzej");
        userNames.add("Yasiek");
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        int postCount1 = forumStatistics.statistics.postsCount();
        int commentCount1 = forumStatistics.statistics.commentsCount();
        int userCount1 = userNames.size();
        double averageCommentPerPost = forumStatistics.calculateAdvStatistics(statisticsMock).getAverageCommentPerPost();
        double averagePostCount = forumStatistics.calculateAdvStatistics(statisticsMock).getAveragePost();
        double averageCommentCount = forumStatistics.calculateAdvStatistics(statisticsMock).getAverageComment();
        //Then
        Assert.assertEquals(100, postCount1);
        Assert.assertEquals(1000, commentCount1);
        Assert.assertEquals(5, userCount1);
        Assert.assertEquals(10, averageCommentPerPost, 1);
        Assert.assertEquals(200, averageCommentCount, 1);
        Assert.assertEquals(20, averagePostCount, 1);

    }

    @Test
    public void testCalculateAdvStatistics3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<>();
        int postCount = 100;
        int commentCount = 0;
        for (int i = 0; i < 100; i++) {
            userNames.add("John");
        }
        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        int postCount1 = forumStatistics.statistics.postsCount();
        int commentCount1 = forumStatistics.statistics.commentsCount();
        int userCount1 = userNames.size();
        double averageCommentPerPost = forumStatistics.calculateAdvStatistics(statisticsMock).getAverageCommentPerPost();
        double averagePostCount = forumStatistics.calculateAdvStatistics(statisticsMock).getAveragePost();
        double averageCommentCount = forumStatistics.calculateAdvStatistics(statisticsMock).getAverageComment();
        //Then
        Assert.assertEquals(100, postCount1);
        Assert.assertEquals(0, commentCount1);
        Assert.assertEquals(100, userCount1);
        Assert.assertEquals(0, averageCommentPerPost, 1);
        Assert.assertEquals(0, averageCommentCount, 1);
        Assert.assertEquals(1, averagePostCount, 1);

    }

    @Test
    public void testCalculateAdvStatistics4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> userNames = new ArrayList<>();
        int postCount = 1000;
        int commentCount = 100;

        when(statisticsMock.commentsCount()).thenReturn(commentCount);
        when(statisticsMock.postsCount()).thenReturn(postCount);
        when(statisticsMock.usersNames()).thenReturn(userNames);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);
        //When
        int postCount1 = forumStatistics.statistics.postsCount();
        int commentCount1 = forumStatistics.statistics.commentsCount();
        int userCount1 = userNames.size();
        double averageCommentPerPost = forumStatistics.calculateAdvStatistics(statisticsMock).getAverageCommentPerPost();
        double averagePostCount = forumStatistics.calculateAdvStatistics(statisticsMock).getAveragePost();
        double averageCommentCount = forumStatistics.calculateAdvStatistics(statisticsMock).getAverageComment();
        //Then
        Assert.assertEquals(1000, postCount1);
        Assert.assertEquals(100, commentCount1);
        Assert.assertEquals(0, userCount1);
        Assert.assertEquals(0.1, averageCommentPerPost, 1);
        Assert.assertEquals(100, averageCommentCount, 1);
        Assert.assertEquals(1000, averagePostCount, 1);

    }
}
