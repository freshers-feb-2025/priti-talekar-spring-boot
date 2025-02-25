package com.thinkitive.JPA;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class JdbcRepository {

    private JdbcTemplate springJdbcTemplate;

    private static String insertQuery=
            """
               insert into course(id,name) values(1,'Java code')
             """;

    public void insert(){
        springJdbcTemplate.update(insertQuery);
    }

   private static String deleteQuery=
        """
        delete from course where id=101;
        """;

    public void delete(){
        springJdbcTemplate.update(deleteQuery);
    }
}
