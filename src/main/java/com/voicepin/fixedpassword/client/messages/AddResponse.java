package com.voicepin.fixedpassword.client.messages;

import com.fasterxml.jackson.annotation.JsonProperty;


public class AddResponse extends Response {

    @JsonProperty
    protected String voiceprintId;

    public AddResponse() {
        super();
    }

    public String getVoiceprintId() {
        return voiceprintId;
    }

    public void setVoiceprintId(String value) {
        this.voiceprintId = value;
    }

}
