package com.nanhu.dao.story;

import com.nanhu.model.story.tables.records.StoryRecord;

/**
 * Created by liliang on 2016/11/1.
 */
public interface IStoryRepository {

    /**
     * find story by id
     * @param storyId
     * @return
     */
    public StoryRecord findStoryById(String storyId);
}
