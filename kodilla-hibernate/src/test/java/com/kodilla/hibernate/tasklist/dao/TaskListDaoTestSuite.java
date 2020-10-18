package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String DESCRIPTION = "Usual description";
    private static final String LISTNAME = "Usual list name";

    @Test
    public void testTaskListDaoSave(){
        //given
        TaskList taskList = new TaskList(LISTNAME,DESCRIPTION);

        //when
        taskListDao.save(taskList);

        //then
        int id = taskList.getId();
        Optional<TaskList> readTaskList = taskListDao.findById(id);
        Assert.assertTrue(readTaskList.isPresent());

        //clean up
        taskListDao.deleteById(id);
    }
    @Test
    public void testFindByListName(){
        //given
        TaskList taskList = new TaskList(LISTNAME,DESCRIPTION);
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //when
        List<TaskList> readTaskList = taskListDao.findByListName(listName);

        //then
        Assert.assertEquals(1,readTaskList.size());

        //clean up
        int id = readTaskList.get(0).getId();
        taskListDao.deleteById(id);
    }
}
