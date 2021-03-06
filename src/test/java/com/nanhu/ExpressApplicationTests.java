package com.nanhu;

import static org.junit.Assert.*;

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

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ExpressApplicationTests {

    private Logger logger = LoggerFactory.getLogger(ExpressApplicationTests.class);

    @Autowired
    private TestRestTemplate restTemplate;

	@Test
	public void contextLoads() {
        String body = this.restTemplate.getForObject("/api/sys/stories", String.class);
        System.out.println(body);


        for (ExecuteType type : ExecuteType.values()) {
            logger.info(type.name(), JOOQExecuteListener.STATISTICS.get(type) + " executions");
        }
    }
}
