package com.my.blog.serve.messageBoard.mapper;

import com.my.blog.serve.messageBoard.entity.MessageBoard;
import com.my.blog.serve.messageBoard.entity.MessageBoardExample;
import com.my.blog.serve.messageBoard.entity.MessageBoardKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MessageBoardMapper {
    long countByExample(MessageBoardExample example);

    int deleteByExample(MessageBoardExample example);

    int deleteByPrimaryKey(MessageBoardKey key);

    int insert(MessageBoard record);

    int insertSelective(MessageBoard record);

    List<MessageBoard> selectByExample(MessageBoardExample example);

    MessageBoard selectByPrimaryKey(MessageBoardKey key);

    int updateByExampleSelective(@Param("record") MessageBoard record, @Param("example") MessageBoardExample example);

    int updateByExample(@Param("record") MessageBoard record, @Param("example") MessageBoardExample example);

    int updateByPrimaryKeySelective(MessageBoard record);

    int updateByPrimaryKey(MessageBoard record);
}