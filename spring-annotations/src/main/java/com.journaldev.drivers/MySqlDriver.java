package com.journaldev.drivers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:mysqldatabase.properties")
public class MySqlDriver implements DataBaseDriver {

    @Value("${databaseName}")
    private String dbNme;
    @Value("${disableStatementPooling}")
    private String disableStatementPooling;



    public String getInfo() {
        return "[ Driver: mySql" +
                ", databaseName: " + dbNme +
                ", disableStatementPooling: " + disableStatementPooling +
                " ]";
    }
}
