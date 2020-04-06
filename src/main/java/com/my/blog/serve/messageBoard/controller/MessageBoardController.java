package com.my.blog.serve.messageBoard.controller;

import com.alibaba.fastjson.JSONObject;
import com.my.blog.serve.messageBoard.entity.MessageBoard;
import com.my.blog.serve.messageBoard.service.MessageBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/messageBoard")


public class MessageBoardController {
    @Autowired
    private MessageBoardService messageBoardService;

    // 留言板初始化
    @RequestMapping(value="getAllMessages",method = RequestMethod.POST)
    public String getAllMessages(){
        List<MessageBoard> messageBoardList = messageBoardService.selectByExample();
        JSONObject result = new JSONObject();
        JSONObject data = new JSONObject();
        data.put("messageBoardList",messageBoardList);
        result.put("code", 20000);
        result.put("data", data);
        return result.toJSONString();
    }


    // 访客留言
    @RequestMapping(value="personMessage",method = RequestMethod.POST)
    public String personMessage(@RequestBody Map<String,String> map){
        MessageBoard messageBoard = new MessageBoard();
        messageBoard.setAuthor(map.get("author"));
        messageBoard.setTs(map.get("Ts"));
        messageBoard.setMessageContent(map.get("messageContent"));

        messageBoardService.insertSelective(messageBoard);
        JSONObject result = new JSONObject();
        JSONObject data = new JSONObject();
        result.put("code", 20000);
        result.put("data", data);
        return result.toJSONString();
    }

    //博主回复留言
    @RequestMapping(value="replayMessage",method = RequestMethod.POST)
    public String replayMessage(@RequestBody Map<String,String> map){
        MessageBoard messageBoard = new MessageBoard();
        messageBoard.setPk_MessageBoard(Integer.valueOf(map.get("pk_MessageBoard")));
        messageBoard.setReplyContent(map.get("replyContent"));
        messageBoard.setStatus(Integer.valueOf(map.get("status")));
        messageBoardService.updateByPrimaryKeySelective(messageBoard);

        JSONObject result = new JSONObject();
        JSONObject data = new JSONObject();
        result.put("code", 20000);
        result.put("data", data);
        return result.toJSONString();
    }

    //博主删除留言
    @RequestMapping(value="deleteMessage",method = RequestMethod.DELETE)
    public String deleteMessage(@RequestBody Map<String,String> map){
        MessageBoard messageBoard = new MessageBoard();
        messageBoard.setPk_MessageBoard(Integer.valueOf(map.get("pk_MessageBoard")));
        messageBoardService.deleteByPrimaryKey(messageBoard);

        JSONObject result = new JSONObject();
        JSONObject data = new JSONObject();
        result.put("code", 20000);
        result.put("data", data);
        return result.toJSONString();
    }

}
