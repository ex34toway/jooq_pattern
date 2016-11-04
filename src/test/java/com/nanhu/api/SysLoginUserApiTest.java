package com.nanhu.api;

import com.nanhu.config.JOOQExecuteListener;
import org.jooq.ExecuteType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by liliang on 2016/11/5.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SysLoginUserApiTest {

    private final static Logger logger = LoggerFactory.getLogger(SysLoginUserApiTest.class);

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void contextLoads() {
        String body = this.restTemplate.getForObject("/api/sys/user/81ee4dbae8474cd996fa288696545362", String.class);
        System.out.println(body);

        for (ExecuteType type : ExecuteType.values()) {
            logger.info(type.name(), JOOQExecuteListener.STATISTICS.get(type) + " executions");
        }
    }
}
