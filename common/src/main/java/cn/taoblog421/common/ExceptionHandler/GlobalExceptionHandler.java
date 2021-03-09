package cn.taoblog421.common.ExceptionHandler;

import cn.taoblog421.common.result.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author liaotao
 * @Date 2020/11/4 21:26
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody //为了返回数据
    @ExceptionHandler(Exception.class) // 指定出现什么异常执行这个方法
    public R error(Exception e) {
        e.printStackTrace();
        return R.error().message("执行了全局异常处理..");
    }

    @ResponseBody //为了返回数据
    @ExceptionHandler(CubeException.class) // 指定出现什么异常执行这个方法
    public R gulierror(CubeException e) {
        e.printStackTrace();
        return R.error().code(e.getCode()).message(e.getMessage());
    }


}