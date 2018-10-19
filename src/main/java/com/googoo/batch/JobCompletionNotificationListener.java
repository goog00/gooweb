package com.googoo.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * 1
 *
 * @author sunteng
 * @create 2018-09-17 下午 2:02
 **/
@Component
public class JobCompletionNotificationListener extends JobExecutionListenerSupport {

    private static final String PERSON_SQL = "SELECT personName, personAge,personSex FROM Person";

    private static final Logger log = LoggerFactory.getLogger(JobCompletionNotificationListener.class);

    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Autowired
    public JobCompletionNotificationListener(JdbcTemplate jdbcTemplate){
        if(jdbcTemplate == null){
            this.jdbcTemplate = jdbcTemplate;
        }
    }


    @Override
    public void afterJob(JobExecution jobExecution) {
        if(jobExecution.getStatus() == BatchStatus.COMPLETED){
            log.info("!!! JoB 执行完成！");
            List<Person> results = jdbcTemplate.query(PERSON_SQL, new RowMapper<Person>() {
                @Override
                public Person mapRow(ResultSet resultSet, int i) throws SQLException {
                    return new Person(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3));
                }
            });

            log.info("入库条数--------" + results.size());

            for(Person person : results){
                log.info("新增<" + person.getPersonName() + "> 成功");
            }
        }
    }

    @Override
    public void beforeJob(JobExecution jobExecution){
        super.beforeJob(jobExecution);
    }

}
