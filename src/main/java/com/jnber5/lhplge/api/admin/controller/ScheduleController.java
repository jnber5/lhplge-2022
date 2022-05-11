package com.jnber5.lhplge.api.admin.controller;

import com.jnber5.lhplge.api.admin.service.ScheduleService;
import com.jnber5.lhplge.gateway.responses.ScheduleResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin/schedule")
public class ScheduleController {

    private final ScheduleService scheduleService;

    public ScheduleController(ScheduleService scheduleService){
        this.scheduleService = scheduleService;
    }

    @GetMapping
    public ScheduleResponse getSchedule(){
        return scheduleService.getSchedule();
    }

}
