package com.nanhu;

import static org.junit.Assert.*;

import com.nanhu.config.JOOQExecuteListener;
import com.nanhu.dao.story.IStoryRepository;
import com.nanhu.model.story.tables.records.StoryRecord;
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

    @Autowired
    private IStoryRepository storyRepository;

	@Test
	public void contextLoads() {
        String body = this.restTemplate.getForObject("/api/story/stories", String.class);
        System.out.println(body);


        for (ExecuteType type : ExecuteType.values()) {
            logger.info(type.name(), JOOQExecuteListener.STATISTICS.get(type) + " executions");
        }
    }

    @Test
    public void testJOOQBase()
    {
        StoryRecord storyRecord =
                storyRepository.findStoryById(null);
        assertNotNull(storyRecord);
    }
}
