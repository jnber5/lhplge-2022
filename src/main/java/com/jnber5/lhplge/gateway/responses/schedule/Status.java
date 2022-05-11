
package com.jnber5.lhplge.gateway.responses.schedule;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Status {

    private String abstractGameState;
    private String codedGameState;
    private String detailedState;
    private String statusCode;
    private Boolean startTimeTBD;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getAbstractGameState() {
        return abstractGameState;
    }

    public void setAbstractGameState(String abstractGameState) {
        this.abstractGameState = abstractGameState;
    }

    public String getCodedGameState() {
        return codedGameState;
    }

    public void setCodedGameState(String codedGameState) {
        this.codedGameState = codedGameState;
    }

    public String getDetailedState() {
        return detailedState;
    }

    public void setDetailedState(String detailedState) {
        this.detailedState = detailedState;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Boolean getStartTimeTBD() {
        return startTimeTBD;
    }

    public void setStartTimeTBD(Boolean startTimeTBD) {
        this.startTimeTBD = startTimeTBD;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
