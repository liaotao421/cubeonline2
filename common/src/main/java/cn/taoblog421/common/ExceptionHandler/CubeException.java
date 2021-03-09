package cn.taoblog421.common.ExceptionHandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author liaotao
 * @Date 2020/11/5 16:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CubeException extends RuntimeException {

    private Integer code;
    private String message;
}
