package com.jnber5.lhplge.api.admin.service;

import com.jnber5.lhplge.gateways.feign.LhplheDotComClient;
import com.jnber5.lhplge.gateway.responses.ScheduleResponse;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {
    private final LhplheDotComClient lhplheDotComClient;

    public ScheduleService(LhplheDotComClient lhplheDotComClient) {
        this.lhplheDotComClient = lhplheDotComClient;
    }

    public ScheduleResponse getSchedule() {
        return lhplheDotComClient.getSchedule();
    }

}
