package framework.models;

import lombok.Getter;

@Getter
public class EnvData {
    private String protocol = "https";
    private String domain = "the-internet.herokuapp.com/";
    private int wait = 30;
    private String host;

    public String getHost() {
        return protocol + "://" + domain;
    }
}
