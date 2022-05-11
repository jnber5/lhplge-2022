package com.jnber5.lhplge.gateways.feign;

import com.jnber5.lhplge.gateway.responses.ScheduleResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "LhplgeDotCom", url = "https://statsapi.web.nhl.com/api/v1")
public interface LhplheDotComClient {

    @GetMapping(value = "/schedule?gameType=R&season=20212022")
    ScheduleResponse getSchedule();

}

