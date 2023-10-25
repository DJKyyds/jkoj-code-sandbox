package com.djk.jkojcodesandbox;


import com.djk.jkojcodesandbox.model.ExecuteCodeRequest;
import com.djk.jkojcodesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}

