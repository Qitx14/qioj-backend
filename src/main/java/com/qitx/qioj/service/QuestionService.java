package com.qitx.qioj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qitx.qioj.model.dto.question.QuestionQueryRequest;
import com.qitx.qioj.model.entity.Question;
import com.qitx.qioj.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 21977
 * @description 针对表【question(题目)】的数据库操作Service
 * @createDate 2024-01-31 15:51:17
 */
public interface QuestionService extends IService<Question> {


    /**
     * 校验
     *
     * @param question
     * @param add
     */
    void validQuestion(Question question, boolean add);

    /**
     * 获取查询条件
     *
     * @param questionQueryRequest
     * @return
     */
    QueryWrapper<Question> getQueryWrapper(QuestionQueryRequest questionQueryRequest);

    /**
     * 获取题目封装
     * 对单条数据脱敏
     *
     * @param question
     * @param request
     * @return
     */
    QuestionVO getQuestionVO(Question question, HttpServletRequest request);

    /**
     * 分页获取题目封装
     * 对分页的数据脱敏
     *
     * @param questionPage
     * @param request
     * @return
     */
    Page<QuestionVO> getQuestionVOPage(Page<Question> questionPage, HttpServletRequest request);

}
