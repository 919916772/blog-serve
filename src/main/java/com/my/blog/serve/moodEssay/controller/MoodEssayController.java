package com.my.blog.serve.moodEssay.controller;

import com.alibaba.fastjson.JSONObject;
import com.my.blog.serve.messageBoard.entity.MessageBoard;
import com.my.blog.serve.moodEssay.entity.MoodEssay;
import com.my.blog.serve.moodEssay.service.MoodEssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/moodEssay")
public class MoodEssayController {
    @Autowired
    private MoodEssayService moodEssayService;
    @RequestMapping(value="getAllMoodEssay",method = RequestMethod.POST)
    public String getAllMoodEssay(){
        List<MoodEssay> moodEssayList = moodEssayService.selectByExample();
        JSONObject result = new JSONObject();
        JSONObject data = new JSONObject();
        data.put("messageBoardList",moodEssayList);
        result.put("code", 20000);
        result.put("data", data);
        return result.toJSONString();
    }

    // 随笔保存
    @RequestMapping(value="moodEssaySave",method = RequestMethod.POST)
    public String moodEssaySave(@RequestBody Map<String,String> map){
        MoodEssay moodEssay = new MoodEssay();
        moodEssay.setEssayTitle(map.get("essayTitle"));
        moodEssay.setEssayContent(map.get("essayContent"));
        moodEssay.setTs(map.get("Ts"));
        moodEssayService.insertSelective(moodEssay);
        JSONObject result = new JSONObject();
        JSONObject data = new JSONObject();
        result.put("code", 20000);
        result.put("data", data);
        return result.toJSONString();
    }

    //博主删除留言
    @RequestMapping(value="moodEssayDel",method = RequestMethod.DELETE)
    public String moodEssayDel(@RequestBody Map<String,String> map){
        MoodEssay moodEssay = new MoodEssay();
        moodEssay.setPk_moodEssay(Integer.valueOf(map.get("pk_moodEssay")));
        moodEssayService.deleteByPrimaryKey(moodEssay);

        JSONObject result = new JSONObject();
        JSONObject data = new JSONObject();
        result.put("code", 20000);
        result.put("data", data);
        return result.toJSONString();
    }

}
