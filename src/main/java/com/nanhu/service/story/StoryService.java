package com.nanhu.service.story;

import com.nanhu.dao.story.IStoryRepository;
import com.nanhu.model.story.tables.records.StoryRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by liliang on 2016/11/1.
 */
@Service
public class StoryService {

    @Autowired
    private IStoryRepository storyRepository;

    /**
     * find story by id
     * @param storyId
     * @return
     */
    public StoryRecord findStoryById(String storyId)
    {
        return storyRepository.findStoryById(storyId);
    }
}
