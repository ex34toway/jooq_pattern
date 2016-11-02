package com.nanhu.api.story;

import com.nanhu.model.story.tables.records.StoryRecord;
import com.nanhu.service.story.StoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liliang on 2016/10/31.
 */
@RestController
@RequestMapping("/api/story")
public class StoryRestController {

    @Autowired
    private StoryService storyService;

    @RequestMapping("/stories")
    @ResponseBody
    public StoryRecord findStoryList()
    {
        StoryRecord storyRecord = storyService.findStoryById(null);
        return storyRecord;
    }

}
