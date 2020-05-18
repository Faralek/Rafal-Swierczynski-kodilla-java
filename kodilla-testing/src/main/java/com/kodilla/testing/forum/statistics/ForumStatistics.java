package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    Statistics statistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    static class CalculatedStatistics {
        double averagePost;
        double averageComment;
        double averageCommentPerPost;

        public CalculatedStatistics(double averagePost, double averageComment, double averageCommentPerPost) {
            this.averagePost = averagePost;
            this.averageComment = averageComment;
            this.averageCommentPerPost = averageCommentPerPost;
        }

        public double getAveragePost() {
            return averagePost;
        }

        public double getAverageComment() {
            return averageComment;
        }

        public double getAverageCommentPerPost() {
            return averageCommentPerPost;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ForumStatistics)) return false;

        ForumStatistics that = (ForumStatistics) o;

        return statistics != null ? statistics.equals(that.statistics) : that.statistics == null;
    }

    @Override
    public int hashCode() {
        return statistics != null ? statistics.hashCode() : 0;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public CalculatedStatistics calculateAdvStatistics(Statistics statistics) {
        double averagePost1;
        if (statistics.usersNames().size() == 0) {
            averagePost1 = statistics.postsCount();
        } else {
            averagePost1 = statistics.postsCount() / statistics.usersNames().size();
        }
        double averageComment1;
        if (statistics.usersNames().size() == 0) {
            averageComment1 = statistics.commentsCount();
        } else {
            averageComment1 = statistics.commentsCount() / statistics.usersNames().size();
        }
        double averageCommentPerPost1;
        if (statistics.postsCount() == 0) {
            averageCommentPerPost1 = statistics.commentsCount();
        } else {
            averageCommentPerPost1 = statistics.commentsCount() / statistics.postsCount();
        }
        return new CalculatedStatistics(averagePost1, averageComment1, averageCommentPerPost1);
    }

    public void showStatistics() {
        System.out.println("liczba uzytkownikow wynosi: " + statistics.usersNames().size());
        System.out.println("liczba postów na forum wynosi: " + statistics.postsCount());
        System.out.println("liczba komentarzy wynosi: " + statistics.commentsCount());
        System.out.println("średnia liczba postów na użytkownika: " + calculateAdvStatistics(statistics).getAveragePost());
        System.out.println("średnia liczba postów na użytkownika: " + calculateAdvStatistics(statistics).getAverageComment());
        System.out.println("średnia liczba komentarzy na post:" + calculateAdvStatistics(statistics).getAverageCommentPerPost());

    }
}
