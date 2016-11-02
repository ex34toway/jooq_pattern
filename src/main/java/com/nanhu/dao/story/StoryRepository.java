package com.nanhu.dao.story;

import static com.nanhu.model.story.tables.Story.STORY;

import com.nanhu.model.story.tables.records.StoryRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created by liliang on 2016/11/1.
 */
@Repository
public class StoryRepository implements IStoryRepository{

    @Autowired
    private DSLContext dslContext;

    /**
     * find story by id
     * @param storyId
     * @return
     */
    public StoryRecord findStoryById(String storyId)
    {
        StoryRecord storyRecord =
                dslContext.selectFrom(STORY).where(STORY.ID.equal("1")).fetchOne();
        return storyRecord;
    }
}
