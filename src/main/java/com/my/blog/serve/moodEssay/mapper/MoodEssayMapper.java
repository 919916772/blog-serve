package com.my.blog.serve.moodEssay.mapper;

import com.my.blog.serve.moodEssay.entity.MoodEssay;
import com.my.blog.serve.moodEssay.entity.MoodEssayExample;
import com.my.blog.serve.moodEssay.entity.MoodEssayKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MoodEssayMapper {
    long countByExample(MoodEssayExample example);

    int deleteByExample(MoodEssayExample example);

    int deleteByPrimaryKey(MoodEssayKey key);

    int insert(MoodEssay record);

    int insertSelective(MoodEssay record);

    List<MoodEssay> selectByExample(MoodEssayExample example);

    MoodEssay selectByPrimaryKey(MoodEssayKey key);

    int updateByExampleSelective(@Param("record") MoodEssay record, @Param("example") MoodEssayExample example);

    int updateByExample(@Param("record") MoodEssay record, @Param("example") MoodEssayExample example);

    int updateByPrimaryKeySelective(MoodEssay record);

    int updateByPrimaryKey(MoodEssay record);
}