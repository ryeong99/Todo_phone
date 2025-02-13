package com.study.todolist.repository;

import com.study.todolist.entity.TOdoCounts;
import com.study.todolist.entity.Todo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TodoMapper {
    int save(Todo todo);
    List<Todo> findAll();
    TOdoCounts getTodoCounts();
}
