package com.journaldev.drivers;

public class OracleDriver implements DataBaseDriver {

    protected String url;
    protected String user;
    protected String psswrd;
    protected String drver;
    protected Integer port;


    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPsswrd() {
		return psswrd;
	}

	public void setPsswrd(String psswrd) {
		this.psswrd = psswrd;
	}

	public String getDrver() {
		return drver;
	}

	public void setDrver(String drver) {
		this.drver = drver;
	}

	public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public String getInfo() {
        return "[ Driver: Oracle" +
                ", url: " + url +
                ", port; " + port +
                ", user: " + user +
                ", psswrd: " + psswrd  +
                ", drver: " + drver +
                " ] ";
    }



}
