
package com.jnber5.lhplge.gateway.responses.schedule;

import com.jnber5.lhplge.gateway.responses.schedule.Away;
import com.jnber5.lhplge.gateway.responses.schedule.Home;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Teams {

    private Away away;
    private Home home;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public Away getAway() {
        return away;
    }

    public void setAway(Away away) {
        this.away = away;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
