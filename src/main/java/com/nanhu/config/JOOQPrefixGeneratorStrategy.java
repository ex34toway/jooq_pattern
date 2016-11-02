package com.nanhu.config;

import org.jooq.util.DefaultGeneratorStrategy;
import org.jooq.util.Definition;

/**
 * Created by liliang on 2016/11/1.
 */
public class JOOQPrefixGeneratorStrategy extends DefaultGeneratorStrategy{
    @Override
    public String getJavaClassName(Definition definition, Mode mode) {
        if(mode == Mode.POJO)
        {
            return super.getJavaClassName(definition, mode) + "Vo";
        }
        return super.getJavaClassName(definition, mode);
    }


}
