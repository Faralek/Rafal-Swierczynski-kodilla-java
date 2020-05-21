package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    public static List<ForumUser> getList() {
        final List<ForumUser> theList = new ArrayList<>();
        theList.add(new ForumUser(001, "Ywis", 'M', LocalDate.of(1995, 04, 13),1));
        theList.add(new ForumUser(002,"Kszo", 'M',LocalDate.of(1991,07,11),32));
        theList.add(new ForumUser(003,"Ione",'M',LocalDate.of(1995,11,05),11));
        theList.add(new ForumUser(004,"Etiss",'F',LocalDate.of(1993,05,25),32));

        return new ArrayList<ForumUser>(theList);
    }
}
