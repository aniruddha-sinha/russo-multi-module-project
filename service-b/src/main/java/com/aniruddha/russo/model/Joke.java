package com.aniruddha.russo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Joke {
    @JsonProperty("type")
    private String type;

    @JsonProperty("setup")
    private String setup;

    @JsonProperty("punchline")
    private String punchline;

    @JsonProperty("id")
    private int id;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
