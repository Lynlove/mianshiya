package com.lyn.mianshiya.mapper;

import com.lyn.mianshiya.model.entity.Question;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

/**
* @author lyn
* @description 针对表【question(题目)】的数据库操作Mapper
* @createDate 2024-12-09 18:09:36
* @Entity com.lyn.mianshiya.model.entity.Question
*/
public interface QuestionMapper extends BaseMapper<Question> {

    @Select("select * from mianshiya.question where question.updateTime >= #{minUpdateTime}")
    List<Question> listQuestionWithDelete(Date minUpdateTime);

}




