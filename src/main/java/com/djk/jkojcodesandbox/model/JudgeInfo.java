package com.djk.jkojcodesandbox.model;

import lombok.Data;

/**
 * 题目用例
 */
@Data
public class JudgeInfo {

    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 内存限制
     */
    private Long memory;

    /**
     * 消耗时间（KB）
     */
    private Long time;

}
