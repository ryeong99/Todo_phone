package com.study.todolist.entity;

import com.study.todolist.dto.response.todo.RespTOdoCountsDto;
import lombok.Data;

@Data
public class TOdoCounts {
    private int all;
    private int today;
    private int important;
    private int busy;
    private int complete;

    public RespTOdoCountsDto toDto() {
        return RespTOdoCountsDto.builder()
                .all(all)
                .today(today)
                .important(important)
                .busy(busy)
                .complete(complete)
                .build();
    }
}

