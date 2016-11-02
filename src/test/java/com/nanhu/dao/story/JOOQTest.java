package com.nanhu.dao.story;

import static com.nanhu.model.story.tables.Story.STORY;


import com.nanhu.model.DTO.story.StoryVo;
import com.nanhu.model.story.tables.pojos.Story;
import com.nanhu.model.story.tables.records.StoryRecord;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.jooq.DSLContext;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

/**
 * Created by lilang on 2016/10/31.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JOOQTest {

    @Autowired
    private DSLContext dslContext;

    @Autowired
    private IStoryRepository storyRepository;

    @Autowired
    private Mapper dozerBeanMapper;

    @Test
    public void testJOOQBase()
    {
        StoryRecord storyRecord =
                storyRepository.findStoryById(null);
        assertNotNull(storyRecord);
    }

    @Test
    public void selectOneField()
    {
        StoryVo storyRecord =
                dslContext.selectFrom(STORY).where(STORY.ID.equal("1")).fetchOne().into(StoryVo.class);
        storyRecord.getId();
    }
}
