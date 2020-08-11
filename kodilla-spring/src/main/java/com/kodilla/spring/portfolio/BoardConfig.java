package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class BoardConfig {


    @Bean
    public Board board(){
        return new Board(getTaskList1(),getTaskList2(),getTaskList3());
    }

    @Bean(name = "toDoList")
    public TaskList getTaskList1() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    public TaskList getTaskList2() {
        return new TaskList();
    }

    @Bean(name = "doneList")
    public TaskList getTaskList3() {
        return new TaskList();
    }

}
