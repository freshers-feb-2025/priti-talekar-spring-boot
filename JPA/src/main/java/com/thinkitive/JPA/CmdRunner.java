package com.thinkitive.JPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CmdRunner implements CommandLineRunner {

    @Autowired
    private JdbcRepository repository;
    @Override
    public void run(String... args) throws Exception {
         repository.insert();
         repository.delete();
    }

}
