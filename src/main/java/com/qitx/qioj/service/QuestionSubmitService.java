package com.qitx.qioj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.qitx.qioj.model.dto.question.QuestionQueryRequest;
import com.qitx.qioj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.qitx.qioj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.qitx.qioj.model.entity.Question;
import com.qitx.qioj.model.entity.QuestionSubmit;
import com.qitx.qioj.model.entity.User;
import com.qitx.qioj.model.vo.QuestionSubmitVO;
import com.qitx.qioj.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author 21977
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2024-01-31 15:52:01
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);

    /**
     * 获取题目提交信息封装
     * 对单条数据脱敏
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目提交信息封装
     * 对分页的数据脱敏
     *
     * @param questionSubmitPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);

}
