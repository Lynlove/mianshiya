package com.lyn.mianshiya.esdao;

import com.lyn.mianshiya.model.dto.question.QuestionEsDTO;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * 题目 ES 操作
 */
public interface QuestionEsDao 
extends ElasticsearchRepository<QuestionEsDTO, Long> {
    /**
     * 根据用户 id 查询
     * @param userId
     * @return
     * 根据方法名自动映射为查询操作
     */
    List<QuestionEsDTO> findByUserId(Long userId);

}